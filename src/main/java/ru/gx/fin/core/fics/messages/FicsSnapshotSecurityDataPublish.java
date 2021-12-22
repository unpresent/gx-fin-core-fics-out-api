package ru.gx.fin.core.fics.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.core.messaging.*;
import ru.gx.fin.core.fics.config.FicsMessageTypes;
import ru.gx.fin.core.fics.out.Security;

import java.util.Arrays;

@SuppressWarnings("unused")
public class FicsSnapshotSecurityDataPublish
        extends AbstractDataPublish<FicsSnapshotSecurityDataPublish.FicsSnapshotSecurityDataPublishBody> {
    public static final int V1 = 1;
    public static final int[] SUPPORTED_VERSIONS = {V1};

    private static boolean initialized = false;

    public static void staticInit() {
        if (initialized) {
            return;
        }
        initialized = true;
        Arrays.stream(SUPPORTED_VERSIONS).forEach(version ->
                MessageTypesRegistrator.registerType(
                        MessageKind.DataPublish,
                        FicsMessageTypes.Snapshots.SECURITIES,
                        version,
                        FicsSnapshotSecurityDataPublish.class,
                        FicsSnapshotSecurityDataPublishBody.class
                )
        );
    }

    @JsonCreator
    public FicsSnapshotSecurityDataPublish(
            @JsonProperty("header") @NotNull final DataPublishHeader header,
            @JsonProperty("body") @NotNull final FicsSnapshotSecurityDataPublish.FicsSnapshotSecurityDataPublishBody body,
            @JsonProperty("correlation") final @Nullable MessageCorrelation correlation
    ) {
        super(header, body, correlation);
    }

    public static class FicsSnapshotSecurityDataPublishBody extends AbstractMessageBodyDataObject<Security> {
        @JsonCreator
        public FicsSnapshotSecurityDataPublishBody(
                @JsonProperty("dataObject") @NotNull final Security dataObject
        ) {
            super(dataObject);
        }
    }
}
