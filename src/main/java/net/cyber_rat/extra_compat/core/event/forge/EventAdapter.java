package net.cyber_rat.extra_compat.core.event.forge;

import net.minecraftforge.eventbus.api.Event;

public interface EventAdapter<T extends Event> {
    void adapt(T event);
}
