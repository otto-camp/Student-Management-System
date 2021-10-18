package ottocamp.studentmanagement.daos.exam;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.exam.ExamResult;

public interface ExamResultDao extends JpaRepository<ExamResult, Integer> {

	@Transactional
	@Modifying
	@Query("update ExamResult e set e.grade = :grade where e.id = :id")
	void updateGrade(@Param(value = "id") int id, @Param(value = "grade") String grade);
}
