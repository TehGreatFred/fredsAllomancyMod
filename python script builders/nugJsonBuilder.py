#is this disgusting and terrible way to impliment this? Yes. Do I care? No
varnames = ["STEEL_NUGGET","PEWTER_NUGGET","TIN_NUGGET","ZINC_NUGGET","BRASS_NUGGET","COPPER_NUGGET",
                "BRONZE_NUGGET","DURALUMIN_NUGGET","ALUMINIUM_NUGGET","NICROSIL_NUGGET","CHROMIUM_NUGGET","ELECTRUM_NUGGET",
                "CADMIUM_NUGGET","BENDALLOY_NUGGET","ATIUM_NUGGET","LERASIUM_NUGGET"]
filePhrase = "{file}.json"
fileText = """
  "parent": "item/generated",
  "textures": (
    "layer0": "fredsallomancy:item/{info}"
  )
"""




for i in varnames:
    t = ""
    t = fileText.format(info = i.lower())
    
    
    better = t
    print(better)
    better = better.replace("(","{")
    better = better.replace(")","}")
    
    best = "{" + better + "\n}" 
   
    f = open("json files/nuggets/"+filePhrase.format(file = i.lower()),"w")
    f.write(best)
    f.close()


