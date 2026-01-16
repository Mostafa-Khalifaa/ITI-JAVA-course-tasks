import java.util.ArrayList;



class Student implements Registerable {
    
    private Integer studentId;
    private String name;
    private ArrayList<CourseRegistration> registrations;
    
    class CourseRegistration {
        private Course course;
        private Double grade;
        
        public CourseRegistration(Course course, Double grade) {
            this.course = course;
            this.grade = grade;
        }
        
        public Course getCourse() {
            return course;
        }
        
        public Double getGrade() {
            return grade;
        }
    }
    
    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registrations = new ArrayList<>();
    }
    
    public void registerCourse(Course course, Double grade) {
        CourseRegistration reg = new CourseRegistration(course, grade);
        registrations.add(reg);
    }
    
    public void printReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: " + studentId + "\n");
        sb.append("Name: " + name + "\n");
        sb.append("Courses:\n");
        
        if(registrations.size() == 0) {
            sb.append("No courses registered\n");
        } else {
            for(int i = 0; i < registrations.size(); i++) {
                CourseRegistration r = registrations.get(i);
                sb.append(r.getCourse().getCourseName());
                sb.append(" - Grade: ");
                sb.append(r.getGrade());
                sb.append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
    
    public Integer getStudentId() {
        return studentId;
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<CourseRegistration> getRegistrations() {
        return registrations;
    }
}