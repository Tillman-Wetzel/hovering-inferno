package de.Hacker_TTJ.hovering_inferno.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "hovering_inferno");

    public static final RegistryObject<Block> infernoBrewingStand = BLOCKS.register("inferno_brewing_stand",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(3.0f, 3.0f)
                    .requiresCorrectToolForDrops()
            ));
    public static void register(IEventBus eventBus) {Blocks.register(eventBus);
    }
}