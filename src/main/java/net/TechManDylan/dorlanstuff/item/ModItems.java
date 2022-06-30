package net.TechManDylan.dorlanstuff.item;

import net.TechManDylan.dorlanstuff.DorlanStuffMod;
import net.TechManDylan.dorlanstuff.item.custom.CoalSliverItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DorlanStuffMod.MOD_ID);

    public static final RegistryObject<Item> SIMPIUM_GEM = ITEMS.register("simpium_gem",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB)));

    public static final RegistryObject<Item> GWEENITE_GEM = ITEMS.register("gweenite_gem",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB)));

    public static final RegistryObject<Item> JEPITHYST_GEM = ITEMS.register("jepithyst_gem",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB)));

    public static final RegistryObject<Item> COAL_SLIVER = ITEMS.register("coal_sliver",
            () -> new CoalSliverItem( new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB)));


    public static final RegistryObject<Item> ROCK_CANDY = ITEMS.register("rock_candy",
            () -> new Item( new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB).food(ModFoods.ROCK_CANDY)));


    public static final RegistryObject<Item> GWEENITE_SWORD = ITEMS.register("gweenite_sword",
           () -> new SwordItem(ModTiers().GWEENITE,2,3f,
                    new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB)));

    //public static final RegistryObject<Item> GWEENITE_PICKAXE = ITEMS.register("gweenite_pickaxe",
    //        () -> new PickaxeItem(ModTiers().GWEENITE,2,3f,
    //                new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB)));

    //public static final RegistryObject<Item> GWEENITE_SHOVEL = ITEMS.register("gweenite_shovel",
    //        () -> new ShovelItem(ModTiers().GWEENITE,2,3f,
    //               new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB)));

    //public static final RegistryObject<Item> GWEENITE_HOE = ITEMS.register("gweenite_hoe",
    //        () -> new HoeItem(ModTiers().GWEENITE,2,3f,
    //                new Item.Properties().tab(ModCreativeModeTab.DORLANSTUFF_TAB)));






    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

}
