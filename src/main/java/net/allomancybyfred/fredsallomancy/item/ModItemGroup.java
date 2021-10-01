package net.allomancybyfred.fredsallomancy.item;

import net.allomancybyfred.fredsallomancy.FredsAllomancy;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALLOMANCY = FabricItemGroupBuilder.build(new Identifier(FredsAllomancy.MOD_ID, "allomancy"),
            () -> new ItemStack(ModItems.PEWTER_INGOT));
}
