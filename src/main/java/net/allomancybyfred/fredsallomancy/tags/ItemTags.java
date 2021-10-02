package net.allomancybyfred.fredsallomancy.tags;

import net.allomancybyfred.fredsallomancy.FredsAllomancy;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ItemTags {
    public static final Tag<Item> SILVER_ORE = TagFactory.ITEM.create(new Identifier("fredsallomancy","silver_ore"));
    public static final Tag<Item> ALUMINIUM_ORE = TagFactory.ITEM.create(new Identifier("fredsallomancy","aluminium_ore"));
    public static final Tag<Item> LEAD_ORE = TagFactory.ITEM.create(new Identifier("fredsallomancy","lead_ore"));
    public static final Tag<Item> ZINC_ORE = TagFactory.ITEM.create(new Identifier("fredsallomancy","zinc_ore"));

    public static void registerModItemTags() {
        FredsAllomancy.LOGGER.info("Registering Mod Items for " + FredsAllomancy.MOD_ID);
    }
}
