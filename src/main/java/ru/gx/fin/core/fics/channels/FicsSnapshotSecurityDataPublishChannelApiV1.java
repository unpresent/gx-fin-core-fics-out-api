package ru.gx.fin.core.fics.channels;

import ru.gx.core.channels.AbstractChannelApiDescriptor;
import ru.gx.core.channels.SerializeMode;
import ru.gx.core.messaging.MessageKind;
import ru.gx.fin.core.fics.config.FicsChannelNames;
import ru.gx.fin.core.fics.config.FicsMessageTypes;
import ru.gx.fin.core.fics.messages.FicsSnapshotCurrencyDataPublish;
import ru.gx.fin.core.fics.messages.FicsSnapshotSecurityDataPublish;

@SuppressWarnings("unused")
public class FicsSnapshotSecurityDataPublishChannelApiV1
        extends AbstractChannelApiDescriptor<FicsSnapshotSecurityDataPublish> {

    public FicsSnapshotSecurityDataPublishChannelApiV1() {
        super(
                FicsChannelNames.Snapshots.SECURITIES_V1,
                SerializeMode.JsonString,
                FicsSnapshotSecurityDataPublish.class,
                MessageKind.DataPublish,
                FicsMessageTypes.Snapshots.SECURITIES,
                FicsSnapshotSecurityDataPublish.V1
        );
    }
}
