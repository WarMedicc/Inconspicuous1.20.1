package com.warmedic.inconspicuous.Item;

import com.warmedic.inconspicuous.Inconspicuous;
import com.warmedic.inconspicuous.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SMOKEBOMB_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Inconspicuous.MOD_ID, "smoke_bomb"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smoke_bomb"))
                    .icon(() -> new ItemStack(ModItems.SMOKEBOMB)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SMOKEBOMB);

                        entries.add(ModBlocks.TEST_BLOCK);
                        entries.add(ModBlocks.TEST_BLOCK2);

                    }).build());

    public static void registerItemGroups(){
        Inconspicuous.LOGGER.info("Registering Item Groups for " +Inconspicuous.MOD_ID);
    }
}
