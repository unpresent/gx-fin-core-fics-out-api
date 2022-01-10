package ru.gx.fin.common.fics.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.core.messaging.*;
import ru.gx.fin.common.fics.config.FicsMessageTypes;
import ru.gx.fin.common.fics.out.Currency;

import java.util.Arrays;

@SuppressWarnings("unused")
@ToString(callSuper = true)
public class FicsSnapshotCurrencyDataPublish
        extends AbstractMessage<FicsSnapshotCurrencyDataPublish.FicsSnapshotCurrencyDataPublishBody> {
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
                        FicsMessageTypes.Snapshots.CURRENCIES,
                        version,
                        FicsSnapshotCurrencyDataPublish.class,
                        FicsSnapshotCurrencyDataPublishBody.class
                )
        );
    }

    @JsonCreator
    public FicsSnapshotCurrencyDataPublish(
            @JsonProperty("header") @NotNull final StandardMessageHeader header,
            @JsonProperty("body") @NotNull final FicsSnapshotCurrencyDataPublish.FicsSnapshotCurrencyDataPublishBody body,
            @JsonProperty("correlation") final @Nullable MessageCorrelation correlation
    ) {
        super(header, body, correlation);
    }

    public static class FicsSnapshotCurrencyDataPublishBody extends AbstractMessageBodyDataObject<Currency> {
        @JsonCreator
        public FicsSnapshotCurrencyDataPublishBody(
                @JsonProperty("dataObject") @NotNull final Currency dataObject
        ) {
            super(dataObject);
        }
    }
}
