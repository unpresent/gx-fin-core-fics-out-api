package ru.gx.fin.core.fics.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "service.mem-data.fics")
@Getter
@Setter
public class ConfigurationPropertiesServiceMemData {
    @NestedConfigurationProperty
    private MemoryRepository currencies;

    @NestedConfigurationProperty
    private MemoryRepository securities;

    @NestedConfigurationProperty
    private MemoryRepository derivatives;

    @Getter
    @Setter
    public static class MemoryRepository {
        public boolean enabled = true;
    }
}
