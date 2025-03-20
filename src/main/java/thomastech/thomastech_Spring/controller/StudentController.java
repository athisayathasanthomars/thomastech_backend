package thomastech.thomastech_Spring.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import thomastech.thomastech_Spring.entity.Student;
import thomastech.thomastech_Spring.service.StudentService;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<?> postStudent(@Valid @RequestBody Student student, BindingResult result){
        if (result.hasErrors()){
            Map<String, String> errors = new HashMap<>();
            result.getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(errors);
        }
        Student savedStudent=studentService.postStudent(student);
        return ResponseEntity.ok(savedStudent);
    }
}
