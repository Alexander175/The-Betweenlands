package thebetweenlands.tileentities;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.util.AxisAlignedBB;
import thebetweenlands.items.BLItemRegistry;
import thebetweenlands.items.SwampTalisman.TALISMAN;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityDruidAltar extends TileEntityBasicInventory  {
	
	@SideOnly(Side.CLIENT)
	public float rotation;
	@SideOnly(Side.CLIENT)
	public float renderRotation;
	@SideOnly(Side.CLIENT)
	private static final float ROTATION_SPEED = 2.0F;
	
	public TileEntityDruidAltar() {
		super(5, "druidAltar");
	}
	
	@Override
	public void updateEntity() {
		if (worldObj.isRemote) {
			rotation += ROTATION_SPEED;
			if (rotation >= 360.0F) {
				rotation -= 360.0F;
				renderRotation -= 360.0F;
			}
		}
	}
	
	@Override
	public int getInventoryStackLimit() {
		return 1;
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack is) {
		inventory[slot] = is;
		if (is != null && is.stackSize > getInventoryStackLimit())
			is.stackSize = getInventoryStackLimit();
		if (is != null) {
			int slot1 = 0, slot2 = 0, slot3 = 0, slot4 = 0;
			if (inventory[1] != null)
				slot1 = getStackInSlot(1).getItemDamage();
			if (inventory[2] != null)
				slot2 = getStackInSlot(2).getItemDamage();
			if (inventory[3] != null)
				slot3 = getStackInSlot(3).getItemDamage();
			if (inventory[4] != null)
				slot4 = getStackInSlot(4).getItemDamage();
			if(slot1 + slot2 + slot3 + slot4 == 10) {
				ItemStack stack = new ItemStack(BLItemRegistry.swampTalisman, 1, TALISMAN.swampTalisman.ordinal());
				setInventorySlotContents(1, null);
				setInventorySlotContents(2, null);
				setInventorySlotContents(3, null);
				setInventorySlotContents(4, null);
				setInventorySlotContents(0, stack);
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord - 1, yCoord, zCoord - 1, xCoord + 2, yCoord + 3, zCoord + 2);
	}
	
	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound tag = new NBTTagCompound();
		writeToNBT(tag);
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 0, tag);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
		if (packet.func_148853_f() == 0)
			readFromNBT(packet.func_148857_g());
	}

}