package ottocamp.studentmanagement.services.abstracts.course;

import java.util.List;

import ottocamp.studentmanagement.models.course.Curriculum;
import ottocamp.studentmanagement.models.dtos.CurriculumAddDto;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface CurriculumService {

	Result add (CurriculumAddDto curriculumAddDto);
	
	Result delete(int id);
	
	Result updateClassroom(int id, String classroom);
	
	Result updateStartTime(int id, String startTime);
	
	Result updateEndTime(int id, String endTime);
	
	DataResult<List<Curriculum>> getAll();
}
