package item;

import net.elumni.dawnarchway.ArchwayOfDawn;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Moon_Stone = registerItem("moon_stone", new Item(new FabricItemSettings()));
    public static final Item Celestial_Geode = registerItem("celestial_geode", new Item(new FabricItemSettings()));
    public static final Item Celestial_Crystal = registerItem("celestial_crystal", new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ArchwayOfDawn.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ArchwayOfDawn.LOGGER.info("Registering Mod Items for"+ ArchwayOfDawn.MOD_ID);


    }
}
