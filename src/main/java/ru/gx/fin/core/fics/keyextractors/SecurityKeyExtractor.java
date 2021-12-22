package ru.gx.fin.core.fics.keyextractors;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.DataObjectKeyExtractor;
import ru.gx.fin.core.fics.out.Currency;
import ru.gx.fin.core.fics.out.Security;

@SuppressWarnings("unused")
public class SecurityKeyExtractor implements DataObjectKeyExtractor<Security> {
    @Override
    public Object extractKey(@NotNull Security dataObject) {
        return dataObject.getGuid();
    }
}
