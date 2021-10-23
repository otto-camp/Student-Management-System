package ottocamp.studentmanagement.daos.exam;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.exam.ExamType;

public interface ExamTypeDao extends JpaRepository<ExamType, Integer>{

	@Transactional
	@Modifying
	@Query("update ExamType e set e.name = :name where e.id = :id")
	void updateName(@Param(value = "id") int id, @Param(value = "name") String name);
	
	@Transactional
	@Modifying
	@Query("update ExamType e set e.description = :description where e.id = :id")
	void updateDescription(@Param(value = "id") int id, @Param(value = "description") String description);
}
