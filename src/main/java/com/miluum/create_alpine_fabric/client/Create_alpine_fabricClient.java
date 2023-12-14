package com.miluum.create_alpine_fabric.client;

import com.miluum.create_alpine_fabric.Create_alpine_fabric;
import net.fabricmc.api.ClientModInitializer;

public class Create_alpine_fabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Create_alpine_fabric.LOGGER.info("Client");
    }
}
