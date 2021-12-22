package ru.gx.fin.core.fics.config;

@SuppressWarnings("unused")
public abstract class FicsMessageTypes {

    public abstract static class Snapshots {
        public static final String CURRENCIES = "FICS:SNAPSHOT-PUBLISH:CURRENCY";
        public static final String SECURITIES = "FICS:SNAPSHOT-PUBLISH:SECURITY";
        public static final String DERIVATIVES = "FICS:SNAPSHOT-PUBLISH:DERIVATIVE";
    }
}
