package ottocamp.studentmanagement.api.controllers.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.dtos.ExamResultAddDto;
import ottocamp.studentmanagement.services.abstracts.exam.ExamResultService;
import ottocamp.studentmanagement.utils.Result;

@RestController
@RequestMapping("/api/examresult/")
@CrossOrigin
public class ExamResultController {

	private ExamResultService examResultService;

	@Autowired
	public ExamResultController(ExamResultService examResultService) {
		super();
		this.examResultService = examResultService;
	}

	@PostMapping("add")
	public Result add(@RequestBody ExamResultAddDto examResultAddDto) {
		return examResultService.add(examResultAddDto);
	}

	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {
		return examResultService.delete(id);
	}
	
	@PostMapping("update")
	public Result update(@RequestParam int id, String grade) {
		return examResultService.update(id, grade);
	}
}
