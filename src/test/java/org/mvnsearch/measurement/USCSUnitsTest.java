package org.mvnsearch.measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tech.units.indriya.ComparableQuantity;
import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;

import javax.measure.quantity.Length;

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
}
