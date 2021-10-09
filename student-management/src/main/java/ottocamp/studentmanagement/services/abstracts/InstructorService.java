package ottocamp.studentmanagement.services.abstracts;

import java.util.List;

import ottocamp.studentmanagement.models.Instructor;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface InstructorService {
	Result add(Instructor instructor);

	Result delete(Instructor instructor);

	DataResult<List<Instructor>> getAll();
}
