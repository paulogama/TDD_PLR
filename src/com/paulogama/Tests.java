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
        Employee employee = new Employee("Trainee", 2);
        assertEquals(2, employee.performance);
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
        Employee employee = new Employee("Trainee", 2);

        assertEquals(1, employee.multiplier());
    }

    @Test
    void testMultiplierAnalyst() {
        Employee employee = new Employee("Analyst", 1);

        assertEquals(2, employee.multiplier());
    }

    @Test
    void testMultiplierManager() {
        Employee employee = new Employee("Manager", 4);

        assertEquals(3, employee.multiplier());
    }

    @Test
    void testProfit() {
        Company company = new Company(4000, 5931500);
        Employee employee = new Employee("Manager", 5);

        assertEquals(8897.25, employee.profit(company));
    }

}
