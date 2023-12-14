package com.miluum.create_alpine_fabric.registry;

import com.miluum.create_alpine_fabric.Create_alpine_fabric;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Field;

import static com.miluum.create_alpine_fabric.Create_alpine_fabric.LOGGER;
import static com.miluum.create_alpine_fabric.Create_alpine_fabric.MOD_ID;

public class AllItems {
    private static final CreateRegistrate REGISTRATE = Create_alpine_fabric.registrate();
    public static final ItemEntry<Item> EXAMPLE_ITEM = REGISTRATE.item("example_block", Item::new).register();
    public static final ItemEntry<Item> EXAMPLE_ITEM2 = REGISTRATE.item("example_block", Item::new).register();
    public static final ItemEntry<Item> EXAMPLE_ITEM3 = REGISTRATE.item("example_block", Item::new).register();
    public static final ItemEntry<Item> EXAMPLE_ITEM4 = REGISTRATE.item("example_block", Item::new).register();


    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("create_alpine","items"))
            .icon(AllBlocks.ANALOG_LEVER::asStack)
            .appendItems((entries) -> entries.add(AllBlocks.ANALOG_LEVER.asStack()))
            .build();

    public static void init(){
        LOGGER.info("initallitems");
    }
}