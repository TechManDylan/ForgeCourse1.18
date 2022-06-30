package net.TechManDylan.dorlanstuff.block;

import net.TechManDylan.dorlanstuff.DorlanStuffMod;
import net.TechManDylan.dorlanstuff.block.custom.KillBlock;
import net.TechManDylan.dorlanstuff.item.ModCreativeModeTab;
import net.TechManDylan.dorlanstuff.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DorlanStuffMod.MOD_ID);


    //Dorlan Stuff Ore Blocks
    public static final RegistryObject<Block> SIMPIUM_ORE = registerBlock("simpium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.DORLANSTUFF_TAB);

    public static final RegistryObject<Block> GWEENITE_ORE = registerBlock("gweenite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.DORLANSTUFF_TAB);

    public static final RegistryObject<Block> JEPITHYST_ORE = registerBlock("jepithyst_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.DORLANSTUFF_TAB);

    //Dorlan Stuff Gem Blocks

    public static final RegistryObject<Block> SIMPIUM_GEM_BLOCK = registerBlock("simpium_gem_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.DORLANSTUFF_TAB);

    public static final RegistryObject<Block> GWEENITE_GEM_BLOCK = registerBlock("gweenite_gem_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.DORLANSTUFF_TAB);

    public static final RegistryObject<Block> JEPITHYST_GEM_BLOCK = registerBlock("jepithyst_gem_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.DORLANSTUFF_TAB);

    //Special Blocks
    public static final RegistryObject<Block> KILL_BLOCK = registerBlock("kill_block",
            () -> new KillBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()),ModCreativeModeTab.DORLANSTUFF_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
