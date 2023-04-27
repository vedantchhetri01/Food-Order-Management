import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CollegeBusFacilitySystem {
    
    private static HashMap<String, ArrayList<String>> buses = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter 1 to add a new bus");
            System.out.println("Enter 2 to remove a bus");
            System.out.println("Enter 3 to add a new student to a bus");
            System.out.println("Enter 4 to remove a student from a bus");
            System.out.println("Enter 5 to view all buses and their information");
            System.out.println("Enter 6 to view all students on a specific bus");
            System.out.println("Enter 0 to exit");
            System.out.print("Your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
                case 1:
                    addBus();
                    break;
                case 2:
                    removeBus();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    viewAllBuses();
                    break;
                case 6:
                    viewStudentsOnBus();
                    break;
                case 0:
                    System.out.println("Exiting program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    public static void addBus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bus number: ");
        String busNumber = scanner.nextLine();
        
        if(buses.containsKey(busNumber)) {
            System.out.println("Bus already exists");
        } else {
            buses.put(busNumber, new ArrayList<String>());
            System.out.println("Bus added successfully");
        }
    }
    
    public static void removeBus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bus number: ");
        String busNumber = scanner.nextLine();
        
        if(!buses.containsKey(busNumber)) {
            System.out.println("Bus does not exist");
        } else {
            buses.remove(busNumber);
            System.out.println("Bus removed successfully");
        }
    }
    
    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bus number: ");
        String busNumber = scanner.nextLine();
        
        if(!buses.containsKey(busNumber)) {
            System.out.println("Bus does not exist");
        } else {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            ArrayList<String> students = buses.get(busNumber);
            students.add(studentName);
            buses.put(busNumber, students);
            System.out.println("Student added successfully");
        }
    }
    
    public static void removeStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bus number: ");
    }
        
        