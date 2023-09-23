package com.Kiran.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kiran.demo.model.Model;

@Repository
public interface InfoRepository extends JpaRepository<Model, String>{

}