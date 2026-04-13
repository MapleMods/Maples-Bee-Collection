package io.github.maplemods.maplesbeecollection;

import io.github.maplemods.maplesbeecollection.data.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ForgeMod {

    public ForgeMod(FMLJavaModLoadingContext modLoadingContext) {
        CommonMod.init();
    }
}