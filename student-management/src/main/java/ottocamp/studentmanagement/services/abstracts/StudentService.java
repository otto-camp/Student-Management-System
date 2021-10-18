package ottocamp.studentmanagement.services.abstracts;

import java.sql.Date;
import java.util.List;

import ottocamp.studentmanagement.models.Student;
import ottocamp.studentmanagement.models.dtos.StudentAddDto;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface StudentService {
	Result add(StudentAddDto studentAddDto);

	Result delete(int id);

	Result updateName(int id, String name);

	Result updateSurname(int id, String surname);

	Result updateEmail(int id, String email);

	Result updatePassword(int id, String password);

	Result updatePhoneNumber(int id, String phoneNumber);

	Result updatePhotoUrl(int id, String photoUrl);

	Result updateBirthDate(int id, Date birthDate);

	DataResult<List<Student>> getAll();
}
