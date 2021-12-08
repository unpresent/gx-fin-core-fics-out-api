package ru.gx.fin.core.fics.events;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.channels.ChannelDescriptor;
import ru.gx.core.events.AbstractDataEvent;

@SuppressWarnings("unused")
public class LoadedFicsSecuritiesEvent extends AbstractDataEvent {
    public LoadedFicsSecuritiesEvent(@NotNull final Object source, @NotNull final ChannelDescriptor channelDescriptor) {
        super(source, channelDescriptor);
    }
}
