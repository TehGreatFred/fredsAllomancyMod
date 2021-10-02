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

import java.util.logging.Logger;

public class ModBlocks {

    public static final Block PEWTER_BLOCK = registerBlock("pewter_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block CHROMIUM_ORE = registerBlock("chromium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,3).requiresTool()));
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,2).requiresTool()));
    public static final Block CADMIUM_ORE = registerBlock("cadmium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,3).requiresTool()));
    public static final Block BISMUTH_ORE = registerBlock("bismuth_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).breakByTool(FabricToolTags.PICKAXES,3).requiresTool()));






    //registry stuff
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registry.BLOCK,new Identifier(FredsAllomancy.MOD_ID,name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM,new Identifier(FredsAllomancy.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    }


    public static void registerModBlocks(){
        FredsAllomancy.LOGGER.info("Registering Mod Items for " + FredsAllomancy.MOD_ID);

    }
}
