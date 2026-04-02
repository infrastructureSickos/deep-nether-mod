package com.infrastructuresickos.deepnether;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DeepNether.MOD_ID)
public class DeepNether {

    public static final String MOD_ID = "deepnether";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public DeepNether() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Deep Nether initializing...");
    }
}
