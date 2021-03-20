package xyz.mxue.configuration.microprofile.config.converter;

/**
 * @author mxuexxmy
 */
public class DoubleConverter extends AbstractConverter<Double>{

    @Override
    protected Double doConvert(String value) {
        return Double.valueOf(value);
    }
}
