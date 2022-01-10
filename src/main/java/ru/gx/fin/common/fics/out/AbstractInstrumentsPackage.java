package ru.gx.fin.common.fics.out;

import lombok.ToString;
import ru.gx.core.data.AbstractDataPackage;

@SuppressWarnings("unused")
@ToString(callSuper = true)
public abstract class AbstractInstrumentsPackage<O extends AbstractInstrument> extends AbstractDataPackage<O> {
}
