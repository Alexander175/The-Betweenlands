package thebetweenlands.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import thebetweenlands.creativetabs.ModCreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBLWall extends BlockWall {

	private Block blockType;
	private int blockMeta;

	public BlockBLWall(Block block, int meta) {
		super(block);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(ModCreativeTabs.blocks);
		blockType = block;
		blockMeta = meta;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
	 return blockType.getIcon(side, blockMeta);	
	}

	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getSubBlocks(Item id, CreativeTabs creativeTab, List list) {
		list.add(new ItemStack(id, 1, blockMeta));
	}

}