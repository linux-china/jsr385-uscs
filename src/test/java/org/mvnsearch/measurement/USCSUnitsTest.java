package org.mvnsearch.measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tech.units.indriya.ComparableQuantity;
import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;

import javax.measure.quantity.Length;
import javax.measure.quantity.Temperature;

/**
 * USCS Units
 *
 * @author linux_china
 */
public class USCSUnitsTest {

    @Test
    public void testLength() {
        ComparableQuantity<Length> length = Quantities.getQuantity(1.0, USCSUnits.FOOT);
        ComparableQuantity<Length> lengthSI = Quantities.getQuantity(0.3048, Units.METRE);
        Assertions.assertTrue(length.to(Units.METRE).isEquivalentTo(lengthSI));
    }

    @Test
    public void testTemperature() {
        ComparableQuantity<Temperature> temp = Quantities.getQuantity(85, USCSUnits.Fahrenheit);
        System.out.println(temp.to(Units.KELVIN));
        System.out.println(Quantities.getQuantity(302.5944444444445, Units.KELVIN).to(USCSUnits.Fahrenheit));
    }
}
