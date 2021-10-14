package ottocamp.studentmanagement.services.concretes.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.dtos.exam.ExamDao;
import ottocamp.studentmanagement.models.exam.Exam;
import ottocamp.studentmanagement.services.abstracts.exam.ExamService;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class ExamManager implements ExamService {

	private ExamDao examDao;

	@Autowired
	public ExamManager(ExamDao examDao) {
		super();
		this.examDao = examDao;
	}

	@Override
	public Result add(Exam exam) {
		this.examDao.save(exam);
		return new SuccessResult("Exam added!");
	}

	@Override
	public Result delete(Exam exam) {
		this.examDao.delete(exam);
		return new SuccessResult("Exam deleted!");
	}

	@Override
	public Result update(int id, Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

}
