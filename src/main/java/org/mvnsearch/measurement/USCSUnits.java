package org.mvnsearch.measurement;

import org.mvnsearch.measurement.temperature.FahrenheitToKelvinConverter;
import tech.units.indriya.AbstractSystemOfUnits;
import tech.units.indriya.AbstractUnit;
import tech.units.indriya.function.MultiplyConverter;
import tech.units.indriya.unit.TransformedUnit;
import tech.units.indriya.unit.Units;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.quantity.Area;
import javax.measure.quantity.Length;
import javax.measure.quantity.Temperature;
import javax.measure.spi.SystemOfUnits;

/**
 * USCS Units
 *
 * @author linux_china
 */
public class USCSUnits extends AbstractSystemOfUnits {
    public static String NAME_OF_UNITS = "USCS";

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
        return NAME_OF_UNITS;
    }

    // //////////////
    // Length //
    // //////////////
    public static final Unit<Length> POINT = addUnit(new TransformedUnit<>("p", Units.METRE, MultiplyConverter.of(0.000352778)), Length.class);
    public static final Unit<Length> PICA = addUnit(new TransformedUnit<>("P̸", Units.METRE, MultiplyConverter.of(0.004233)), Length.class);
    public static final Unit<Length> INCH = addUnit(new TransformedUnit<>("in", Units.METRE, MultiplyConverter.of(0.0254)), Length.class);
    public static final Unit<Length> FOOT = addUnit(new TransformedUnit<>("ft", Units.METRE, MultiplyConverter.of(0.3048)), Length.class);
    public static final Unit<Length> YARD = addUnit(new TransformedUnit<>("yd", Units.METRE, MultiplyConverter.of(0.9144)), Length.class);
    public static final Unit<Length> MILE = addUnit(new TransformedUnit<>("mi", Units.METRE, MultiplyConverter.of(1609.344)), Length.class);

    // //////////////
    // Area //
    // //////////////
    public static final Unit<Area> SQUARE_FOOT = addUnit(new TransformedUnit<>("ft2", Units.SQUARE_METRE, MultiplyConverter.of(0.09290341)), Area.class);
    public static final Unit<Area> ACRE = addUnit(new TransformedUnit<>("acre", Units.SQUARE_METRE, MultiplyConverter.of(4046.873)), Area.class);
    public static final Unit<Area> SECTION = addUnit(new TransformedUnit<>("section", Units.SQUARE_METRE, MultiplyConverter.of(2589998)), Area.class);
    public static final Unit<Area> TOWNSHIP = addUnit(new TransformedUnit<>("twp", Units.SQUARE_METRE, MultiplyConverter.of(93239930)), Area.class);

    // //////////////
    // temperature //
    // //////////////
    public static final Unit<Temperature> Fahrenheit = addUnit(new TransformedUnit<>("°F", Units.KELVIN,  FahrenheitToKelvinConverter.INSTANCE), Temperature.class);

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
