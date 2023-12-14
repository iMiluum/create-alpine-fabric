package com.miluum.create_alpine_fabric.registry;

import com.miluum.create_alpine_fabric.Create_alpine_fabric;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.block.Block;

import static com.miluum.create_alpine_fabric.Create_alpine_fabric.MOD_NAME;

public class AllBlocks {
    private static final CreateRegistrate REGISTRATE = Create_alpine_fabric.registrate();
    public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new).register();

    public static void init() {
        // load the class and register everything
        Create_alpine_fabric.LOGGER.info("Registering blocks for " + MOD_NAME);
    }
}
