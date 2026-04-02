package io.github.maplemods.maplesbeecollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesbeecollection.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "autumn", "flannel_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "autumn", "pumpkin_bee", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "candycane_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "gingerbread_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "rudolph_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "santa_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "xmastree_bee", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "spring", "cherry_blossom_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "spring", "flower_bee", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "summer", "midsommar_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "summer", "watermelon_bee", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "winter", "frozen_bee", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "winter", "snow_covered_bee", 1);
    }
}
