package ottocamp.studentmanagement.daos.exam;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.exam.Exam;

public interface ExamDao extends JpaRepository<Exam, Integer>{

}
