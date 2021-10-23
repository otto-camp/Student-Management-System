package ottocamp.studentmanagement.services.concretes.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.exam.ExamDao;
import ottocamp.studentmanagement.models.exam.Exam;
import ottocamp.studentmanagement.services.abstracts.exam.ExamService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
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
	public Result delete(int id) {
		Exam exam = new Exam();
		exam.setId(id);
		this.examDao.delete(exam);
		return new SuccessResult("Exam deleted!");
	}

	@Override
	public Result updateName(int id, String name) {
		this.examDao.updateName(id, name);
		return new SuccessResult("Exam name updated!");
	}

	@Override
	public DataResult<List<Exam>> getAll() {
		return new SuccessDataResult<List<Exam>>(this.examDao.findAll(), "Exams listed!");
	}

}
