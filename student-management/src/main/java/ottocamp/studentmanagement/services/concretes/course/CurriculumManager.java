package ottocamp.studentmanagement.services.concretes.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.daos.InstructorDao;
import ottocamp.studentmanagement.daos.StudentDao;
import ottocamp.studentmanagement.daos.course.CourseDao;
import ottocamp.studentmanagement.daos.course.CurriculumDao;
import ottocamp.studentmanagement.models.course.Curriculum;
import ottocamp.studentmanagement.models.dtos.CurriculumAddDto;
import ottocamp.studentmanagement.services.abstracts.course.CurriculumService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;
import ottocamp.studentmanagement.utils.SuccessDataResult;
import ottocamp.studentmanagement.utils.SuccessResult;

@Service
public class CurriculumManager implements CurriculumService {

	private CurriculumDao curriculumDao;
	private CourseDao courseDao;
	private StudentDao studentDao;
	private InstructorDao instructorDao;

	@Autowired
	public CurriculumManager(CurriculumDao curriculumDao, CourseDao courseDao, StudentDao studentDao,
			InstructorDao instructorDao) {
		super();
		this.curriculumDao = curriculumDao;
		this.courseDao = courseDao;
		this.studentDao = studentDao;
		this.instructorDao = instructorDao;
	}

	@Override
	public Result add(CurriculumAddDto curriculumAddDto) {
		Curriculum curriculum = new Curriculum();
		curriculum.setId(curriculumAddDto.getId());
		curriculum.setClassroom(curriculumAddDto.getClassroom());
		curriculum.setStartTime(curriculumAddDto.getStartTime());
		curriculum.setEndTime(curriculumAddDto.getEndTime());
		curriculum.setCourse(this.courseDao.getById(curriculumAddDto.getCourseId()));
		curriculum.setInstructor(this.instructorDao.getById(curriculumAddDto.getInstructorId()));
		curriculum.setStudent(this.studentDao.getById(curriculumAddDto.getStudentId()));
		this.curriculumDao.save(curriculum);
		return new SuccessResult("Curriculum added!");

	}

	@Override
	public Result delete(int id) {
		Curriculum curriculum = new Curriculum();
		curriculum.setId(id);
		this.curriculumDao.delete(curriculum);
		return new SuccessResult("Curriculum deleted!");
	}

	@Override
	public DataResult<List<Curriculum>> getAll() {
		return new SuccessDataResult<List<Curriculum>>(this.curriculumDao.findAll(), "Curriculum listed!");
	}
}
