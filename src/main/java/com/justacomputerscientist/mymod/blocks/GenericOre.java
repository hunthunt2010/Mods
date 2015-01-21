package com.justacomputerscientist.mymod.blocks;

import com.justacomputerscientist.mymod.Generic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import java.util.Random;

/**
 * Created by David on 1/16/15.
 */
public class GenericOre extends Block {

    public GenericOre(Material material)
    {
        super(material);

        setHardness(4.0F); // 33% harder than diamond
        setStepSound(Block.soundTypeStone);
        setBlockName("genericOre");
        setCreativeTab(CreativeTabs.tabBlock);
    }


    //If the block's drop is an item.
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Generic.genericIngot;
    }

}
