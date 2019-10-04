package org.mvnsearch.measurement;

import org.junit.jupiter.api.Test;

/**
 * Indriya test
 *
 * @author linux_china
 */
public class IndriyaTest {
    @Test
    public void testSystemUnits() {
        USCSSystemOfUnitsService unitsService = new USCSSystemOfUnitsService();
        unitsService.getAvailableSystemsOfUnits().forEach(systemOfUnits -> {
            System.out.println(systemOfUnits.getName());
        });
    }

}
