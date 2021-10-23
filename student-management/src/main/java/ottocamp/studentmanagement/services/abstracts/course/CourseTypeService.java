package ottocamp.studentmanagement.services.abstracts.course;

import java.util.List;

import ottocamp.studentmanagement.models.course.CourseType;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface CourseTypeService {
	Result add(CourseType courseType);

	Result delete(int id);

	Result updateCourseType(int id, String courseType);

	DataResult<List<CourseType>> getAll();
}
