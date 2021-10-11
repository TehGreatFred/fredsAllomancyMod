package net.allomancybyfred.fredsallomancy.item;


import net.allomancybyfred.fredsallomancy.item.custom.MetallurgyHammer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.allomancybyfred.fredsallomancy.FredsAllomancy;

public class ModItems {


    //shit load of these are commented, I generated the code automatically so if I want to implement in future I can

    /*
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
    */
    //dust, created with dustItemBuilder

    public static final Item METALLURGY_HAMMER = registerItem( "metallurgy_hammer",
            new MetallurgyHammer());

    public static final Item ALLOMANTIC_DUST_STEEL = registerItem( "allomantic_dust_steel",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_IRON = registerItem( "allomantic_dust_iron",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY).recipeRemainder(METALLURGY_HAMMER)));
    public static final Item ALLOMANTIC_DUST_PEWTER = registerItem( "allomantic_dust_pewter",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_TIN = registerItem( "allomantic_dust_tin",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_ZINC = registerItem( "allomantic_dust_zinc",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_BRASS = registerItem( "allomantic_dust_brass",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_COPPER = registerItem( "allomantic_dust_copper",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_BRONZE = registerItem( "allomantic_dust_bronze",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_DURALUMIN = registerItem( "allomantic_dust_duralumin",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_ALUMINIUM = registerItem( "allomantic_dust_aluminium",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_NICROSIL = registerItem( "allomantic_dust_nicrosil",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_CHROMIUM = registerItem( "allomantic_dust_chromium",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_GOLD = registerItem( "allomantic_dust_gold",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_ELECTRUM = registerItem( "allomantic_dust_electrum",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_CADMIUM = registerItem( "allomantic_dust_cadmium",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_BENDALLOY = registerItem( "allomantic_dust_bendalloy",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_SILVER = registerItem( "allomantic_dust_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_BISMUTH = registerItem( "allomantic_dust_bismuth",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_LEAD= registerItem( "allomantic_dust_lead",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_NICKEL= registerItem( "allomantic_dust_nickel",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    /*
    public static final Item ALLOMANTIC_DUST_ATIUM = registerItem( "allomantic_dust_atium",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALLOMANTIC_DUST_LERASIUM = registerItem( "allomantic_dust_lerasium",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    */
    /*
    //nuggets, created with nuggetItemBuilder
    public static final Item STEEL_NUGGET = registerItem( "steel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item PEWTER_NUGGET = registerItem( "pewter_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item TIN_NUGGET = registerItem( "tin_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ZINC_NUGGET = registerItem( "zinc_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item BRASS_NUGGET = registerItem( "brass_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item COPPER_NUGGET = registerItem( "copper_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item BRONZE_NUGGET = registerItem( "bronze_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item DURALUMIN_NUGGET = registerItem( "duralumin_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ALUMINIUM_NUGGET = registerItem( "aluminium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item NICROSIL_NUGGET = registerItem( "nicrosil_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item CHROMIUM_NUGGET = registerItem( "chromium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item ELECTRUM_NUGGET = registerItem( "electrum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item CADMIUM_NUGGET = registerItem( "cadmium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item BENDALLOY_NUGGET = registerItem( "bendalloy_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    */
    public static final Item ATIUM_NUGGET = registerItem( "atium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));
    public static final Item LERASIUM_NUGGET = registerItem( "lerasium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));





    //registry stuff
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FredsAllomancy.MOD_ID, name), item);
    }




    public static void registerModItems() {

        FredsAllomancy.LOGGER.info("Registering Mod Items for " + FredsAllomancy.MOD_ID);
    }
}
