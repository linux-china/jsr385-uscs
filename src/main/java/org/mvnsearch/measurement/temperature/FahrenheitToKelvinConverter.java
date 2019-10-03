package org.mvnsearch.measurement.temperature;

import tech.units.indriya.function.AbstractConverter;
import tech.uom.lib.common.function.Converter;

import javax.measure.UnitConverter;

/**
 * Fahrenheit to Kelvin converter
 *
 * @author linux_china
 */
public class FahrenheitToKelvinConverter extends AbstractConverter implements Converter<Number, Number> {
    public static FahrenheitToKelvinConverter INSTANCE = new FahrenheitToKelvinConverter();

    private FahrenheitToKelvinConverter() {

    }

    @Override
    public boolean isIdentity() {
        return false;
    }

    @Override
    public boolean isLinear() {
        return true;
    }


    @Override
    public boolean equals(Object cvtr) {
        return cvtr instanceof FahrenheitToKelvinConverter;
    }

    @Override
    public int hashCode() {
        return transformationLiteral().hashCode();
    }

    @Override
    protected String transformationLiteral() {
        return "(F + 459.67) * 5.0 / 9.0";
    }

    @Override
    protected AbstractConverter inverseWhenNotIdentity() {
        return KelvinToFahrenheitConverter.INSTANCE;
    }

    @Override
    protected boolean canReduceWith(AbstractConverter that) {
        return true;
    }

    @Override
    protected Number convertWhenNotIdentity(Number value) {
        return (value.doubleValue() + 459.67) * 5.0 / 9.0;
    }

    @Override
    public int compareTo(UnitConverter o) {
        return 0;
    }
}
