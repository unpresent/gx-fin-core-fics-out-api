package ru.gx.fin.common.fics.channels;

import ru.gx.core.channels.AbstractChannelApiDescriptor;
import ru.gx.core.channels.SerializeMode;
import ru.gx.core.messaging.MessageKind;
import ru.gx.fin.common.fics.config.FicsChannelNames;
import ru.gx.fin.common.fics.config.FicsMessageTypes;
import ru.gx.fin.common.fics.messages.FicsSnapshotCurrencyDataPublish;

@SuppressWarnings("unused")
public class FicsSnapshotCurrencyDataPublishChannelApiV1
        extends AbstractChannelApiDescriptor<FicsSnapshotCurrencyDataPublish> {

    public FicsSnapshotCurrencyDataPublishChannelApiV1() {
        super(
                FicsChannelNames.Snapshots.CURRENCIES_V1,
                SerializeMode.JsonString,
                FicsSnapshotCurrencyDataPublish.class,
                MessageKind.DataPublish,
                FicsMessageTypes.Snapshots.CURRENCIES,
                FicsSnapshotCurrencyDataPublish.V1
        );
    }
}
