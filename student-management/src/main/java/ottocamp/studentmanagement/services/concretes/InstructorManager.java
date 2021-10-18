package ottocamp.studentmanagement.services.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.InstructorDao;
import ottocamp.studentmanagement.daos.UserDao;
import ottocamp.studentmanagement.models.Instructor;
import ottocamp.studentmanagement.models.dtos.InstructorAddDto;
import ottocamp.studentmanagement.services.abstracts.InstructorService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class InstructorManager implements InstructorService {

	private InstructorDao instructorDao;
	private UserDao userDao;

	@Autowired
	public InstructorManager(InstructorDao instructorDao, UserDao userDao) {
		super();
		this.instructorDao = instructorDao;
		this.userDao = userDao;
	}

	@Override
	public Result add(InstructorAddDto instructorAddDto) {
		Instructor instructor = new Instructor();
		instructor.setId(instructorAddDto.id);
		instructor.setDepartmentId(instructorAddDto.departmentId);
		instructor.setEmail(instructorAddDto.email);
		instructor.setPassword(instructorAddDto.password);
		instructor.setName(instructorAddDto.name);
		instructor.setSurname(instructorAddDto.surname);
		instructor.setPhoneNumber(instructorAddDto.phoneNumber);
		instructor.setPhotoUrl(instructorAddDto.photoUrl);
		this.instructorDao.save(instructor);
		return new SuccessResult("Instructor added!");
	}

	@Override
	public Result delete(int id) {
		Instructor instructor = new Instructor();
		instructor.setId(id);
		this.instructorDao.delete(instructor);
		return new SuccessResult("Instructor deleted!");
	}

	
	@Override
	public Result updateName(int id, String name) {
		this.userDao.updateName(id, name);
		return new SuccessResult("Name updated!");
	}

	@Override
	public Result updateSurname(int id, String surname) {
		this.userDao.updateSurname(id, surname);
		return new SuccessResult("Surname updated!");
	}

	@Override
	public Result updateEmail(int id, String email) {
		this.userDao.updateEmail(id, email);
		return new SuccessResult("Email updated!");
	}

	@Override
	public Result updatePassword(int id, String password) {
		this.userDao.updatePassword(id, password);
		return new SuccessResult("Password updated!");
	}

	@Override
	public Result updatePhoneNumber(int id, String phoneNumber) {
		this.userDao.updatePhoneNumber(id, phoneNumber);
		return new SuccessResult("Phone number updated!");
	}

	@Override
	public Result updatePhotoUrl(int id, String photoUrl) {
		this.userDao.updatePhotoUrl(id, photoUrl);
		return new SuccessResult("Photo url updated!");
	}

	@Override
	public DataResult<List<Instructor>> getAll() {
		return new SuccessDataResult<List<Instructor>>(instructorDao.findAll(), "Instructors listed!");
	}

}
