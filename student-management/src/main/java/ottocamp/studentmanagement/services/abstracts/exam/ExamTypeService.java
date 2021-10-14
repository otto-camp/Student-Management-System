package ottocamp.studentmanagement.services.abstracts.exam;

import ottocamp.studentmanagement.models.exam.ExamType;
import ottocamp.studentmanagement.utils.Result;

public interface ExamTypeService {

	Result add(ExamType examType);

	Result delete(ExamType examType);

	Result update(int id, ExamType examType);
}
