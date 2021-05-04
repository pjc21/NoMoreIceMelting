package pjc21.mods.nomoreicemelting.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import pjc21.mods.nomoreicemelting.blocks.BlockNonMeltingIce;

public class ModBlocks {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");

    public static final RegistryObject<Block> ICE = BLOCKS.register("ice", () -> new BlockNonMeltingIce(AbstractBlock.Properties.of(Material.ICE).friction(0.98F).randomTicks().strength(0.5F).sound(SoundType.GLASS).noOcclusion().isValidSpawn((p_235450_0_, p_235450_1_, p_235450_2_, p_235450_3_) -> p_235450_3_ == EntityType.POLAR_BEAR)));

    public static void init(final IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}