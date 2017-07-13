package com.paulogama;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Paulo Gama on 31/05/17.
 *
 */
class Tests {

    @Test
    void testNumberOfEmployers() {
        Company company = new Company(100, 7);
        assertEquals(100, company.employeesCount);
    }

    @Test
    void testPerformance() {
        Trainee trainee = new Trainee(2);
        assertEquals(2, trainee.performance);
    }

    @Test
    void testEligibility() {
        Company company = new Company(13, 150000);

        assertTrue(company.isEligible());
    }

    @Test
    void testNotEligibility() {
        Company company = new Company(423, 4000000);

        assertFalse(company.isEligible());
    }

    @Test
    void testMultiplierTrainee() {
        Trainee trainee = new Trainee(2);
        assertEquals(1, trainee.multiplier());
    }

    @Test
    void testMultiplierAnalyst() {
        Analyst analyst = new Analyst(1);

        assertEquals(2, analyst.multiplier());
    }

    @Test
    void testMultiplierManager() {
        Manager manager = new Manager(4);

        assertEquals(3, manager.multiplier());
    }

    @Test
    void testProfit() {
        Manager manager = new Manager(5);
        Company company = new Company(4000, 5931500);

        Employee employee = new Employee(manager, 5);

        assertEquals(8897.25, employee.profit(company.profitMargin, company.employeesCount));
    }

}
