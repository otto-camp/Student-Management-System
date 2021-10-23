package ottocamp.studentmanagement.services.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.StudentDao;
import ottocamp.studentmanagement.daos.UserDao;
import ottocamp.studentmanagement.models.Student;
import ottocamp.studentmanagement.models.dtos.StudentAddDto;
import ottocamp.studentmanagement.services.abstracts.StudentService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class StudentManager implements StudentService {

	private StudentDao studentDao;
	private UserDao userDao;

	@Autowired
	public StudentManager(StudentDao studentDao, UserDao userDao) {
		super();
		this.studentDao = studentDao;
		this.userDao = userDao;
	}

	@Override
	public Result add(StudentAddDto studentAddDto) {
		Student student = new Student();
		student.setId(studentAddDto.id);
		student.setName(studentAddDto.name);
		student.setSurname(studentAddDto.surname);
		student.setStudentId(studentAddDto.studentId);
		student.setBirthDate(studentAddDto.birthDate);
		student.setEmail(studentAddDto.email);
		student.setPhoneNumber(studentAddDto.phoneNumber);
		student.setPhotoUrl(studentAddDto.photoUrl);
		student.setPassword(studentAddDto.password);
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
	public Result updateBirthDate(int id, Date birthDate) {
		this.userDao.updateBirthDate(id, birthDate);
		return new SuccessResult("Birth date updated!");
	}

	@Override
	public Result updateAddress(int id, String address) {
		this.userDao.updateAddress(id, address);
		return new SuccessResult("Address updated!");
	}

	@Override
	public DataResult<List<Student>> getAll() {
		return new SuccessDataResult<List<Student>>(studentDao.findAll(), "Students listed!");
	}
}
