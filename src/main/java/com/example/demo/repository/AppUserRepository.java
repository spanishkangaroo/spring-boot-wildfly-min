package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    List<AppUser> findByEmail(String email);
}