package ottocamp.studentmanagement.services.abstracts.exam;

import java.util.List;

import ottocamp.studentmanagement.models.exam.Exam;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface ExamService {

	Result add(Exam exam);

	Result delete(int id);

	Result updateName(int id, String name);
	
	DataResult<List<Exam>> getAll();
}
