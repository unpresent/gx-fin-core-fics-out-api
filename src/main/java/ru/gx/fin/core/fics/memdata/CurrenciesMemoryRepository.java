package ru.gx.fin.core.fics.memdata;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.AbstractMemoryRepository;
import ru.gx.fin.core.fics.out.CurrenciesPackage;
import ru.gx.fin.core.fics.out.Currency;

public class CurrenciesMemoryRepository extends AbstractMemoryRepository<Currency, CurrenciesPackage> {
    @Override
    @NotNull
    public Object extractKey(@NotNull final Currency currency) {
        return currency.getGuid();
    }

    public static class IdResolver extends AbstractIdResolver<CurrenciesMemoryRepository> {
    }
}
