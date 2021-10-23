package ottocamp.studentmanagement.daos;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ottocamp.studentmanagement.models.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User getByEmail(String email);

	@Transactional
	@Modifying
	@Query("update User e set e.name = :name where e.id = :id")
	void updateName(@Param(value = "id") int id, @Param(value = "name") String name);

	@Transactional
	@Modifying
	@Query("update User e set e.surname = :surname where e.id = :id")
	void updateSurname(@Param(value = "id") int id, @Param(value = "surname") String surname);

	@Transactional
	@Modifying
	@Query("update User e set e.email = :email where e.id = :id")
	void updateEmail(@Param(value = "id") int id, @Param(value = "email") String email);

	@Transactional
	@Modifying
	@Query("update User e set e.password = :password where e.id = :id")
	void updatePassword(@Param(value = "id") int id, @Param(value = "password") String password);

	@Transactional
	@Modifying
	@Query("update User e set e.phoneNumber = :phoneNumber where e.id = :id")
	void updatePhoneNumber(@Param(value = "id") int id, @Param(value = "phoneNumber") String phoneNumber);

	@Transactional
	@Modifying
	@Query("update User e set e.photoUrl = :photoUrl where e.id = :id")
	void updatePhotoUrl(@Param(value = "id") int id, @Param(value = "photoUrl") String photoUrl);

	@Transactional
	@Modifying
	@Query("update User e set e.address = :address where e.id = :id")
	void updateAddress(@Param(value = "id") int id, @Param(value = "address") String address);

	@Transactional
	@Modifying
	@Query("update User e set e.birthDate = :birthDate where e.id = :id")
	void updateBirthDate(@Param(value = "id") int id, @Param(value = "birthDate") Date birthDate);
}
