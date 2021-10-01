#is this disgusting and terrible way to impliment this? Yes. Do I care? No
varnames = ["ALLOMANTIC_DUST_STEEL","ALLOMANTIC_DUST_IRON","ALLOMANTIC_DUST_PEWTER","ALLOMANTIC_DUST_TIN","ALLOMANTIC_DUST_ZINC","ALLOMANTIC_DUST_BRASS","ALLOMANTIC_DUST_COPPER",
                "ALLOMANTIC_DUST_BRONZE","ALLOMANTIC_DUST_DURALUMIN","ALLOMANTIC_DUST_ALUMINIUM","ALLOMANTIC_DUST_NICROSIL","ALLOMANTIC_DUST_CHROMIUM","ALLOMANTIC_DUST_GOLD","ALLOMANTIC_DUST_ELECTRUM",
                "ALLOMANTIC_DUST_CADMIUM","ALLOMANTIC_DUST_BENDALLOY","ALLOMANTIC_DUST_ATIUM","ALLOMANTIC_DUST_LERASIUM"]
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
   
    f = open("json files/dust/"+filePhrase.format(file = i.lower()),"w")
    f.write(best)


