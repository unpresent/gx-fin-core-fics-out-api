package ru.gx.fin.common.fics.out;

import com.fasterxml.jackson.annotation.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Производный ФИ
 */
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Derivative extends AbstractInstrument {
    /**
     * Базовый инструмент (на который этот дериватив)
     */
    // @JsonIdentityReference(alwaysAsId = true)
    private final String baseInstrument;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Nullable
    private final LocalDate expireDate;

    @JsonCreator
    public Derivative(
            @JsonProperty("guid") @NotNull final UUID guid,
            @JsonProperty("type") @NotNull final String type,
            @JsonProperty("internalShortName") @Nullable final String internalShortName,
            @JsonProperty("internalFullName") @Nullable final String internalFullName,
            @JsonProperty("baseInstrument") @Nullable final String baseInstrument,
            @JsonProperty("expireDate") @Nullable final LocalDate expireDate
    ) {
        super(guid, type, internalShortName, internalFullName);
        this.baseInstrument = baseInstrument;
        this.expireDate = expireDate;
    }
}
