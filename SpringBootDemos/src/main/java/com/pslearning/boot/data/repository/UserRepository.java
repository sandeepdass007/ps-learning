package com.pslearning.boot.data.repository;

import com.pslearning.boot.dao.UserDao;
import com.pslearning.boot.entity.User;
import com.pslearning.boot.projection.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT new com.pslearning.boot.dao.UserDao(u.id, u.firstName, u.lastName) FROM User u")
    public Set<UserDao> findAllUserDaos();

    @Query(value = "SELECT u.id as id, u.firstName as firstName, u.lastName as lastName FROM User u")
    public Set<UserProjection> findAllUserProjections();
}
