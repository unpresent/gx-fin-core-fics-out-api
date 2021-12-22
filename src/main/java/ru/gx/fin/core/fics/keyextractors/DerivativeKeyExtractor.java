package ru.gx.fin.core.fics.keyextractors;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.DataObjectKeyExtractor;
import ru.gx.fin.core.fics.out.Derivative;
import ru.gx.fin.core.fics.out.Security;

@SuppressWarnings("unused")
public class DerivativeKeyExtractor implements DataObjectKeyExtractor<Derivative> {
    @Override
    public Object extractKey(@NotNull Derivative dataObject) {
        return dataObject.getGuid();
    }
}
