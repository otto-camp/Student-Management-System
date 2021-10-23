package ottocamp.studentmanagement.services.concretes.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.course.CourseDao;
import ottocamp.studentmanagement.models.course.Course;
import ottocamp.studentmanagement.services.abstracts.course.CourseService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class CourseManager implements CourseService {

	private CourseDao courseDao;

	@Autowired
	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	@Override
	public Result add(Course course) {
		this.courseDao.save(course);
		return new SuccessResult("Course added!");
	}

	@Override
	public Result delete(int id) {
		Course course = new Course();
		course.setId(id);
		this.courseDao.delete(course);
		return new SuccessResult("Course deleted!");
	}

	@Override
	public Result updateCourseName(int id, String courseName) {
		this.courseDao.updateCourseName(id, courseName);
		return new SuccessResult("Course name updated!");
	}

	@Override
	public Result updateCourseId(int id, String courseId) {
		this.courseDao.updateCourseId(id, courseId);
		return new SuccessResult("Course id updated!");
	}

	@Override
	public Result updateCourseDesc(int id, String courseDesc) {
		this.courseDao.updateCourseDesc(id, courseDesc);
		return new SuccessResult("Course description updated!");
	}

	@Override
	public DataResult<List<Course>> getAll() {
		return new SuccessDataResult<List<Course>>(this.courseDao.findAll(), "Courses listed!");
	}

}
