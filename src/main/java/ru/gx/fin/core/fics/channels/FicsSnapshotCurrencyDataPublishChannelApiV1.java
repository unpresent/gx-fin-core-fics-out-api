package ru.gx.fin.core.fics.channels;

import ru.gx.core.channels.AbstractChannelApiDescriptor;
import ru.gx.core.channels.SerializeMode;
import ru.gx.core.messaging.MessageKind;
import ru.gx.fin.common.dris.config.DrisChannelNames;
import ru.gx.fin.common.dris.config.DrisMessageTypes;
import ru.gx.fin.common.dris.messages.DrisSnapshotInstrumentTypeDataPublish;
import ru.gx.fin.core.fics.config.FicsChannelNames;
import ru.gx.fin.core.fics.config.FicsMessageTypes;
import ru.gx.fin.core.fics.messages.FicsSnapshotCurrencyDataPublish;

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
