package ottocamp.studentmanagement.dtos.exam;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.exam.ExamType;

public interface ExamTypeDao extends JpaRepository<ExamType, Integer>{

}
