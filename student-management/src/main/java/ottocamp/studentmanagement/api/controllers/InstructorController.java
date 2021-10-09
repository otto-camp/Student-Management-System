package ottocamp.studentmanagement.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.Instructor;
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
	public Result add(@RequestBody  Instructor instructor) {
		return this.instructorService.add(instructor);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestBody Instructor instructor) {
		return this.instructorService.delete(instructor);
	}
	
	@GetMapping("getall")
	public DataResult<List<Instructor>> getAll(){
		return this.instructorService.getAll();
	}
}
