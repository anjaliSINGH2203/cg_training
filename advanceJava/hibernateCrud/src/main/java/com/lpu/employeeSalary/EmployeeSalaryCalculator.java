package com.lpu.employeeSalary;

public class EmployeeSalaryCalculator {

    private double basicSalary;
    private double bonus;
    private double taxPercent;

    public EmployeeSalaryCalculator(double basicSalary, double bonus, double taxPercent) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.taxPercent = taxPercent;
    }

    public void validateSalary() {
        if (basicSalary <= 0) {
            throw new IllegalArgumentException("Basic salary must be > 0");
        }
        if (taxPercent < 0 || taxPercent > 100) {
            throw new IllegalArgumentException("Tax must be between 0 and 100");
        }
    }

    public double calculateHRA() {
        validateSalary();
        return 0.20 * basicSalary;
    }

    public double calculateDA() {
        validateSalary();
        return 0.10 * basicSalary;
    }

    public double calculateGrossSalary() {
        validateSalary();
        return basicSalary + calculateHRA() + calculateDA() + bonus;
    }

    public double calculateNetSalary() {
        validateSalary();
        double gross = calculateGrossSalary();
        double taxDeduction = (taxPercent / 100.0) * gross;
        return gross - taxDeduction;
    }
}
