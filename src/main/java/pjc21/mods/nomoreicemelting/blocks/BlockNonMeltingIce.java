package pjc21.mods.nomoreicemelting.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.IceBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

@SuppressWarnings("NullableProblems")
public class BlockNonMeltingIce extends IceBlock {

    public BlockNonMeltingIce(Properties p_i48375_1_) {
        super(p_i48375_1_);
    }

    @Override
    public void randomTick(BlockState p_225542_1_, ServerWorld p_225542_2_, BlockPos p_225542_3_, Random p_225542_4_) { }
}
