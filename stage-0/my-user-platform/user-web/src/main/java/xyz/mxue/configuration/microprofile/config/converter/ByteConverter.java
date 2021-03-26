package xyz.mxue.configuration.microprofile.config.converter;

/**
 * @author mxuexxmy
 */
public class ByteConverter extends AbstractConverter<Byte>{

    @Override
    protected Byte doConvert(String value) {
        return Byte.valueOf(value);
    }
}
