package net.allomancybyfred.fredsallomancy.tags;

import net.allomancybyfred.fredsallomancy.FredsAllomancy;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class BlockTags {
    public static final Tag<Block> SILVER_ORE = TagFactory.BLOCK.create(new Identifier("fredsallomancy","silver_ore"));
    public static final Tag<Block> ALUMINIUM_ORE = TagFactory.BLOCK.create(new Identifier("fredsallomancy","aluminium_ore"));
    public static final Tag<Block> LEAD_ORE = TagFactory.BLOCK.create(new Identifier("fredsallomancy","lead_ore"));
    public static final Tag<Block> ZINC_ORE = TagFactory.BLOCK.create(new Identifier("fredsallomancy","zinc_ore"));

    public static void registerModBlockTags() {
        FredsAllomancy.LOGGER.info("Registering Mod Items for " + FredsAllomancy.MOD_ID);
    }
}
