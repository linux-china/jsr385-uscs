package org.mvnsearch.measurement.temperature;

import tech.units.indriya.function.AbstractConverter;
import tech.uom.lib.common.function.Converter;

import javax.measure.UnitConverter;

/**
 * Kelvin to Fahrenheit converter
 *
 * @author linux_china
 */
public class KelvinToFahrenheitConverter extends AbstractConverter implements Converter<Number, Number> {
    public static KelvinToFahrenheitConverter INSTANCE = new KelvinToFahrenheitConverter();

    private KelvinToFahrenheitConverter() {
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
        return cvtr instanceof KelvinToFahrenheitConverter;
    }

    @Override
    public int hashCode() {
        return transformationLiteral().hashCode();
    }

    @Override
    protected String transformationLiteral() {
        return "K * 1.8 - 459.67";
    }

    @Override
    protected AbstractConverter inverseWhenNotIdentity() {
        return FahrenheitToKelvinConverter.INSTANCE;
    }

    @Override
    protected boolean canReduceWith(AbstractConverter that) {
        return false;
    }

    @Override
    protected Number convertWhenNotIdentity(Number value) {
        return value.doubleValue() * 1.8 - 459.67;
    }

    @Override
    public int compareTo(UnitConverter o) {
        return 0;
    }
}
