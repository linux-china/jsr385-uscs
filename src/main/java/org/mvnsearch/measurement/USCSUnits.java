package org.mvnsearch.measurement;

import org.mvnsearch.measurement.temperature.FahrenheitToKelvinConverter;
import tech.units.indriya.AbstractSystemOfUnits;
import tech.units.indriya.AbstractUnit;
import tech.units.indriya.function.MultiplyConverter;
import tech.units.indriya.unit.TransformedUnit;
import tech.units.indriya.unit.Units;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.quantity.*;
import javax.measure.spi.SystemOfUnits;

import static javax.measure.MetricPrefix.MICRO;
import static javax.measure.MetricPrefix.MILLI;

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
    public static final Unit<Length> POINT = addUnit(new TransformedUnit<>("p", MICRO(Units.METRE), MultiplyConverter.of(352.778)), Length.class);
    public static final Unit<Length> PICA = addUnit(new TransformedUnit<>("P̸", MILLI(Units.METRE), MultiplyConverter.of(4.233)), Length.class);
    public static final Unit<Length> INCH = addUnit(new TransformedUnit<>("in", MILLI(Units.METRE), MultiplyConverter.of(25.4)), Length.class);
    public static final Unit<Length> FOOT = addUnit(new TransformedUnit<>("ft", Units.METRE, MultiplyConverter.of(0.3048)), Length.class);
    public static final Unit<Length> YARD = addUnit(new TransformedUnit<>("yd", Units.METRE, MultiplyConverter.of(0.9144)), Length.class);
    public static final Unit<Length> MILE = addUnit(new TransformedUnit<>("mi", Units.METRE, MultiplyConverter.of(1609.344)), Length.class);
    public static final Unit<Length> RACK_UNIT = addUnit(new TransformedUnit<>("U", MILLI(Units.METRE), MultiplyConverter.of(44.45)), Length.class);
    public static final Unit<Length> LINK = addUnit(new TransformedUnit<>("li", Units.METRE, MultiplyConverter.of(0.20117)), Length.class);
    public static final Unit<Length> ROD = addUnit(new TransformedUnit<>("rd", Units.METRE, MultiplyConverter.of(5.029)), Length.class);
    public static final Unit<Length> CHAIN = addUnit(new TransformedUnit<>("ch", Units.METRE, MultiplyConverter.of(20.116)), Length.class);
    public static final Unit<Length> FURLONG = addUnit(new TransformedUnit<>("fur", Units.METRE, MultiplyConverter.of(201.168)), Length.class);
    public static final Unit<Length> LEAGUE = addUnit(new TransformedUnit<>("lea", Units.METRE, MultiplyConverter.of(4828)), Length.class);
    public static final Unit<Length> HAND = addUnit(new TransformedUnit<>("hand", Units.METRE, MultiplyConverter.of(0.1016)), Length.class);

    // //////////////
    // SPEED //
    // //////////////
    public static final Unit<Speed> MILE_PER_HOUR = addUnit(new TransformedUnit<>("mph", Units.METRE_PER_SECOND, MultiplyConverter.of(0.44704)), Speed.class);

    // //////////////
    // Area //
    // //////////////
    public static final Unit<Area> SQUARE_FOOT = addUnit(new TransformedUnit<>("sq ft", Units.SQUARE_METRE, MultiplyConverter.of(0.09290341)), Area.class);
    public static final Unit<Area> SQUARE_CHAIN = addUnit(new TransformedUnit<>("sq ch", Units.SQUARE_METRE, MultiplyConverter.of(404.6873)), Area.class);
    public static final Unit<Area> ACRE = addUnit(new TransformedUnit<>("acre", Units.SQUARE_METRE, MultiplyConverter.of(4046.873)), Area.class);
    public static final Unit<Area> SECTION = addUnit(new TransformedUnit<>("section", Units.SQUARE_METRE, MultiplyConverter.of(2589998)), Area.class);
    public static final Unit<Area> TOWNSHIP = addUnit(new TransformedUnit<>("twp", Units.SQUARE_METRE, MultiplyConverter.of(93239930)), Area.class);

    // //////////////
    // capacity and volume //
    // //////////////
    public static final Unit<Volume> CUBIC_INCH = addUnit(new TransformedUnit<>("cu in", MILLI(Units.LITRE), MultiplyConverter.of(16.387064)), Volume.class);
    public static final Unit<Volume> CUBIC_FOOT = addUnit(new TransformedUnit<>("cu ft", Units.LITRE, MultiplyConverter.of(28.316846592)), Volume.class);
    public static final Unit<Volume> CUBIC_YARD = addUnit(new TransformedUnit<>("cu yd", Units.LITRE, MultiplyConverter.of(764.554857984)), Volume.class);
    public static final Unit<Volume> ACRE_FOOT = addUnit(new TransformedUnit<>("acre ft", Units.CUBIC_METRE, MultiplyConverter.of(1233.482)), Volume.class);
    public static final Unit<Volume> BOARD_FOOT = addUnit(new TransformedUnit<>("board foot", Units.LITRE, MultiplyConverter.of(2.36)), Volume.class);

    // fluid volume
    public static final Unit<Volume> MINIM = addUnit(new TransformedUnit<>("min", MICRO(Units.LITRE), MultiplyConverter.of(61.611519921875)), Volume.class);
    public static final Unit<Volume> FLUID_DRAM = addUnit(new TransformedUnit<>("fl dr", MILLI(Units.LITRE), MultiplyConverter.of(3.6966911953125)), Volume.class);
    public static final Unit<Volume> TEA_SPOON = addUnit(new TransformedUnit<>("tsp", MILLI(Units.LITRE), MultiplyConverter.of(4.92892159375)), Volume.class);
    public static final Unit<Volume> TABLE_SPOON = addUnit(new TransformedUnit<>("Tbsp", MILLI(Units.LITRE), MultiplyConverter.of(14.78676478125)), Volume.class);
    public static final Unit<Volume> FLUID_OUNCE = addUnit(new TransformedUnit<>("fl oz", MILLI(Units.LITRE), MultiplyConverter.of(29.5735295625)), Volume.class);
    public static final Unit<Volume> SHOT = addUnit(new TransformedUnit<>("jig", MILLI(Units.LITRE), MultiplyConverter.of(44.36029434375)), Volume.class);
    public static final Unit<Volume> GILL = addUnit(new TransformedUnit<>("gi", Units.LITRE, MultiplyConverter.of(0.11829411825)), Volume.class);
    public static final Unit<Volume> CUP = addUnit(new TransformedUnit<>("cp", MILLI(Units.LITRE), MultiplyConverter.of(236.5882365)), Volume.class);
    public static final Unit<Volume> LIQUID_PINT = addUnit(new TransformedUnit<>("pt", Units.LITRE, MultiplyConverter.of(0.473176473)), Volume.class);
    public static final Unit<Volume> LIQUID_QUART = addUnit(new TransformedUnit<>("qt", Units.LITRE, MultiplyConverter.of(0.946352946)), Volume.class);
    public static final Unit<Volume> LIQUID_GALLON = addUnit(new TransformedUnit<>("gal", Units.LITRE, MultiplyConverter.of(3.785411784)), Volume.class);
    public static final Unit<Volume> LIQUID_BARREL = addUnit(new TransformedUnit<>("bbl", Units.LITRE, MultiplyConverter.of(119.240471196)), Volume.class);
    public static final Unit<Volume> OIL_BARREL = addUnit(new TransformedUnit<>("bbl", Units.LITRE, MultiplyConverter.of(158.987294928)), Volume.class);
    public static final Unit<Volume> HOGSHEAD = addUnit(new TransformedUnit<>("hogshead", Units.LITRE, MultiplyConverter.of(238.480942392)), Volume.class);

    //dry volume
    public static final Unit<Volume> DRY_PINT = addUnit(new TransformedUnit<>("pt", Units.LITRE, MultiplyConverter.of(0.5506104713575)), Volume.class);
    public static final Unit<Volume> DRY_QUART = addUnit(new TransformedUnit<>("qt", Units.LITRE, MultiplyConverter.of(1.101221)), Volume.class);
    public static final Unit<Volume> DRY_GALLON = addUnit(new TransformedUnit<>("gal", Units.LITRE, MultiplyConverter.of(4.404884)), Volume.class);
    public static final Unit<Volume> PECK = addUnit(new TransformedUnit<>("pk", Units.LITRE, MultiplyConverter.of(8.809768)), Volume.class);
    public static final Unit<Volume> BUSHEL = addUnit(new TransformedUnit<>("bu", Units.LITRE, MultiplyConverter.of(35.23907016688)), Volume.class);
    public static final Unit<Volume> DRY_BARREL = addUnit(new TransformedUnit<>("bbl", Units.LITRE, MultiplyConverter.of(115.6271)), Volume.class);

    // //////////////
    // weight and mass //
    // //////////////
    public static final Unit<Mass> GAIN = addUnit(new TransformedUnit<>("gr", MICRO(Units.KILOGRAM), MultiplyConverter.of(64.79891)), Mass.class);
    public static final Unit<Mass> DRAM = addUnit(new TransformedUnit<>("dr", MILLI(Units.KILOGRAM), MultiplyConverter.of(1.7718451953125)), Mass.class);
    public static final Unit<Mass> OUNCE = addUnit(new TransformedUnit<>("oz", MILLI(Units.KILOGRAM), MultiplyConverter.of(28.349523125)), Mass.class);
    public static final Unit<Mass> POUND = addUnit(new TransformedUnit<>("lb", Units.KILOGRAM, MultiplyConverter.of(45.359237)), Mass.class);
    public static final Unit<Mass> HUNDRED_WEIGHT = addUnit(new TransformedUnit<>("cwt", Units.KILOGRAM, MultiplyConverter.of(0.45359237)), Mass.class);
    public static final Unit<Mass> TON = addUnit(new TransformedUnit<>("short ton", Units.KILOGRAM, MultiplyConverter.of(907.18474)), Mass.class);
    public static final Unit<Mass> SLUG = addUnit(new TransformedUnit<>("slug", Units.KILOGRAM, MultiplyConverter.of(14.5939029)), Mass.class);

    // //////////////
    // temperature //
    // //////////////
    public static final Unit<Temperature> Fahrenheit = addUnit(new TransformedUnit<>("°F", Units.KELVIN, FahrenheitToKelvinConverter.INSTANCE), Temperature.class);

    //////////////
    //// misc ///
    //////////////
    public static final Unit<Energy> CALORIE = addUnit(new TransformedUnit<>("cal", Units.JOULE, MultiplyConverter.of(4.184)), Energy.class);
    public static final Unit<Energy> BRITISH_THERMAL_UNIT = addUnit(new TransformedUnit<>("Btu", Units.JOULE, MultiplyConverter.of(1055)), Energy.class);
    public static final Unit<Energy> FOOT_POUND = addUnit(new TransformedUnit<>("foot pound", Units.JOULE, MultiplyConverter.of(1.356)), Energy.class);
    public static final Unit<Power> HORSE_POWER = addUnit(new TransformedUnit<>("hp", Units.WATT, MultiplyConverter.of(745.7)), Energy.class);
    public static final Unit<Power> TON_OF_REFRIGERATION = addUnit(new TransformedUnit<>("TR", Units.WATT, MultiplyConverter.of(3517)), Energy.class);

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
