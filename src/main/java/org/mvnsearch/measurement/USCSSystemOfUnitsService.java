package org.mvnsearch.measurement;

import tech.units.indriya.spi.AbstractSystemOfUnitsService;

import javax.measure.spi.SystemOfUnits;

/**
 * USCS SystemOfUnitsService
 *
 * @author linux_china
 */
public class USCSSystemOfUnitsService extends AbstractSystemOfUnitsService {

    public USCSSystemOfUnitsService() {
        souMap.put("USCS", USCSUnits.getInstance());
    }

    @Override
    public SystemOfUnits getSystemOfUnits() {
        return getSystemOfUnits("USCS");
    }

}
