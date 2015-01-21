package com.justacomputerscientist.mymod.gen;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by David on 1/20/15.
 */
public class WorldStructure extends WorldGenerator {

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        while (par1World.isAirBlock(par3, par4, par5) && par4 > 2)
        {
            par1World.setBlock(par3, par4, par5, Blocks.diamond_block);
            --par4;
        }

        return true;
    }
}
