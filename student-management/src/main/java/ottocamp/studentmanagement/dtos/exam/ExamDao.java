package ottocamp.studentmanagement.dtos.exam;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.exam.Exam;

public interface ExamDao extends JpaRepository<Exam, Integer>{

}
