package com.justacomputerscientist.mymod.gen;

import com.justacomputerscientist.mymod.blocks.GenericBlock;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by David on 1/20/15.
 */
public class Structure implements IWorldGenerator {
//    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
//    {
//        while (par1World.isAirBlock(par3, par4, par5) && par4 > 2)
//        {
//            --par4;
//        }
//
//        par1World.setBlock(par3, par4, par5, Blocks.diamond_block);
////        par1World.setBlockMetadataWithNotify(par3, par4 - 1, par5, Blocks.stonebrick., 1);
//        System.out.println(par3);
//        System.out.println(par4);
//        System.out.println(par5);
//        return true;
//    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId)
        {
            case -1: generateNether(world, random, chunkX*16, chunkZ*16);
            case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
        }
    }

    private void generateSurface(World world, Random random, int blockX, int blockZ)
    {
        int Xcoord = blockX + 5;
        int Ycoord = 100;
        int Zcoord = blockZ + 5;

//        System.out.println(Xcoord);
//        System.out.println(Ycoord);
//        System.out.println(Zcoord);
        if (world.isAirBlock(Xcoord, Ycoord, Zcoord)) {
            System.out.println(Xcoord + " " + Ycoord + " " + Zcoord);
            Block block = GameRegistry.findBlock("mymod", "genericOre");
            System.out.println(block.getLocalizedName());
            (new WorldStructure()).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generateNether(World world, Random random, int blockX, int blockZ)
    {
//        int Xcoord = blockX + random.nextInt(16);
//        int Ycoord = random.nextInt(60);
//        int Zcoord = blockZ + random.nextInt(16);
//
//        (new WorldGenMinableNether(Tutorial.oreblock.blockID, 1, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
    }

}
