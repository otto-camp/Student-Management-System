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

import ottocamp.studentmanagement.models.Department;
import ottocamp.studentmanagement.services.abstracts.DepartmentService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

@RestController
@RequestMapping("/api/department/")
@CrossOrigin
public class DepartmentController {

	private DepartmentService departmentService;

	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Department department) {
		return this.departmentService.add(department);
	}

	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {
		return this.departmentService.delete(id);
	}
	
	@PostMapping("update")
	public Result update(int id, String name) {
		return this.departmentService.update(id, name);
	}

	@GetMapping("getall")
	public DataResult<List<Department>> getAll() {
		return this.departmentService.getAll();
	}
}
