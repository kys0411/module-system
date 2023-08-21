package dbimpl;

import model.Student;
import service.StudentService;

public class StudentDbService implements StudentService {
    @Override
    public String create(Student student) {
        // Creating student in DB
        return student.getRegistrationId();
    }

    @Override
    public Student read(String registrationId) {
        // Reading student from DB
        return new Student();
    }

    @Override
    public String delete(String registrationId) {
        // Deleting student in DB
        return registrationId;
    }

    @Override
    public Student update(Student student) {
        // Updating student in DB
        return student;
    }
}
