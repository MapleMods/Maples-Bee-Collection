package io.github.maplemods.maplesbeecollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesbeecollection.data.Constants;
import net.minecraft.world.entity.EntityTypes;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "autumn", "flannel_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "autumn", "pumpkin_bee", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "christmas", "candycane_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "christmas", "gingerbread_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "christmas", "rudolph_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "christmas", "santa_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "christmas", "xmastree_bee", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "spring", "cherry_blossom_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "spring", "flower_bee", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "summer", "midsommar_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "summer", "watermelon_bee", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "winter", "frozen_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityTypes.BEE, "winter", "snow_covered_bee", 1);
    }
}
