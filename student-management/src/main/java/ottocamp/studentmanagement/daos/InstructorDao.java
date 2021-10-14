package ottocamp.studentmanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.Instructor;

public interface InstructorDao extends JpaRepository<Instructor, Integer>{
	Instructor getById(int id);
}
