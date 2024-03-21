package block;

import block.custom.astral_pot;
import block.custom.astral_stalgam;
import net.elumni.dawnarchway.ArchwayOfDawn;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block Moon_Stone_Block = registerBlock("moon_stone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE)));
    public static final Block Celestial_Crystal_Block = registerBlock("celestial_crystal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block Astral_Pot = registerBlock("astral_pot",
            new astral_pot(FabricBlockSettings.copyOf(Blocks.DECORATED_POT).nonOpaque().hardness(3F)));
    public static final Block Astral_Stalgam = registerBlock("astral_stalgam",
            new astral_stalgam(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).nonOpaque().hardness(3F)));



    private static Block registerBlock(String name, Block block){
       registerBlockItem(name, block);
       return Registry.register(Registries.BLOCK, new Identifier(ArchwayOfDawn.MOD_ID, name),block);
    }
    private static Item registerBlockItem(String name, Block block){
       return Registry.register(Registries.ITEM, new Identifier(ArchwayOfDawn.MOD_ID, name ),
               new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        ArchwayOfDawn.LOGGER.info("Registering ModBlocks for"+ ArchwayOfDawn.MOD_ID);
    }
}
