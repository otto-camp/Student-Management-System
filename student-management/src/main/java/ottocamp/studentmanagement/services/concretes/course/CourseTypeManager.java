package ottocamp.studentmanagement.services.concretes.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.course.CourseTypeDao;
import ottocamp.studentmanagement.models.course.CourseType;
import ottocamp.studentmanagement.services.abstracts.course.CourseTypeService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class CourseTypeManager implements CourseTypeService {

	private CourseTypeDao courseTypeDao;

	@Autowired
	public CourseTypeManager(CourseTypeDao courseTypeDao) {
		super();
		this.courseTypeDao = courseTypeDao;
	}

	@Override
	public Result add(CourseType courseType) {
		this.courseTypeDao.save(courseType);
		return new SuccessResult("Course type added!");
	}

	@Override
	public Result delete(int id) {
		CourseType courseType = new CourseType();
		courseType.setId(id);
		this.courseTypeDao.delete(courseType);
		return new SuccessResult("Course type deleted!");
	}

	@Override
	public Result updateCourseType(int id, String courseType) {
		this.courseTypeDao.updateCourseType(id, courseType);
		return new SuccessResult("Course type updated!");
	}

	@Override
	public DataResult<List<CourseType>> getAll() {
		return new SuccessDataResult<List<CourseType>>(this.courseTypeDao.findAll(), "Course types listed!");
	}
}
