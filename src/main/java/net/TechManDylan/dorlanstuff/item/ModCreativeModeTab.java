package net.TechManDylan.dorlanstuff.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DORLANSTUFF_TAB = new CreativeModeTab("dorlanstufftab") {
        @Override
                public ItemStack makeIcon() {
            return new ItemStack(ModItems.SIMPIUM_GEM.get());
        }
    };
}
