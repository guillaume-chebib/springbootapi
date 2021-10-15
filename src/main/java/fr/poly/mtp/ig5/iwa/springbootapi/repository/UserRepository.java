package fr.poly.mtp.ig5.iwa.springbootapi.repository;

import fr.poly.mtp.ig5.iwa.springbootapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
