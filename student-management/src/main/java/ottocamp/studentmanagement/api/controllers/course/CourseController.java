package ottocamp.studentmanagement.api.controllers.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.course.Course;
import ottocamp.studentmanagement.services.abstracts.course.CourseService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

@RestController
@RequestMapping("/api/course/")
@CrossOrigin
public class CourseController {

	private CourseService courseService;

	@Autowired
	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Course course) {
		return this.courseService.add(course);
	}

	@DeleteMapping("delete")
	public Result delete(int id) {
		return this.courseService.delete(id);
	}

	@PostMapping("update-course-name")
	public Result updateCourseName(int id, String courseName) {
		return this.courseService.updateCourseName(id, courseName);
	}

	@PostMapping("update-course-id")
	public Result updateCourseId(int id, String courseId) {
		return this.courseService.updateCourseId(id, courseId);
	}

	@PostMapping("update-course-desc")
	public Result updateCourseDesc(int id, String courseDesc) {
		return this.courseService.updateCourseDesc(id, courseDesc);
	}

	@GetMapping("getall")
	public DataResult<List<Course>> getAll() {
		return this.courseService.getAll();
	}
}
