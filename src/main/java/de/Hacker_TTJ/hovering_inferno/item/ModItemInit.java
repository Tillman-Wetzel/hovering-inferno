package de.Hacker_TTJ.hovering_inferno.item;

import de.Hacker_TTJ.hovering_inferno.Main;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);


    public static final RegistryObject<Item> infernoRod = ITEMS.register("inferno_rod",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> infernoPowder = ITEMS.register("inferno_powder",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> infernoScute = ITEMS.register("inferno_scute",
            () -> new Item(new Item.Properties().stacksTo(32).fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> infernoShield = ITEMS.register("inferno_shield",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
