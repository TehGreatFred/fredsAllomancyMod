package net.allomancybyfred.fredsallomancy.item.custom;

import net.allomancybyfred.fredsallomancy.item.ModItemGroup;
import net.allomancybyfred.fredsallomancy.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class MetallurgyHammer extends Item {

    public MetallurgyHammer() {
        super(new FabricItemSettings().group(ModItemGroup.ALLOMANCY).maxCount(1));
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

}
