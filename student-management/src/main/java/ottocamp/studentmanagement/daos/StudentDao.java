package ottocamp.studentmanagement.daos;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	Student getByStudentId(int id);
	
	@Transactional
	@Modifying
	@Query("update Student s set s.birthDate = :birthDate where s.id = :id")
	void updateBirthDate(@Param(value = "id") int id, @Param(value = "birthDate") Date birthDate);
}
