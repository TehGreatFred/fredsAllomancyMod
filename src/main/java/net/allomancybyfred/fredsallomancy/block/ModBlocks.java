package net.allomancybyfred.fredsallomancy.block;

import net.allomancybyfred.fredsallomancy.FredsAllomancy;
import net.allomancybyfred.fredsallomancy.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PEWTER_BLOCK = registerBlock("pewter_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registry.BLOCK,new Identifier(FredsAllomancy.MOD_ID,name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM,new Identifier(FredsAllomancy.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    }


    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + FredsAllomancy.MOD_ID);
    }
}
