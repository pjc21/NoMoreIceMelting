package pjc21.mods.nomoreicemelting;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import pjc21.mods.nomoreicemelting.init.ModBlocks;
import pjc21.mods.nomoreicemelting.init.ModItems;

@Mod(NoMoreIceMelting.MODID)
public class NoMoreIceMelting
{
    public static final String MODID = "nomoreicemelting";

    public NoMoreIceMelting() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        ModBlocks.init(modEventBus);
        ModItems.init(modEventBus);
    }
}
