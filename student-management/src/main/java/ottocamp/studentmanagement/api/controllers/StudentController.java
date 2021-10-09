package ottocamp.studentmanagement.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.Student;
import ottocamp.studentmanagement.services.abstracts.StudentService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessResult;

@RestController
@RequestMapping("/api/student/")
@CrossOrigin
public class StudentController {

	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Student student) {
		this.studentService.add(student);
		return new SuccessResult("Student added!");
	}

	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {
		this.studentService.delete(id);
		return new SuccessResult("Student deleted!");
	}

	@GetMapping("getall")
	public DataResult<List<Student>> getAll() {
		return this.studentService.getAll();
	}
}
