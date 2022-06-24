package tech.getarrays.usermanagement.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.getarrays.usermanagement.model.ERole;
import tech.getarrays.usermanagement.model.Role;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
