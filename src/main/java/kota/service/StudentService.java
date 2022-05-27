package kota.service;

import kota.exception.UserNotFoundException;
import kota.repo.StudentRepo;
import kota.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student){
        return studentRepo.save(student);
    }

    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

    public List<Student> findStudentByName(String name){
        return studentRepo.findStudentByName(name);
    }

    public void deleteStudentById(int id){
        studentRepo.deleteStudentById(id);
    }

    public Student findStudentById(int id){
        return studentRepo.findStudentById(id).orElseThrow(() -> new UserNotFoundException("User with id: "+id+" was not Found"));
    }

}
//https://www.youtube.com/watch?v=Gx4iBLKLVHk 14:13
