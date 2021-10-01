package net.allomancybyfred.fredsallomancy.item;


import net.allomancybyfred.fredsallomancy.item.custom.AllomanticDust;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.allomancybyfred.fredsallomancy.FredsAllomancy;

public class ModItems {
    //Ingots
    public static final Item PEWTER_INGOT = registerItem( "pewter_ingot",
        new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item TIN_INGOT = registerItem( "tin_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item STEEL_INGOT = registerItem( "steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item BRONZE_INGOT = registerItem( "bronze_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item DURALIMIN_INGOT = registerItem( "duralumin_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALUMINIUM_INGOT = registerItem( "aluminium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item NICROSIL_INGOT = registerItem( "nicrosil_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item CHROMIUM_INGOT = registerItem( "chromium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ELECTRUM_INGOT = registerItem( "electrum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item CADMIUM_INGOT = registerItem( "cadmium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item BENDALLOY_INGOT = registerItem( "bendalloy_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ZINC_INGOT = registerItem( "zinc_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item LERASIUM_INGOT = registerItem( "lerasium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ATIUM_INGOT = registerItem( "atium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item BRASS_INGOT = registerItem( "brass_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST = registerItem( "allomantic_dust",
            new AllomanticDust(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    //Nuggets
    public static final Item LERASIUM_NUGGET = registerItem( "lerasium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ATIUM_NUGGET = registerItem( "atium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    //registry stuff
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FredsAllomancy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + FredsAllomancy.MOD_ID);
    }
}
