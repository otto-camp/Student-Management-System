package ottocamp.studentmanagement.dtos;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	Student getByStudentId(int id);
}
