package ottocamp.studentmanagement.services.abstracts;

import java.util.List;

import ottocamp.studentmanagement.models.User;
import ottocamp.studentmanagement.utils.DataResult;

public interface UserService {
	DataResult<List<User>> getAll();

}
