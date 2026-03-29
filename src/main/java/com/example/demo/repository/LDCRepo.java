package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ChargesEntity;

import jakarta.websocket.server.PathParam;

@Repository
public interface LDCRepo extends JpaRepository<ChargesEntity, Integer> {

	@Query("select e from ChargesEntity e where chargeid=:chargeid")
	public ChargesEntity findByid(@PathParam("chargeid") Integer chargeid);

	@Query("select e from ChargesEntity e")
	public List<ChargesEntity> findAll();



}
