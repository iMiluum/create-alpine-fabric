package com.miluum.create_alpine_fabric;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Create_alpine_fabric implements ModInitializer {
    public static final String MOD_ID = "create_alpine_fabric";
    public static final String MOD_NAME = "Create: Alpine";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Create: Alpine");
    }
}
