package net.cyber_rat.extra_compat.core.util;

import net.cyber_rat.extra_compat.core.registry.FDCompatRegistry;
import net.cyber_rat.extra_compat.core.registry.SWCompatRegistry;
import net.minecraftforge.fml.ModList;

public class CompatHandler {

    public static final boolean netherDungeons;
    public static final boolean sniffsWeapons;

    static {
        ModList mods = ModList.get();
        netherDungeons = mods.isLoaded("netherdungeons");
        sniffsWeapons = mods.isLoaded("sniffsweapons");
    }

    public static void register() {

        if (sniffsWeapons) SWCompatRegistry.register();
        if (netherDungeons) FDCompatRegistry.register();

    }

}