package ottocamp.studentmanagement.services.abstracts.exam;

import ottocamp.studentmanagement.models.dtos.ExamResultAddDto;
import ottocamp.studentmanagement.utils.Result;

public interface ExamResultService {

	Result add(ExamResultAddDto examResultAddDto);

	Result delete(int id);

	Result update(int id, String grade);
}
