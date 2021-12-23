package ru.gx.fin.common.fics.keyextractors;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.DataObjectKeyExtractor;
import ru.gx.fin.common.fics.out.Currency;

@SuppressWarnings("unused")
public class CurrencyKeyExtractor implements DataObjectKeyExtractor<Currency> {
    @Override
    public Object extractKey(@NotNull Currency dataObject) {
        return dataObject.getGuid();
    }
}
