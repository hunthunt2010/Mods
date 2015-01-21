package com.justacomputerscientist.mymod;

import com.justacomputerscientist.mymod.blocks.GenericBlock;
import com.justacomputerscientist.mymod.gen.Structure;
import com.justacomputerscientist.mymod.handler.GenericHandler;
import com.justacomputerscientist.mymod.items.GenericItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;  //1.6.X
//import cpw.mods.fml.common.Mod.PostInit;
//import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "mymod", name = "mymod", version = "0.0.0")
public class Generic {

    public static Item genericIngot;
    public static Block genericDirt;
    public static Block genericOre;
    public static Item genericItem;

    @Instance("Generic")
    public static Generic instance;

    @SidedProxy(clientSide = "com.justacomputerscientist.mymod.client.ClientProxy", serverSide = "com.justacomputerscientist.mymod.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit (FMLPreInitializationEvent event) {
        // Stub Method
        genericDirt = new GenericBlock(Material.ground);
        genericOre = new GenericBlock(Material.ground).setBlockTextureName("mymod:genericOre").setBlockName("genericOre");
        genericItem = new GenericItem();


//        genericOre = new GenericOre(Material.rock);
//        genericDirt.setHarvestLevel("shovel", 0);
        GameRegistry.registerBlock(genericDirt, "genericDirt");
        GameRegistry.registerBlock(genericOre, "genericOre");
        GameRegistry.registerItem(genericItem, "genericItem");
        GameRegistry.addRecipe(new ItemStack(Blocks.stone, 64), "xyx", "y y", "xyx", 'x', genericDirt, 'y', genericOre);
        GameRegistry.registerWorldGenerator(new Structure(), 100);
//        genericOre.setHarvestLevel("pickaxe", 3);
//        GameRegistry.registerBlock(genericOre, "genericOre");
    }

    @EventHandler
    public void load (FMLInitializationEvent event) {
//        proxy.registerRenderers();

//        ItemStack dirtStack            = new ItemStack(Blocks.dirt);
//        ItemStack diamondsStack  = new ItemStack(Items.diamond, 64);
//        ItemStack blackWoolStack  = new ItemStack(Blocks.wool, 42, 15);
//        ItemStack gravelStack        = new ItemStack(Blocks.gravel);
//        ItemStack cobbleStack       = new ItemStack(Blocks.cobblestone);
//
//        GameRegistry.addShapelessRecipe(diamondsStack, dirtStack);
//
//        GameRegistry.addRecipe(new ItemStack(Blocks.stone), "xyx", "y y", "xyx",
//                'x', dirtStack, 'y', gravelStack);
//
//        GameRegistry.addSmelting(Blocks.stone, new ItemStack(Blocks.dirt), 0.1f);


        // End Basic Blocks

        proxy.registerRenderers();
//        MinecraftForge.EVENT_BUS.register(new GenericHandler());
    }

    @EventHandler
    public void postInit (FMLPostInitializationEvent event) {
        // Stub Method
    }
}