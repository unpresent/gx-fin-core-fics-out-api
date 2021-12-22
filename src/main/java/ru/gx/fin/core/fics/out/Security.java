package ru.gx.fin.core.fics.out;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.fin.common.dris.out.InstrumentType;

import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Security extends AbstractInstrument {

    /**
     * Код ISIN
     */
    @Nullable
    private final String codeIsin;

    @JsonCreator
    public Security(
            @JsonProperty("guid") @NotNull final UUID guid,
            @JsonProperty("type") @NotNull final String type,
            @JsonProperty("internalShortName") @Nullable final String internalShortName,
            @JsonProperty("internalFullName") @Nullable final String internalFullName,
            @JsonProperty("codeIsin") @Nullable String codeIsin
    ) {
        super(guid, type, internalShortName, internalFullName);
        this.codeIsin = codeIsin;
    }
}
