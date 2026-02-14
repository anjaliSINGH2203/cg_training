package com.lpu.employeeSalary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSalaryCalculatorTest {

    // Positive Test Cases

    @Test
    void validSalaryCalculation() {
        EmployeeSalaryCalculator calc = new EmployeeSalaryCalculator(20000, 5000, 10);
        assertDoesNotThrow(calc::validateSalary);
    }

    @Test
    void correctHRACalculation() {
        EmployeeSalaryCalculator calc = new EmployeeSalaryCalculator(20000, 5000, 10);
        assertEquals(4000, calc.calculateHRA(), 0.001);
    }

    @Test
    void correctDACalculation() {
        EmployeeSalaryCalculator calc = new EmployeeSalaryCalculator(20000, 5000, 10);
        assertEquals(2000, calc.calculateDA(), 0.001);
    }

    @Test
    void correctGrossSalary() {
        EmployeeSalaryCalculator calc = new EmployeeSalaryCalculator(20000, 5000, 10);
        assertEquals(31000, calc.calculateGrossSalary(), 0.001);
    }

    @Test
    void correctNetSalary() {
        EmployeeSalaryCalculator calc = new EmployeeSalaryCalculator(20000, 5000, 10);
        assertEquals(27900, calc.calculateNetSalary(), 0.001);
    }

    // Negative Test Cases

    @Test
    void basicSalaryZeroShouldThrowException() {
        EmployeeSalaryCalculator calc = new EmployeeSalaryCalculator(0, 5000, 10);
        assertThrows(IllegalArgumentException.class, calc::validateSalary);
    }

    @Test
    void negativeSalaryShouldThrowException() {
        EmployeeSalaryCalculator calc = new EmployeeSalaryCalculator(-20000, 5000, 10);
        assertThrows(IllegalArgumentException.class, calc::validateSalary);
    }

    @Test
    void taxAbove100ShouldThrowException() {
        EmployeeSalaryCalculator calc = new EmployeeSalaryCalculator(20000, 5000, 150);
        assertThrows(IllegalArgumentException.class, calc::validateSalary);
    }
}
