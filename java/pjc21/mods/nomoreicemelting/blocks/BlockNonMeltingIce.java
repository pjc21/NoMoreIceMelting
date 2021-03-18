package pjc21.mods.nomoreicemelting.blocks;

import java.util.Random;

import net.minecraft.block.BlockIce;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockNonMeltingIce extends BlockIce {
	
	public static final ResourceLocation BLOCK_ICE = new ResourceLocation("minecraft", "ice");
	
	public BlockNonMeltingIce()
    {
		super();
		this.setHardness((float) 0.5);
		this.setResistance((float) 0.5);
		this.setHarvestLevel("pickaxe", 0);
        this.setUnlocalizedName("ice");
    }
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
		/*if (worldIn.getLightFor(EnumSkyBlock.BLOCK, pos) > 11 - this.getDefaultState().getLightOpacity())
        {
			this.turnIntoWater(worldIn, pos);
        }*/
    }
}
