package ottocamp.studentmanagement.services.abstracts.exam;

import ottocamp.studentmanagement.models.exam.ExamResult;
import ottocamp.studentmanagement.utils.Result;

public interface ExamResultService {

	Result add(ExamResult examResult);

	Result delete(ExamResult examResult);

	Result update(int id, ExamResult examResult);
}
