package ottocamp.studentmanagement.services.abstracts.course;

import java.util.List;

import ottocamp.studentmanagement.models.course.Course;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface CourseService {
	Result add(Course course);

	Result delete(int id);

	Result updateCourseName(int id, String courseName);

	Result updateCourseId(int id, String courseId);

	Result updateCourseDesc(int id, String courseDesc);

	DataResult<List<Course>> getAll();
}
