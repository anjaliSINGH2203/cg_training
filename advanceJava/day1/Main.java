public class Main {

    public static void main(String[] args) {
        try {
            // Create Employee object
            Employee emp = new Employee();
            emp.setName("Maria Francis");
            emp.setMonthlySalary(2000);
            emp.setAge(18);

            // Validate employee
            Validator validator = new Validator();
            validator.validate(emp);

            // Calculate and display annual salary
            double annualSalary = emp.calculateAnnualSalary();
            System.out.println("Annual Salary: " + annualSalary);

        } catch (InvalidNameException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

/* ================= Employee Class ================= */
class Employee {
    private String name;
    private double monthlySalary;
    private int age;

    public double calculateAnnualSalary() {
        double annualSalary = monthlySalary * 12;

        if (age >= 18 && age <= 50) {
            annualSalary += 0.06 * monthlySalary * 12;
        } else if (age > 50 && age <= 60) {
            annualSalary += 0.07 * monthlySalary * 12;
        }
        return annualSalary;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

/* ================= Validator Class ================= */
class Validator {

    public boolean validateName(String name) {
        return name != null && name.length() > 8;
    }

    public boolean validateAge(int age) {
        return age >= 18 && age <= 60;
    }

    public void validate(Employee employee)
            throws InvalidNameException, InvalidAgeException {

        if (!validateName(employee.getName())) {
            throw new InvalidNameException("Invalid Name");
        }
        if (!validateAge(employee.getAge())) {
            throw new InvalidAgeException("Invalid Age");
        }
    }
}

/* ================= Custom Exceptions ================= */
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
