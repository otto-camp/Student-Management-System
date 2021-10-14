package ottocamp.studentmanagement.api.controllers.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.exam.Exam;
import ottocamp.studentmanagement.services.abstracts.exam.ExamService;
import ottocamp.studentmanagement.utils.Result;

@RestController
@RequestMapping("/api/exam")
@CrossOrigin
public class ExamController {

	private ExamService examService;

	@Autowired
	public ExamController(ExamService examService) {
		super();
		this.examService = examService;
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Exam exam) {
		return this.examService.add(exam);
	}
	
	@DeleteMapping("delete")
	public Result delete(@RequestBody Exam exam) {
		return this.examService.delete(exam);
	}
}
