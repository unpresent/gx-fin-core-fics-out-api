package ru.gx.fin.common.fics.channels;

import ru.gx.core.channels.AbstractChannelApiDescriptor;
import ru.gx.core.channels.SerializeMode;
import ru.gx.core.messaging.MessageKind;
import ru.gx.fin.common.fics.config.FicsChannelNames;
import ru.gx.fin.common.fics.config.FicsMessageTypes;
import ru.gx.fin.common.fics.messages.FicsSnapshotDerivativeDataPublish;

@SuppressWarnings("unused")
public class FicsSnapshotDerivativeDataPublishChannelApiV1
        extends AbstractChannelApiDescriptor<FicsSnapshotDerivativeDataPublish> {

    public FicsSnapshotDerivativeDataPublishChannelApiV1() {
        super(
                FicsChannelNames.Snapshots.DERIVATIVES_V1,
                SerializeMode.JsonString,
                FicsSnapshotDerivativeDataPublish.class,
                MessageKind.DataPublish,
                FicsMessageTypes.Snapshots.DERIVATIVES,
                FicsSnapshotDerivativeDataPublish.V1
        );
    }
}
