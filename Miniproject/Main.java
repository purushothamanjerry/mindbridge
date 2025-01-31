package StudentManagement;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final Path path = Paths.get("D:/users/Backend2/src/StudentManagement/Data.txt");
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Main stu = new Main();

        try {
            System.out.println("--------- Student Management System ------------");
            System.out.println("1. Add Student");
            System.out.println("2. View all Students");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Sorting");
            System.out.println("7. Sorting by Grade");
            System.out.print("Enter the operation to perform (e.g., 1 or 2): ");
            int op = s.nextInt();
            s.nextLine(); 

            switch (op) {
                case 1:
                    stu.addStu();
                    break;
                case 2:
                    stu.displayAll();
                    break;
                case 3:
                    stu.searchStudent();
                    break;
                case 4:
                    stu.updateStudent();
                    break;
                case 5:
                    stu.deleteStudent();
                    break;
                case 6:
                	stu.sorting();
                	break;
                case 7:
                	stu.sortByGrade();
                	break;
                default:
                    System.out.println("Invalid option! Please choose a valid operation.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred. Please try again.");
            e.printStackTrace();
        }
    }

    public boolean isMailIdExists(String mailid) {
        try {
            if (!Files.exists(path)) return false;
            try (Stream<String> lines = Files.lines(path)) {
                return lines.anyMatch(line -> line.contains("Mailid: " + mailid));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return false;
        }
    }
    public void sorting() {
        List<String> l1 = new ArrayList<>();
try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                 l1.add(line);

    }
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
			List<String> l2 = l1.stream().sorted().collect(Collectors.toList());

			l2.forEach(System.out::println);

}
    public void sortByGrade() {
        List<String> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                students.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        List<String> sortedStudents = students.stream()
                .sorted(Comparator.comparing(student -> student.split("\\|")[3].split(":")[1].trim())) 
                .collect(Collectors.toList());
  System.out.println("Students sorted by grade:");
        sortedStudents.forEach(System.out::println);
    }


    public void addStu() {
        try {
            if (!Files.exists(path)) Files.createFile(path);

            System.out.print("Enter the Student Name: ");
            String name = s.nextLine();
            System.out.print("Enter the Student Age: ");
            int age = s.nextInt();
            System.out.print("Enter the Student ID: ");
            int id = s.nextInt();
            s.nextLine(); 

            System.out.print("Enter the Student Grade: ");
            char grade = s.next().charAt(0);
            s.nextLine(); 

            System.out.print("Enter the Student Email ID: ");
            String mailid = s.nextLine();

            if (isMailIdExists(mailid)) {
                System.out.println("Student Already Exists!");
                return;
            }

            String newStu = "Name:" + name + " | " +
                    "Age:" + age + " | " +
                    "Id:" + id + " | " +
                    "Grade:" + grade + " | " +
                    "Mailid:" + mailid + "\n";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toFile(), true))) {
                bw.write(newStu);
                System.out.println("New Student Details Added Successfully!");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid details.");
        }
    }

    public void displayAll() {
        try {
            if (!Files.exists(path) || Files.size(path) == 0) {
                System.out.println("No student records found.");
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void searchStudent() {
        try {
            System.out.print("Enter the student ID: ");
            int id = s.nextInt();
            s.nextLine();

            boolean found = false;

            try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("Id:" + id)) {
                        System.out.println(line);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid ID.");
        }
    }

    public void deleteStudent() {
        try {
            System.out.print("Enter the student ID: ");
            int id = s.nextInt();
            s.nextLine();

            List<String> l1 = new ArrayList<>();
            boolean studentFound = false;

            try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("Id:" + id)) {
                        studentFound = true;
                    } else {
                        l1.add(line);
                    }
                }
            }

            if (!studentFound) {
                System.out.println("Student with ID " + id + " not found.");
                return;
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toFile()))) {
                for (String l : l1) {
                    bw.write(l);
                    bw.newLine();
                }
                System.out.println("Student record deleted successfully.");
            }
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid ID.");
        }
    }

    public void updateStudent() {
        try {
            System.out.print("Enter the student ID to update: ");
            int id = s.nextInt();
            s.nextLine();

            List<String> updatedList = new ArrayList<>();
            boolean studentFound = false;

            try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("Id:" + id)) {
                        studentFound = true;
                        System.out.println("Current Record: " + line);

                        System.out.print("Enter the updated Name: ");
                        String name = s.nextLine();
                        System.out.print("Enter the updated Age: ");
                        int age = s.nextInt();
                        System.out.print("Enter the updated Grade: ");
                        char grade = s.next().charAt(0);
                        s.nextLine();

                        System.out.print("Enter the updated Email ID: ");
                        String mailid = s.nextLine();

                        if (isMailIdExists(mailid)) {
                            System.out.println("This Email ID is already in use by another student!");
                            return;
                        }

                        String updatedStu = "Name:" + name + " | " +
                                "Age:" + age + " | " +
                                "Id:" + id + " | " +
                                "Grade:" + grade + " | " +
                                "Mailid:" + mailid;
                        updatedList.add(updatedStu);
                    } else {
                        updatedList.add(line);
                    }
                }
            }

            if (!studentFound) {
                System.out.println("Student with ID " + id + " not found.");
                return;
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toFile()))) {
                for (String updatedLine : updatedList) {
                    bw.write(updatedLine);
                    bw.newLine();
                }
                System.out.println("Student record updated successfully.");
            }
        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid details.");
        }
    }
}
