package thebetweenlands.blocks; 
import java.util.Random;

import net.minecraft.block.BlockTorch;
import net.minecraft.world.World;
import thebetweenlands.TheBetweenlands;
import thebetweenlands.creativetabs.ModCreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDampTorch extends BlockTorch {
	
    public BlockDampTorch() {
        super();
        setHardness(0.0F);
        setLightLevel(0);
        setStepSound(soundTypeWood);
        setBlockName("thebetweenlands.dampTorch");
        setBlockTextureName("thebetweenlands:dampTorch");
        setCreativeTab(ModCreativeTabs.blocks);
        setTickRandomly(true);
    }

    @SideOnly(Side.CLIENT)
	@Override
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        int meta = world.getBlockMetadata(x, y, z);
        double posX = (double)((float)x + 0.5F);
        double posY = (double)((float)y + 0.8F);
        double posZ = (double)((float)z + 0.5F);
        double offSetY = 0.3199999988079071D;
        double offSetXZ = rand.nextDouble() * 0.5D - rand.nextDouble() * 0.5D;

        if (meta == 1)
    		TheBetweenlands.proxy.spawnCustomParticle("smoke", world, posX - offSetXZ, posY + offSetY, posZ, 0.0D, 0.0D, 0.0D, 0);

        else if (meta == 2)
    		TheBetweenlands.proxy.spawnCustomParticle("smoke", world, posX + offSetXZ, posY + offSetY, posZ, 0.0D, 0.0D, 0.0D, 0);

        else if (meta == 3)
    		TheBetweenlands.proxy.spawnCustomParticle("smoke", world, posX, posY + offSetY, posZ - offSetXZ, 0.0D, 0.0D, 0.0D, 0);

        else if (meta == 4)
    		TheBetweenlands.proxy.spawnCustomParticle("smoke", world, posX, posY + offSetY, posZ + offSetXZ, 0.0D, 0.0D, 0.0D, 0);
        else
    		TheBetweenlands.proxy.spawnCustomParticle("smoke", world, posX, posY, posZ, 0.0D, 0.0D, 0.0D, 0);
    }

}
