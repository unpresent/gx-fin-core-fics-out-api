package ru.gx.fin.core.fics.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gx.fin.core.fics.channels.FicsSnapshotCurrencyDataPublishChannelApiV1;
import ru.gx.fin.core.fics.channels.FicsSnapshotDerivativeDataPublishChannelApiV1;
import ru.gx.fin.core.fics.channels.FicsSnapshotSecurityDataPublishChannelApiV1;
import ru.gx.fin.core.fics.keyextractors.CurrencyKeyExtractor;
import ru.gx.fin.core.fics.keyextractors.DerivativeKeyExtractor;
import ru.gx.fin.core.fics.keyextractors.SecurityKeyExtractor;
import ru.gx.fin.core.fics.messages.FicsSnapshotCurrencyDataPublish;
import ru.gx.fin.core.fics.messages.FicsSnapshotDerivativeDataPublish;
import ru.gx.fin.core.fics.messages.FicsSnapshotSecurityDataPublish;

@Configuration
@EnableConfigurationProperties(ConfigurationPropertiesServiceChannelsApi.class)
public class CommonAutoConfiguration {
    private static final String DOT_ENABLED = ".enabled";

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + FicsChannelNames.Snapshots.CURRENCIES_V1 + DOT_ENABLED, havingValue = "true")
    public FicsSnapshotCurrencyDataPublishChannelApiV1 ficsSnapshotCurrencyDataPublishChannelApiV1() {
        FicsSnapshotCurrencyDataPublish.staticInit();
        return new FicsSnapshotCurrencyDataPublishChannelApiV1();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + FicsChannelNames.Snapshots.CURRENCIES_V1 + DOT_ENABLED, havingValue = "true")
    public CurrencyKeyExtractor currencyKeyExtractor() {
        return new CurrencyKeyExtractor();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + FicsChannelNames.Snapshots.SECURITIES_V1 + DOT_ENABLED, havingValue = "true")
    public FicsSnapshotSecurityDataPublishChannelApiV1 ficsSnapshotSecurityDataPublishChannelApiV1() {
        FicsSnapshotSecurityDataPublish.staticInit();
        return new FicsSnapshotSecurityDataPublishChannelApiV1();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + FicsChannelNames.Snapshots.SECURITIES_V1 + DOT_ENABLED, havingValue = "true")
    public SecurityKeyExtractor securityKeyExtractor() {
        return new SecurityKeyExtractor();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + FicsChannelNames.Snapshots.DERIVATIVES_V1 + DOT_ENABLED, havingValue = "true")
    public FicsSnapshotDerivativeDataPublishChannelApiV1 ficsSnapshotDerivativeDataPublishChannelApiV1() {
        FicsSnapshotDerivativeDataPublish.staticInit();
        return new FicsSnapshotDerivativeDataPublishChannelApiV1();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + FicsChannelNames.Snapshots.DERIVATIVES_V1 + DOT_ENABLED, havingValue = "true")
    public DerivativeKeyExtractor derivativeKeyExtractor() {
        return new DerivativeKeyExtractor();
    }
}
