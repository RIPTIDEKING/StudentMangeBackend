package kota.repo;

import kota.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    List<Student> findStudentByName(String name);

    void deleteStudentById(int id);

    Optional<Student> findStudentById(int id);
}
