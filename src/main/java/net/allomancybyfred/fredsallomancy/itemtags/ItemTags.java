package net.allomancybyfred.fredsallomancy.itemtags;

import net.allomancybyfred.fredsallomancy.FredsAllomancy;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ItemTags {
    public static final Tag<Item> ALLOMANTIC_METALS = TagFactory.ITEM.create(new Identifier(FredsAllomancy.MOD_ID,"allomantic_metals"));
}