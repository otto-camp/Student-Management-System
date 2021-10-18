package ottocamp.studentmanagement.services.concretes.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.InstructorDao;
import ottocamp.studentmanagement.daos.StudentDao;
import ottocamp.studentmanagement.daos.exam.ExamDao;
import ottocamp.studentmanagement.daos.exam.ExamResultDao;
import ottocamp.studentmanagement.models.dtos.ExamResultAddDto;
import ottocamp.studentmanagement.models.exam.ExamResult;
import ottocamp.studentmanagement.services.abstracts.exam.ExamResultService;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class ExamResultManager implements ExamResultService {

	ExamResult examResult = new ExamResult();
	private ExamResultDao examResultDao;
	private StudentDao studentDao;
	private InstructorDao instructorDao;
	private ExamDao examDao;

	@Autowired
	public ExamResultManager(ExamResultDao examResultDao, StudentDao studentDao, InstructorDao instructorDao,
			ExamDao examDao) {
		super();
		this.examResultDao = examResultDao;
		this.studentDao = studentDao;
		this.instructorDao = instructorDao;
		this.examDao = examDao;
	}

	@Override
	public Result add(ExamResultAddDto examResultAddDto) {
		examResult.setId(examResultAddDto.id);
		examResult.setExam(this.examDao.getById(examResultAddDto.examId));
		examResult.setStudent(this.studentDao.getById(examResultAddDto.studentId));
		examResult.setInstructor(this.instructorDao.getById(examResultAddDto.instructorId));
		examResult.setGrade(examResultAddDto.grade);
		this.examResultDao.save(examResult);
		return new SuccessResult("Exam result added!");
	}

	@Override
	public Result delete(int id) {
		examResult.setId(id);
		this.examResultDao.delete(examResult);
		return new SuccessResult("Exam result deleted!");

	}

	@Override
	public Result update(int id, String grade) {
		this.examResultDao.updateGrade(id, grade);
		return new SuccessResult("Exam result updated!");
	}

}
