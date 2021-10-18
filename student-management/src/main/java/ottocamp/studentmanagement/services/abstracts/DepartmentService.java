package ottocamp.studentmanagement.services.abstracts;

import java.util.List;

import ottocamp.studentmanagement.models.Department;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.Result;

public interface DepartmentService {
	Result add(Department department);

	Result delete(int id);
	
	Result update(int id, String name);

	DataResult<List<Department>> getAll();
}
