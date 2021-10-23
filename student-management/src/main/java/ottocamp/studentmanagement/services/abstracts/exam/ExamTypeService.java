package ottocamp.studentmanagement.services.abstracts.exam;

import java.util.List;

import ottocamp.studentmanagement.models.exam.ExamType;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface ExamTypeService {

	Result add(ExamType examType);

	Result delete(int id);

	Result updateName(int id, String name);
	
	Result updateDescription(int id, String description);
	
	DataResult<List<ExamType>> getAll();
}
