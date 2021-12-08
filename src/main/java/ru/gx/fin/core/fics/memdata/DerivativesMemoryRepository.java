package ru.gx.fin.core.fics.memdata;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.AbstractMemoryRepository;
import ru.gx.fin.core.fics.out.Derivative;
import ru.gx.fin.core.fics.out.DerivativesPackage;

public class DerivativesMemoryRepository extends AbstractMemoryRepository<Derivative, DerivativesPackage> {
    @Override
    @NotNull
    public Object extractKey(@NotNull final Derivative derivative) {
        return derivative.getGuid();
    }

    public static class IdResolver extends AbstractIdResolver<DerivativesMemoryRepository> {
    }
}
