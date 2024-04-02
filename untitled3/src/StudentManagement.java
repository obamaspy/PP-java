import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
            private static ArrayList<Student> students = new ArrayList<>();

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("1. Enter student list");
                    System.out.println("2. Find students by last name");
                    System.out.println("3. Find and edit students by full name");
                    System.out.println("4. End");
                    System.out.print("Enter your choice: ");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            enterStudentList(scanner);
                            break;
                        case 2:
                            findStudentsByLastName();
                            break;
                        case 3:
                            findAndEditStudent();
                            break;
                        case 4:
                            System.out.println("Exiting program...");
                            return;
                        default:
                            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    }
                }
            }

            private static void enterStudentList(Scanner scanner) {
                System.out.print("Enter the number of students: ");
                int numStudents = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                for (int i = 0; i < numStudents; i++) {
                    System.out.print("Enter first name for student " + (i + 1) + ": ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name for student " + (i + 1) + ": ");
                    String lastName = scanner.nextLine();

                    students.add(new Student(firstName, lastName));
                }

                System.out.println("Student list entered successfully.");
            }

            private static void findStudentsByLastName() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the last name to search for: ");
                String searchLastName = scanner.nextLine();

                boolean found = false;
                for (Student student : students) {
                    if (student.getLastName().equalsIgnoreCase(searchLastName)) {
                        System.out.println(student);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("No students found with last name " + searchLastName);
                }
            }

            private static void findAndEditStudent() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the full name of the student to edit: ");
                String fullName = scanner.nextLine();

                boolean found = false;
                for (Student student : students) {
                    if (student.toString().equalsIgnoreCase(fullName)) {
                        System.out.println("Student found: " + student);
                        System.out.print("Enter the new first name: ");
                        String newFirstName = scanner.nextLine();
                        System.out.print("Enter the new last name: ");
                        String newLastName = scanner.nextLine();

                        student.setFirstName(newFirstName);
                        student.setLastName(newLastName);
                        System.out.println("Student information updated successfully.");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No student found with full name " + fullName);
                }
            }
        }
