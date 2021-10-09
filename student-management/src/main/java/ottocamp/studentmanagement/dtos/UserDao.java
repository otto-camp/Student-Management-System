package ottocamp.studentmanagement.dtos;

import org.springframework.data.jpa.repository.JpaRepository;

import ottocamp.studentmanagement.models.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User getByEmail(String email);
}
