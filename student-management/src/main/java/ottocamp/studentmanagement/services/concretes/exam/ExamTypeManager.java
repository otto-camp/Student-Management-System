package ottocamp.studentmanagement.services.concretes.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.exam.ExamTypeDao;
import ottocamp.studentmanagement.models.exam.ExamType;
import ottocamp.studentmanagement.services.abstracts.exam.ExamTypeService;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class ExamTypeManager implements ExamTypeService {

	private ExamTypeDao examTypeDao;

	@Autowired
	public ExamTypeManager(ExamTypeDao examTypeDao) {
		super();
		this.examTypeDao = examTypeDao;
	}

	@Override
	public Result add(ExamType examType) {
		this.examTypeDao.save(examType);
		return new SuccessResult("Exam type added!");
	}

	@Override
	public Result delete(ExamType examType) {
		this.examTypeDao.delete(examType);
		return new SuccessResult("Exam type deleted!");
	}

	@Override
	public Result update(int id, ExamType examType) {
		// TODO Auto-generated method stub
		return null;
	}
}
