package com.justacomputerscientist.mymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by David on 1/16/15.
 */
public class GenericBlock extends Block {

    public GenericBlock(Material material) {
        super(material);
        setBlockName("genericDirt");
        setBlockTextureName("mymod:genericDirt");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(0.5F);
        setStepSound(Block.soundTypeGravel);
    }

}
