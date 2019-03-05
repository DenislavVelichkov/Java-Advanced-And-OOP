package JavaOOP.WorkingWithAbstractions_3.StudentSystem_3;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private Map<String, Student> studentRepository;

    public StudentRepository() {
        this.studentRepository = new HashMap<>();
    }

    public Map<String, Student> getStudentRepository() {
        return this.studentRepository;
    }

    public void parseCommand(String[] args) {

        switch (args[0]) {
            case "Create":
                addStudent(args);
                break;
            case "Show":
                showStudentInfo(args[1]);
                break;
        }
    }

    private void showStudentInfo(String studentName) {
        if (this.studentRepository.containsKey(studentName)) {
            Student student = studentRepository.get(studentName);
            System.out.println(student);
        }
    }

    private void addStudent(String[] args) {
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);

        if (!studentRepository.containsKey(name)) {
            Student student = new Student(name, age, grade);
            studentRepository.put(name, student);
        }

    }
}
