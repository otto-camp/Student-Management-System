package ottocamp.studentmanagement.daos.exam;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.exam.ExamResult;

public interface ExamResultDao extends JpaRepository<ExamResult, Integer>{

}
