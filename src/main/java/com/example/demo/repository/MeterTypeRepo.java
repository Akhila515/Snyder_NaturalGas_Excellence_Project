package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Entity.MeterTypeEntity;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;

public interface MeterTypeRepo extends JpaRepository<MeterTypeEntity, Integer> {
	
	@Query("select e from MeterTypeEntity e where metertypeid=:metertypeid")
	public List<MeterTypeEntity> findByid(@PathParam("metertypeid") Integer metertypeid);
	
	@Query("select e from MeterTypeEntity e")
	public List<MeterTypeEntity> findAll();
	
	@Modifying
	@Transactional
	@Query("UPDATE MeterTypeEntity c SET c.metertype = :metertype WHERE c.metertypeid = :metertypeid")
	int saveAll(@Param("metertype") String metertype, @Param("metertypeid") Integer metertypeid);
	
	@Modifying
	@Transactional
	@Query("Delete From MeterTypeEntity e where e.metertypeid=:metertypeid")
	int removeById(@Param("metertypeid") Integer metertypeid);


	

}

