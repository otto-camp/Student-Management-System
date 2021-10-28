package ottocamp.studentmanagement.daos.course;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.course.Curriculum;

public interface CurriculumDao extends JpaRepository<Curriculum, Integer> {

	@Transactional
	@Modifying
	@Query("update Curriculum c set c.classroom = :classroom where c.id = :id")
	void updateClassroom(@Param(value = "id") int id, @Param(value = "classroom") String classroom);

	@Transactional
	@Modifying
	@Query("update Curriculum c set c.startTime = :startTime where c.id = :id")
	void updateStartTime(@Param(value = "id") int id, @Param(value = "startTime") String startTime);

	@Transactional
	@Modifying
	@Query("update Curriculum c set c.endTime = :endTime where c.id = :id")
	void updateEndTime(@Param(value = "id") int id, @Param(value = "endTime") String endTime);
}
