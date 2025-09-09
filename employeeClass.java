import java.util.Scanner;

class Employee {
    double salary;
    int workHours;

    void getInfo(double salary, int hours) {
        this.salary = salary;
        this.workHours = hours;
    }

    void addSal() {
        if (salary < 500) salary += 10;
    }

    void addWork() {
        if (workHours > 6) salary += 5;
    }

    void displaySalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();
        System.out.print("Enter hours of work per day: ");
        int hrs = sc.nextInt();

        e.getInfo(sal, hrs);
        e.addSal();
        e.addWork();
        e.displaySalary();
    }
}
