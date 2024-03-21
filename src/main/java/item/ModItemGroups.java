package item;

import block.ModBlocks;
import net.elumni.dawnarchway.ArchwayOfDawn;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Archway_Of_The_Dawn_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArchwayOfDawn.MOD_ID, "archway"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.archway"))
                    .icon(() -> new ItemStack(ModItems.Celestial_Geode)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Moon_Stone);
                        entries.add(ModItems.Celestial_Geode);
                        entries.add(ModItems.Celestial_Crystal);
                        entries.add(ModBlocks.Moon_Stone_Block);
                        entries.add(ModBlocks.Celestial_Crystal_Block);
                        entries.add(ModBlocks.Astral_Pot );
                        entries.add(ModBlocks.Astral_Stalgam);
                        entries.add(ModBlocks.Astral_Gate1);
                        entries.add(ModBlocks.Astral_Gate2);
                    }).build());


    public static void registerItemGroups(){
        ArchwayOfDawn.LOGGER.info("Registering Item Groups for"+ArchwayOfDawn.MOD_ID);
    }
}
