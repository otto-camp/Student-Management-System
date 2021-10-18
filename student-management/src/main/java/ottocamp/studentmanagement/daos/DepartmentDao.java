package ottocamp.studentmanagement.daos;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

	@Transactional
	@Modifying
	@Query("update Department d set d.name = :name where d.id = :id")
	void updateName(@Param(value = "id") int id, @Param(value = "name") String name);
}
