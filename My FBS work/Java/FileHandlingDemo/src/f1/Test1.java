package f1;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Salary: " + salary;
    }
}

public class Test1 {
    static final String FILE_NAME = "filedata.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emplist = new ArrayList<>();

        // Load data from file
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            emplist = (List<Employee>) ois.readObject();
            ois.close();
            System.out.println("Data loaded from file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Starting with empty list.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Menu-driven operations
        int choice;
        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Display Employee list");
            System.out.println("2. Add Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Save & Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Employee List:");
                    for (Employee emp : emplist) {
                        System.out.println(emp);
                    }
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    emplist.add(new Employee(id, name, salary));
                    System.out.println("Employee added.");
                    break;
                case 3:
                    System.out.print("Enter ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean removed = emplist.removeIf(emp -> emp.id == removeId);
                    if (removed) {
                        System.out.println("Employee removed.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    // Save data to file
                    try {
                        FileOutputStream fos = new FileOutputStream(FILE_NAME);
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(emplist);
                        oos.close();
                        System.out.println("Data saved. Exiting.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
