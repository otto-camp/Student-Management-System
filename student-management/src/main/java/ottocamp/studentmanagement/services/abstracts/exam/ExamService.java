package ottocamp.studentmanagement.services.abstracts.exam;

import ottocamp.studentmanagement.models.exam.Exam;
import ottocamp.studentmanagement.utils.Result;

public interface ExamService {

	Result add(Exam exam);

	Result delete(Exam exam);

	Result update(int id, Exam exam);
}
