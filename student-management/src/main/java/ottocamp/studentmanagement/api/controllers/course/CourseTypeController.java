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

import ottocamp.studentmanagement.models.course.CourseType;
import ottocamp.studentmanagement.services.abstracts.course.CourseTypeService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

@RestController
@RequestMapping("/api/coursetype/")
@CrossOrigin
public class CourseTypeController {

	private CourseTypeService courseTypeService;

	@Autowired
	public CourseTypeController(CourseTypeService courseTypeService) {
		super();
		this.courseTypeService = courseTypeService;
	}

	@PostMapping("add")
	public Result add(@RequestBody CourseType courseType) {
		return this.courseTypeService.add(courseType);
	}

	@DeleteMapping("delete")
	public Result delete(int id) {
		return this.courseTypeService.delete(id);
	}

	@PostMapping("update-course-type")
	public Result updateCourseType(int id, String courseType) {
		return this.courseTypeService.updateCourseType(id, courseType);
	}
	
	@GetMapping("getall")
	public DataResult<List<CourseType>> getAll() {
		return this.courseTypeService.getAll();
	}
}