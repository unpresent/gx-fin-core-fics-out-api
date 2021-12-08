package ru.gx.fin.core.fics.memdata;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.AbstractMemoryRepository;
import ru.gx.fin.core.fics.out.CurrenciesPackage;
import ru.gx.fin.core.fics.out.Currency;
import ru.gx.fin.core.fics.out.SecuritiesPackage;
import ru.gx.fin.core.fics.out.Security;

public class SecuritiesMemoryRepository extends AbstractMemoryRepository<Security, SecuritiesPackage> {
    @Override
    @NotNull
    public Object extractKey(@NotNull final Security security) {
        return security.getGuid();
    }

    public static class IdResolver extends AbstractIdResolver<SecuritiesMemoryRepository> {
    }
}
