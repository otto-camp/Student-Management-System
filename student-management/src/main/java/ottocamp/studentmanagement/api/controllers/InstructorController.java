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

import ottocamp.studentmanagement.models.Instructor;
import ottocamp.studentmanagement.models.dtos.InstructorAddDto;
import ottocamp.studentmanagement.services.abstracts.InstructorService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

@RestController
@RequestMapping("/api/instructor/")
@CrossOrigin
public class InstructorController {

	private InstructorService instructorService;

	@Autowired
	public InstructorController(InstructorService instructorService) {
		super();
		this.instructorService = instructorService;
	}

	@PostMapping("add")
	public Result add(@RequestBody InstructorAddDto instructorAddDto) {
		return this.instructorService.add(instructorAddDto);
	}

	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {
		return this.instructorService.delete(id);
	}

	@PostMapping("update-name")
	public Result updateName(int id, String name) {
		return this.instructorService.updateName(id, name);
	}

	@PostMapping("update-surname")
	public Result updateSurname(int id, String surname) {
		return this.instructorService.updateSurname(id, surname);
	}

	@PostMapping("update-email")
	public Result updateEmail(int id, String email) {
		return this.instructorService.updateEmail(id, email);
	}

	@PostMapping("update-password")
	public Result updatePassword(int id, String password) {
		return this.instructorService.updatePassword(id, password);
	}

	@PostMapping("update-phone-number")
	public Result updatePhoneNumber(int id, String phoneNumber) {
		return this.instructorService.updatePhoneNumber(id, phoneNumber);
	}

	@PostMapping("update-photo-url")
	public Result updatePhotoUrl(int id, String photoUrl) {
		return this.instructorService.updatePhotoUrl(id, photoUrl);
	}

	@GetMapping("getall")
	public DataResult<List<Instructor>> getAll() {
		return this.instructorService.getAll();
	}
}
