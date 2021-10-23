package ottocamp.studentmanagement.daos.course;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.course.Curriculum;

public interface CurriculumDao extends JpaRepository<Curriculum, Integer>{

}
