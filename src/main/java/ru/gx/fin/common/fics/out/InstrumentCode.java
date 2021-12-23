package ru.gx.fin.common.fics.out;

import com.fasterxml.jackson.annotation.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.core.data.AbstractDataObject;
import ru.gx.fin.common.dris.out.Provider;

import java.time.LocalDate;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true, of = {"provider", "code"})
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstrumentCode extends AbstractDataObject {
    /**
     * Код провайдера, который идентифицирует инструмент, которому принадлежит данная запись
     */
    // @JsonIdentityReference(alwaysAsId = true)
    @NotNull
    private final String provider;

    /**
     * Код инструмента (идентификатор) на данном провайдере для данного инструмента
     */
    @NotNull
    private final String code;

    /**
     * Название инструмента на данном провайдере
     */
    @Nullable
    private final String name;

    /**
     * Порядковый номер кода (для случаев, когда провайдер о данном инструменте транслирует несколько кодов)
     */
    private final short index;

    /**
     * Дата, начиная с которой данный код начал действовать
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Nullable
    private final LocalDate dateFrom;

    /**
     * Дата, до (не включая) которой данный код действовал
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Nullable
    private final LocalDate dateTo;

    @JsonCreator
    public InstrumentCode(
            @JsonProperty("provider") @NotNull final String provider,
            @JsonProperty("code") @NotNull final String code,
            @JsonProperty("name") @Nullable final String name,
            @JsonProperty("index") short index,
            @JsonProperty("dateFrom") @Nullable final LocalDate dateFrom,
            @JsonProperty("dateTo") @Nullable final LocalDate dateTo
    ) {
        this.provider = provider;
        this.code = code;
        this.name = name;
        this.index = index;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
}
