#is this disgusting and terrible way to impliment this? Yes. Do I care? No
varnamesDust = ["ALLOMANTIC_DUST_STEEL","ALLOMANTIC_DUST_IRON","ALLOMANTIC_DUST_PEWTER","ALLOMANTIC_DUST_TIN","ALLOMANTIC_DUST_ZINC","ALLOMANTIC_DUST_BRASS","ALLOMANTIC_DUST_COPPER",
                "ALLOMANTIC_DUST_BRONZE","ALLOMANTIC_DUST_DURALUMIN","ALLOMANTIC_DUST_ALUMINIUM","ALLOMANTIC_DUST_NICROSIL","ALLOMANTIC_DUST_CHROMIUM","ALLOMANTIC_DUST_GOLD","ALLOMANTIC_DUST_ELECTRUM",
                "ALLOMANTIC_DUST_CADMIUM","ALLOMANTIC_DUST_BENDALLOY","ALLOMANTIC_DUST_ATIUM","ALLOMANTIC_DUST_LERASIUM"]
varnamesNugs = ["STEEL_NUGGET","PEWTER_NUGGET","TIN_NUGGET","ZINC_NUGGET","BRASS_NUGGET","COPPER_NUGGET",
"BRONZE_NUGGET","DURALUMIN_NUGGET","ALUMINIUM_NUGGET","NICROSIL_NUGGET","CHROMIUM_NUGGET","ELECTRUM_NUGGET",
"CADMIUM_NUGGET","BENDALLOY_NUGGET","ATIUM_NUGGET","LERASIUM_NUGGET"]


#im lazy so editing this code manually instead of using methods
varNames = varnamesNugs

fileText = """"item.fredsallomancy.{pathDesc}": "{VanityName}","""
for i in varNames:
    vanityNameConcArr =  i.split("_")
    vanityNameConc = vanityNameConcArr[1].lower().capitalize() + " of " + vanityNameConcArr[0].lower().capitalize()
    print(fileText.format(pathDesc = i.lower(),VanityName = vanityNameConc))


input()
