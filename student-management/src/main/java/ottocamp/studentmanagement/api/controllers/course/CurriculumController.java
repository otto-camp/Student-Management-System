package ottocamp.studentmanagement.api.controllers.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.course.Curriculum;
import ottocamp.studentmanagement.models.dtos.CurriculumAddDto;
import ottocamp.studentmanagement.services.abstracts.course.CurriculumService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

@RestController
@RequestMapping("/api/curriculum/")
@CrossOrigin
public class CurriculumController {

	private CurriculumService curriculumService;

	@Autowired
	public CurriculumController(CurriculumService curriculumService) {
		super();
		this.curriculumService = curriculumService;
	}

	@PostMapping("add")
	public Result add(@RequestBody CurriculumAddDto curriculumAddDto) {
		return this.curriculumService.add(curriculumAddDto);
	}

	@DeleteMapping("delete")
	public Result delete(int id) {
		return this.curriculumService.delete(id);
	}
	
	@PostMapping("update-classroom")
	public Result updateClassroom(int id, String classroom) {
		return this.curriculumService.updateClassroom(id, classroom);
	}
	
	@PostMapping("update-start-time")
	public Result updateStartTime(int id, String startTime) {
		return this.curriculumService.updateStartTime(id, startTime);
	}
	
	@PostMapping("update-end-time")
	public Result updateEndTime(int id, String endTime) {
		return this.curriculumService.updateEndTime(id, endTime);
	}
	
	@GetMapping("getall")
	public DataResult<List<Curriculum>> getAll(){
		return this.curriculumService.getAll();
	}
}
