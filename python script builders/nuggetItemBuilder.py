
varnames = ["STEEL_NUGGET","PEWTER_NUGGET","TIN_NUGGET","ZINC_NUGGET","BRASS_NUGGET","COPPER_NUGGET",
"BRONZE_NUGGET","DURALUMIN_NUGGET","ALUMINIUM_NUGGET","NICROSIL_NUGGET","CHROMIUM_NUGGET","ELECTRUM_NUGGET",
"CADMIUM_NUGGET","BENDALLOY_NUGGET","ATIUM_NUGGET","LERASIUM_NUGGET"]

phrase = ''' public static final Item {upper} = registerItem( "{lower}",
                                new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));'''
for i in varnames:
    print(phrase.format(upper = i, lower = i.lower()))
