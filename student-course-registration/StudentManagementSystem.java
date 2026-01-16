import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManagementSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        
        courses.add(new Course(1, "OOP", 3));
        courses.add(new Course(2, "Database", 3));
        courses.add(new Course(3, "DataStructure", 4));
        
        int choice = 0;
        
        while(true) {
            System.out.println("\n1- Add Student");
            System.out.println("2- Register Course");
            System.out.println("3- Print Report");
            System.out.println("4- Exit");
            System.out.print("Enter choice: ");
            
            if(sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Please enter number only");
                sc.nextLine();
                continue;
            }
            
            if(choice == 1) {
                System.out.print("Enter ID: ");
                Integer id = null;
                
                if(sc.hasNextInt()) {
                    id = sc.nextInt();
                    sc.nextLine();
                    
                    if(id < 0) {
                        System.out.println("ID cannot be negative");
                        continue;
                    }
                } else {
                    System.out.println("ID must be number");
                    sc.nextLine();
                    continue;
                }
                
                boolean idExists = false;
                for(int i = 0; i < students.size(); i++) {
                    if(students.get(i).getStudentId().equals(id)) {
                        idExists = true;
                        break;
                    }
                }
                
                if(idExists) {
                    System.out.println("already exists");
                    continue;
                }
                
                System.out.print("Enter Name: ");
                String n = sc.nextLine();
                
                if(n.trim().isEmpty()) {
                    System.out.println("Name cannot be empty");
                    continue;
                }
                
                Student s = new Student(id, n);
                students.add(s);
                System.out.println("Student added");
            }
            else if(choice == 2) {
                if(students.size() == 0) {
                    System.out.println("No students available");
                    continue;
                }
                
                System.out.print("Enter Student ID: ");
                Integer sid = null;
                
                if(sc.hasNextInt()) {
                    sid = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("ID must be number");
                    sc.nextLine();
                    continue;
                }
                
                Student st = null;
                for(int i = 0; i < students.size(); i++) {
                    if(students.get(i).getStudentId().equals(sid)) {
                        st = students.get(i);
                        break;
                    }
                }
                
                if(st == null) {
                    System.out.println("not found");
                    continue;
                }
                
                System.out.println("Available courses:");
                for(int i = 0; i < courses.size(); i++) {
                    System.out.println(courses.get(i).getCourseId() + "- " + courses.get(i).getCourseName());
                }
                
                System.out.print("Enter course IDs (1,2,3): ");
                String input = sc.nextLine();
                
                if(input.trim().isEmpty()) {
                    System.out.println("Please enter course IDs");
                    continue;
                }
                
                StringTokenizer tok = new StringTokenizer(input, ",");
                boolean anyRegistered = false;
                
                while(tok.hasMoreTokens()) {
                    String t = tok.nextToken().trim();
                    Integer cid = null;
                    
                    try {
                        cid = Integer.parseInt(t);
                    } catch(Exception e) {
                        System.out.println("Invalid input: " + t);
                        continue;
                    }
                    
                    Course c = null;
                    for(int i = 0; i < courses.size(); i++) {
                        if(courses.get(i).getCourseId().equals(cid)) {
                            c = courses.get(i);
                            break;
                        }
                    }
        
                    if(c != null) {
                        System.out.print("Grade for " + c.getCourseName() + ": ");
                        Double g = null;
                        
                        if(sc.hasNextDouble()) {
                            g = sc.nextDouble();
                            sc.nextLine();
                            
                            if(g < 0 || g > 100) {
                                System.out.println("Grade must be between 0 and 100");
                                continue;
                            }
                            
                            st.registerCourse(c, g);
                            anyRegistered = true;
                            System.out.println("registered");
                        } else {
                            System.out.println("Grade must be number");
                            sc.nextLine();
                        }
                    } else {
                        System.out.println("Course ID " + cid + " not found");
                    }
                }
                
                if(anyRegistered) {
                    System.out.println("Registration completed");
                }
            }
            else if(choice == 3) {
                if(students.size() == 0) {
                    System.out.println("No students available");
                    continue;
                }
                
                System.out.print("Enter Student ID: ");
                Integer sid = null;
                
                if(sc.hasNextInt()) {
                    sid = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("ID must be number");
                    sc.nextLine();
                    continue;
                }
                
                Student st = null;
                for(int i = 0; i < students.size(); i++) {
                    if(students.get(i).getStudentId().equals(sid)) {
                        st = students.get(i);
                        break;
                    }
                }
                
                if(st != null) {
                    st.printReport();
                } else {
                    System.out.println("Student not found");
                }
            }
            else if(choice == 4) {
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        
        sc.close();
    }
}