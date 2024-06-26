package com.example.application.data.repository;

import com.example.application.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//create,update, delete operations
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
