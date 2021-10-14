package ottocamp.studentmanagement.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {
}
