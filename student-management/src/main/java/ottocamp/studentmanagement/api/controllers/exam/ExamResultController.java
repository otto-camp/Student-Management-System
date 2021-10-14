package ottocamp.studentmanagement.api.controllers.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.exam.ExamResult;
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
	public Result add(@RequestBody ExamResult examResult) {
		return examResultService.add(examResult);
	}

	@DeleteMapping("delete")
	public Result delete(@RequestBody ExamResult examResult) {
		return examResultService.delete(examResult);
	}
}
