package ottocamp.studentmanagement.services.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.InstructorDao;
import ottocamp.studentmanagement.models.Instructor;
import ottocamp.studentmanagement.services.abstracts.InstructorService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class InstructorManager implements InstructorService {

	private InstructorDao instructorDao;

	@Autowired
	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
	}

	@Override
	public Result add(Instructor instructor) {
		this.instructorDao.save(instructor);
		return new SuccessResult("Instructor added!");
	}

	@Override
	public Result delete(Instructor instructor) {
		this.instructorDao.delete(instructor);
		return new SuccessResult("Instructor deleted!");
	}

	@Override
	public DataResult<List<Instructor>> getAll() {
		return new SuccessDataResult<List<Instructor>>(instructorDao.findAll(), "Instructors listed!");
	}

}
