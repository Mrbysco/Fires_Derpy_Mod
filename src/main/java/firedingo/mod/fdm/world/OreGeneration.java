package firedingo.mod.fdm.world;

import cpw.mods.fml.common.IWorldGenerator;
import firedingo.mod.fdm.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by Firedingo on 25/02/2016.
 */
public class OreGeneration implements IWorldGenerator {

    private WorldGenerator oreGenerator; //Generates The Derpy Ores
    private WorldGenerator oreGenerator1; //Generates The Derpy Ores

    public OreGeneration () {
        this.oreGenerator = new WorldGenMinable(ModBlocks.DerpyOre, 6, Blocks.air);
        this.oreGenerator1 = new WorldGenMinable(ModBlocks.DerpyOre2, 6, Blocks.air);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 0: //overworld
                this.generatorRandomizer(this.oreGenerator, world, random, chunkX, chunkZ, 15, 64, 120);
                this.generatorRandomizer(this.oreGenerator1, world, random, chunkX, chunkZ, 15, 64, 120);
                break;
            case 1: //End

                break;
            case -1: //Nether

                break;
        }
    }

    private void generatorRandomizer(WorldGenerator generator, World world, Random rand, int chunk_x, int chunk_z, int chanceToSpawn, int minHeight, int maxHeight) {
        if (minHeight >= 64 && maxHeight < 256 && minHeight < maxHeight) {
            int heightDiff = maxHeight - minHeight + 1;
            for (int i = 0; i < chanceToSpawn; i++) {
                int x = chunk_x * 16 + rand.nextInt(16);
                int y = minHeight + rand.nextInt(heightDiff);
                int z = chunk_z * 16 + rand.nextInt(16);
                generator.generate(world, rand, x, y, z);
            }
        }
    }
}
