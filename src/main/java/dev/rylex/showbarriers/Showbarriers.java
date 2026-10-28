package dev.rylex.showbarriers;

import net.minecraft.resources.Identifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(Showbarriers.MOD_ID)
public final class Showbarriers {
    public static final String MOD_ID = "showbarriers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    public Showbarriers(IEventBus modBus, ModContainer container, Dist dist) {
        LOGGER.info("{} initialized", MOD_ID);
    }
}
