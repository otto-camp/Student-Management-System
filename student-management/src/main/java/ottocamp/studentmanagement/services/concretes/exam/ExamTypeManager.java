package ottocamp.studentmanagement.services.concretes.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.exam.ExamTypeDao;
import ottocamp.studentmanagement.models.exam.ExamType;
import ottocamp.studentmanagement.services.abstracts.exam.ExamTypeService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
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
	public Result delete(int id) {
		ExamType examType = new ExamType();
		examType.setId(id);
		this.examTypeDao.delete(examType);
		return new SuccessResult("Exam type deleted!");
	}

	@Override
	public Result updateName(int id, String name) {
		this.examTypeDao.updateName(id, name);
		return new SuccessResult("Name updated!");
	}

	@Override
	public Result updateDescription(int id, String description) {
		this.examTypeDao.updateDescription(id, description);
		return new SuccessResult("Description updated!");
	}

	@Override
	public DataResult<List<ExamType>> getAll() {
		return new SuccessDataResult<List<ExamType>>(this.examTypeDao.findAll(), "Exam types listed!");
	}
}
