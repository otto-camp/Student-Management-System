package ottocamp.studentmanagement.api.controllers.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.exam.ExamType;
import ottocamp.studentmanagement.services.abstracts.exam.ExamTypeService;
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
	public Result delete(@RequestBody ExamType examType) {
		return this.examTypeService.delete(examType);
	}
	
}
