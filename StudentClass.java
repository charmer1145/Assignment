import java.util.Scanner;

class Student {
    String name;
    int year;
    String address;

    Student(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    void display() {
        System.out.printf("%-10s %-15d %-20s%n", name, year, address);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter year of joining: ");
            int year = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.print("Enter address: ");
            String address = sc.nextLine();

            students[i] = new Student(name, year, address);
        }

        System.out.println("Name       Year of joining   Address");
        for (Student s : students) {
            s.display();
        }
    }
}
