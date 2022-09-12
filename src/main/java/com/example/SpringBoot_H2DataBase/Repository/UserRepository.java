package com.example.SpringBoot_H2DataBase.Repository;

import com.example.SpringBoot_H2DataBase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {

}