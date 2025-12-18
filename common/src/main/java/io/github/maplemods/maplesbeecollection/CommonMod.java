package io.github.maplemods.maplesbeecollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesbeecollection.data.Constants;
import net.minecraft.resources.ResourceLocation;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        registerBee("candycane_bee", 1);
        registerBee("gingerbread_bee", 1);
        registerBee("rudolph_bee", 1);
        registerBee("santa_bee", 1);
        registerBee("xmastree_bee", 1);
    }

    @SuppressWarnings("SameParameterValue")
    private static void registerBee(String beeName, double weight) {
        RegisterFunctions.registerBeeTextures(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "texture/entity/bee/" + beeName + ".png"), weight);
    }
}