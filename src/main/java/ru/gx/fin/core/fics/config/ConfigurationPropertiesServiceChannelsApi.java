package ru.gx.fin.core.fics.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "service.channels-api")
@Getter
@Setter
public class ConfigurationPropertiesServiceChannelsApi {

    @NestedConfigurationProperty
    public Snapshots ficsSnapshots;

    @Getter
    @Setter
    public static class Snapshots {
        @NestedConfigurationProperty
        public Enabled currenciesV1;

        @NestedConfigurationProperty
        public Enabled securitiesV1;

        @NestedConfigurationProperty
        public Enabled derivativesV1;
    }

    @Getter
    @Setter
    public static class Enabled {
        public boolean enabled = true;
    }
}
