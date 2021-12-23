package ru.gx.fin.common.fics.keyextractors;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.DataObjectKeyExtractor;
import ru.gx.fin.common.fics.out.Derivative;

@SuppressWarnings("unused")
public class DerivativeKeyExtractor implements DataObjectKeyExtractor<Derivative> {
    @Override
    public Object extractKey(@NotNull Derivative dataObject) {
        return dataObject.getGuid();
    }
}
