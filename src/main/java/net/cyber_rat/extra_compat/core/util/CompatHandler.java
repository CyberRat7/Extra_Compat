package net.cyber_rat.extra_compat.core.util;

import net.cyber_rat.extra_compat.core.registry.FDCompatRegistry;
import net.cyber_rat.extra_compat.core.registry.NDCompatRegistry;
import net.cyber_rat.extra_compat.core.registry.SWCompatRegistry;
import net.minecraftforge.fml.ModList;

public class CompatHandler {

    public static final boolean farmersDelight;
    public static final boolean nethersDelight;
    public static final boolean sniffsWeapons;

    static {
        ModList mods = ModList.get();
        farmersDelight = mods.isLoaded("farmersdelight"); 
        sniffsWeapons = mods.isLoaded("sniffsweapons");
        nethersDelight = mods.isLoaded("nethersdelight");

    }

    public static void register() {

        if (nethersDelight) NDCompatRegistry.register();
        if (sniffsWeapons) SWCompatRegistry.register();
        if (farmersDelight) FDCompatRegistry.register();

    }

}