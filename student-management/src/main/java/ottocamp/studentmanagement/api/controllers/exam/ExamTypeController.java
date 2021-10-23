package ottocamp.studentmanagement.api.controllers.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.exam.ExamType;
import ottocamp.studentmanagement.services.abstracts.exam.ExamTypeService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

@RestController
@RequestMapping("/api/examtype/")
@CrossOrigin
public class ExamTypeController {

	private ExamTypeService examTypeService;

	@Autowired
	public ExamTypeController(ExamTypeService examTypeService) {
		super();
		this.examTypeService = examTypeService;
	}

	@PostMapping("add")
	public Result add(@RequestBody ExamType examType) {
		return this.examTypeService.add(examType);
	}

	@DeleteMapping("delete")
	public Result delete(int id) {
		return this.examTypeService.delete(id);
	}
	
	@PostMapping("update-name")
	public Result updateName(int id, String name) {
		return this.examTypeService.updateName(id, name);
	}
	
	@PostMapping("update-description")
	public Result updateDescription(int id, String description) {
		return this.examTypeService.updateDescription(id, description);
	}
	
	@GetMapping("getall")
	public DataResult<List<ExamType>> getAll(){
		return this.examTypeService.getAll();
	}
}
