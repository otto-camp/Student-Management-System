package ottocamp.studentmanagement.daos.exam;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.exam.Exam;

public interface ExamDao extends JpaRepository<Exam, Integer> {

	@Transactional
	@Modifying
	@Query("update Exam e set e.name = :name where e.id = :id")
	void updateName(@Param(value = "id") int id, @Param(value = "name") String name);
}
