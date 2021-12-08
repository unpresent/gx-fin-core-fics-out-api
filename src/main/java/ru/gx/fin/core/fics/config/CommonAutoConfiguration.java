package ru.gx.fin.core.fics.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gx.fin.core.fics.memdata.CurrenciesMemoryRepository;
import ru.gx.fin.core.fics.memdata.DerivativesMemoryRepository;
import ru.gx.fin.core.fics.memdata.SecuritiesMemoryRepository;

@Configuration
@EnableConfigurationProperties(ConfigurationPropertiesServiceMemData.class)
public class CommonAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.mem-data.fics.currencies.enabled", havingValue = "true")
    public CurrenciesMemoryRepository currenciesMemoryRepository() {
        return new CurrenciesMemoryRepository();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.mem-data.fics.securities.enabled", havingValue = "true")
    public SecuritiesMemoryRepository securitiesMemoryRepository() {
        return new SecuritiesMemoryRepository();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.mem-data.fics.derivatives.enabled", havingValue = "true")
    public DerivativesMemoryRepository derivativesMemoryRepository() {
        return new DerivativesMemoryRepository();
    }
}
