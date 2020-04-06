package com.example.springmysqlelastic.repo;

import com.example.springmysqlelastic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDAO extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
