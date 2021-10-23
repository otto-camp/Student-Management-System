package ottocamp.studentmanagement.daos.course;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.course.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {

	@Transactional
	@Modifying
	@Query("update Course c set c.courseName = :courseName where c.id = :id")
	void updateCourseName(@Param(value = "id") int id, @Param(value = "courseName") String courseName);

	@Transactional
	@Modifying
	@Query("update Course c set c.courseId = :courseId where c.id = :id")
	void updateCourseId(@Param(value = "id") int id, @Param(value = "courseId") String courseId);

	@Transactional
	@Modifying
	@Query("update Course c set c.courseDesc = :courseDesc where c.id = :id")
	void updateCourseDesc(@Param(value = "id") int id, @Param(value = "courseDesc") String courseDesc);
}
