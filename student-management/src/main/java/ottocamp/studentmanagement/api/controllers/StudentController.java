package ottocamp.studentmanagement.api.controllers;

import java.sql.Date;
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
import ottocamp.studentmanagement.models.dtos.StudentAddDto;
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
	public Result add(@RequestBody StudentAddDto studentAddDto) {
		this.studentService.add(studentAddDto);
		return new SuccessResult("Student added!");
	}

	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {
		this.studentService.delete(id);
		return new SuccessResult("Student deleted!");
	}

	@PostMapping("update-name")
	public Result updateName(int id, String name) {
		return this.studentService.updateName(id, name);
	}

	@PostMapping("update-surname")
	public Result updateSurname(int id, String surname) {
		return this.studentService.updateSurname(id, surname);
	}

	@PostMapping("update-email")
	public Result updateEmail(int id, String email) {
		return this.studentService.updateEmail(id, email);
	}

	@PostMapping("update-password")
	public Result updatePassword(int id, String password) {
		return this.studentService.updatePassword(id, password);
	}

	@PostMapping("update-phone-number")
	public Result updatePhoneNumber(int id, String phoneNumber) {
		return this.studentService.updatePhoneNumber(id, phoneNumber);
	}

	@PostMapping("update-photo-url")
	public Result updatePhotoUrl(int id, String photoUrl) {
		return this.studentService.updatePhotoUrl(id, photoUrl);
	}

	@PostMapping("update-birth-date")
	public Result updateBirthDate(int id, Date birthDate) {
		return this.studentService.updateBirthDate(id, birthDate);
	}
	
	@GetMapping("getall")
	public DataResult<List<Student>> getAll() {
		return this.studentService.getAll();
	}
}
