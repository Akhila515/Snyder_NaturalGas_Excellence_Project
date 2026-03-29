package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.Entity.QuantityEntity;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;

@Repository
public interface QuantityRepo extends JpaRepository<QuantityEntity, Integer> {

	@Query("select e from QuantityEntity e where dailytypeid=:dailytypeid")
	public List<QuantityEntity> findByid(@PathParam("dailytypeid") Integer dailytypeid);

	@Query("select e from QuantityEntity e")
	public List<QuantityEntity> findAll();

	@Modifying
	@Transactional
	@Query("UPDATE QuantityEntity c SET c.name = :name WHERE c.dailytypeid = :dailytypeid")
	int saveAll(@Param("name") String name, @Param("dailytypeid") Integer dailytypeid);

	@Modifying
	@Transactional
	@Query("Delete From QuantityEntity e where e.dailytypeid=:dailytypeid")
	int removeById(@Param("dailytypeid") Integer dailytypeid);

}
