package com.italogvss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.italogvss.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
