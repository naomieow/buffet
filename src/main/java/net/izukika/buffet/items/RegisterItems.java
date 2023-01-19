package net.izukika.buffet.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.izukika.buffet.BuffetMod.MOD_ID;

public class RegisterItems {
    public static final Item SAUSAGE_ROLL = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(2.0f).snack().meat().build()));

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID,"sausage_roll"), SAUSAGE_ROLL);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(Items.COOKED_RABBIT, SAUSAGE_ROLL);
        });
    }
}
