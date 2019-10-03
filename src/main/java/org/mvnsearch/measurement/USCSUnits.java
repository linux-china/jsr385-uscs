package org.mvnsearch.measurement;

import tech.units.indriya.AbstractSystemOfUnits;
import tech.units.indriya.AbstractUnit;
import tech.units.indriya.function.MultiplyConverter;
import tech.units.indriya.unit.TransformedUnit;
import tech.units.indriya.unit.Units;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.quantity.Length;
import javax.measure.spi.SystemOfUnits;

/**
 * USCS Units
 *
 * @author linux_china
 */
public class USCSUnits extends AbstractSystemOfUnits {

    private static final USCSUnits INSTANCE = new USCSUnits();

    /**
     * Returns the unique instance of this class.
     *
     * @return the Units instance.
     */
    public static SystemOfUnits getInstance() {
        return INSTANCE;
    }

    @Override
    public String getName() {
        return "USCS";
    }

    // //////////////
    // Length //
    // //////////////
    public static final Unit<Length> INCH = addUnit(new TransformedUnit<>("in", Units.METRE, MultiplyConverter.of(25.4 / 1000)), Length.class);
    public static final Unit<Length> FOOT = addUnit(new TransformedUnit<>("ft", Units.METRE, MultiplyConverter.of(0.3048)), Length.class);
    public static final Unit<Length> YARD = addUnit(new TransformedUnit<>("yd", Units.METRE, MultiplyConverter.of(0.9144)), Length.class);
    public static final Unit<Length> MILE = addUnit(new TransformedUnit<>("mi", Units.METRE, MultiplyConverter.of(1609.344)), Length.class);


    /**
     * Adds a new unit and maps it to the specified quantity type.
     *
     * @param unit the unit being added.
     * @param type the quantity type.
     * @return <code>unit</code>.
     */
    public static <U extends AbstractUnit<?>> U addUnit(U unit, Class<? extends Quantity<?>> type) {
        INSTANCE.units.add(unit);
        INSTANCE.quantityToUnit.put(type, unit);
        return unit;
    }
}
