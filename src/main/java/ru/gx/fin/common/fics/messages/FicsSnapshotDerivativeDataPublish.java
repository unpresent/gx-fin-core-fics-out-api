package ru.gx.fin.common.fics.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.core.messaging.*;
import ru.gx.fin.common.fics.config.FicsMessageTypes;
import ru.gx.fin.common.fics.out.Derivative;

import java.util.Arrays;

@SuppressWarnings("unused")
public class FicsSnapshotDerivativeDataPublish
        extends AbstractDataPublish<FicsSnapshotDerivativeDataPublish.FicsSnapshotDerivativeDataPublishBody> {
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
                        FicsMessageTypes.Snapshots.DERIVATIVES,
                        version,
                        FicsSnapshotDerivativeDataPublish.class,
                        FicsSnapshotDerivativeDataPublishBody.class
                )
        );
    }

    @JsonCreator
    public FicsSnapshotDerivativeDataPublish(
            @JsonProperty("header") @NotNull final DataPublishHeader header,
            @JsonProperty("body") @NotNull final FicsSnapshotDerivativeDataPublish.FicsSnapshotDerivativeDataPublishBody body,
            @JsonProperty("correlation") final @Nullable MessageCorrelation correlation
    ) {
        super(header, body, correlation);
    }

    public static class FicsSnapshotDerivativeDataPublishBody extends AbstractMessageBodyDataObject<Derivative> {
        @JsonCreator
        public FicsSnapshotDerivativeDataPublishBody(
                @JsonProperty("dataObject") @NotNull final Derivative dataObject
        ) {
            super(dataObject);
        }
    }
}
