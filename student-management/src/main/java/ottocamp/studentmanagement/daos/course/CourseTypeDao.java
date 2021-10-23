package ottocamp.studentmanagement.daos.course;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.course.CourseType;

public interface CourseTypeDao extends JpaRepository<CourseType, Integer> {

	@Transactional
	@Modifying
	@Query("update CourseType c set c.courseType = :courseType where c.id = :id")
	void updateCourseType(@Param(value = "id") int id, @Param(value = "courseType") String courseType);
}
