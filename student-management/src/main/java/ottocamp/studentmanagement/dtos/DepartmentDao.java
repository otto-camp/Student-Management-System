package ottocamp.studentmanagement.dtos;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {
}
