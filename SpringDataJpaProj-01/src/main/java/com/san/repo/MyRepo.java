package com.san.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.san.entity.User_login;
@Repository
public interface MyRepo extends CrudRepository<User_login,Integer> {
   
}
