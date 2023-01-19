package net.izukika.buffet;

import net.fabricmc.api.ModInitializer;
import net.izukika.buffet.items.RegisterItems;

public class BuffetMod implements ModInitializer {
    public static final String MOD_ID = "buffet";
    @Override
    public void onInitialize() {
        RegisterItems.register();
    }
}
