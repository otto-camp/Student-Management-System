package ottocamp.studentmanagement.services.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.dtos.StudentDao;
import ottocamp.studentmanagement.models.Student;
import ottocamp.studentmanagement.services.abstracts.StudentService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class StudentManager implements StudentService {

	private StudentDao studentDao;

	@Autowired
	public StudentManager(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public Result add(Student student) {
		this.studentDao.save(student);
		return new SuccessResult("Student added!");
	}

	@Override
	public Result delete(int id) {
		Student student = new Student();
		student.setId(id);
		this.studentDao.delete(student);
		return new SuccessResult("Student deleted!");
	}

	@Override
	public DataResult<List<Student>> getAll() {
		return new SuccessDataResult<List<Student>>(studentDao.findAll(), "Students listed!");
	}

}
