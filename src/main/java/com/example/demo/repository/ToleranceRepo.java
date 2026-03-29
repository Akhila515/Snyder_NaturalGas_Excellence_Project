package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ToleranceEntity;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;

@Repository
public interface ToleranceRepo extends JpaRepository<ToleranceEntity, Integer> {

	@Query("select e from ToleranceEntity e where categoryid=:categoryid")
	public List<ToleranceEntity> findByid(@PathParam("categoryid") Integer categoryid);

	@Query("select e from ToleranceEntity e")
	public List<ToleranceEntity> findAll();

	@Modifying
	@Transactional
	@Query("UPDATE ToleranceEntity c SET c.name = :name WHERE c.categoryid = :categoryid")
	int saveAll(@Param("name") String name, @Param("categoryid") Integer categoryid);

	@Modifying
	@Transactional
	@Query("Delete From ToleranceEntity e where e.categoryid=:categoryid")
	int removeById(@Param("categoryid") Integer categoryid);
}
