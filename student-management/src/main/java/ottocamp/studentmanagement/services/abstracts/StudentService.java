package ottocamp.studentmanagement.services.abstracts;

import java.util.List;

import ottocamp.studentmanagement.models.Student;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface StudentService {
	Result add(Student student);

	Result delete(int id);

	DataResult<List<Student>> getAll();
}
