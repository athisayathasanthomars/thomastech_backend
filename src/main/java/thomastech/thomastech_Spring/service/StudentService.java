package thomastech.thomastech_Spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thomastech.thomastech_Spring.entity.Student;
import thomastech.thomastech_Spring.repository.StudentRepository;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student postStudent(Student student){
        student.setStatus("New");
        return studentRepository.save(student);
    }
}
