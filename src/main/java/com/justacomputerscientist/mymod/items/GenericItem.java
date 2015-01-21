package com.justacomputerscientist.mymod.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by David on 1/20/15.
 */
public class GenericItem extends Item {

    public static boolean on = false;

    public GenericItem() {
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("genericItem");
        setTextureName("mymod:genericItem");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        ItemStack items = super.onItemRightClick(itemStack, world, player);
        int x = (int) Math.floor(player.posX);
        int y = (int) (player.posY - player.getYOffset());
        int z = (int) Math.floor(player.posZ);
        Block block = player.worldObj.getBlock(x, y - 1, z);
        System.out.println(block.getLocalizedName());
        if (on) {
            on = false;
        } else {
            on = true;
        }
        return items;
    }
}
