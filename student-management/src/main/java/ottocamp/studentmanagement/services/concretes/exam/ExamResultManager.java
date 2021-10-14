package ottocamp.studentmanagement.services.concretes.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.dtos.exam.ExamResultDao;
import ottocamp.studentmanagement.models.exam.ExamResult;
import ottocamp.studentmanagement.services.abstracts.exam.ExamResultService;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class ExamResultManager implements ExamResultService{

	private ExamResultDao examResultDao;
	@Autowired
	public ExamResultManager(ExamResultDao examResultDao) {
		super();
		this.examResultDao = examResultDao;
	}

	@Override
	public Result add(ExamResult examResult) {
		this.examResultDao.save(examResult);
		return new SuccessResult("Exam result added!"); 
	}

	@Override
	public Result delete(ExamResult examResult) {
		this.examResultDao.delete(examResult);
		return new SuccessResult("Exam result deleted!");
		
	}

	@Override
	public Result update(int id, ExamResult examResult) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
