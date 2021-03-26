package xyz.mxue.configuration.microprofile.config.converter;

import org.eclipse.microprofile.config.spi.Converter;

/**
 * @author mxuexxmy
 */
public abstract class AbstractConverter<T> implements Converter<T> {

    public T convert(String value) {
        if (value == null) {
            throw new NullPointerException("The value must not be null");
        }
        return doConvert(value);
    }

    protected abstract T doConvert(String value);

}
