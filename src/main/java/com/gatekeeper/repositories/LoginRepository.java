package com.gatekeeper.repositories;

import com.gatekeeper.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface LoginRepository extends JpaRepository<Login, UUID> {

    Optional<Login> findByUserNameAndDomain(String userName, String domain);

    Optional<Login> findByUserIdAndDomain(UUID userId, String domain);

    boolean existsByUserNameAndDomain(String userName, String domain);
}
