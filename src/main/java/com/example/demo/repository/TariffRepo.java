package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.TariffEntity;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;

@Repository
public interface TariffRepo extends JpaRepository<TariffEntity, Integer> {

	@Query("select e from TariffEntity e where ldcrrid=:ldcrrid")
	public List<TariffEntity> findByid(@PathParam("ldcrrid") Integer ldcrrid);

	@Query("select e from TariffEntity e")
	public List<TariffEntity> findAll();

	@Modifying
	@Transactional
	@Query("UPDATE TariffEntity c SET c.amount = :amount WHERE c.ldcrrid = :ldcrrid")
	int saveAll(@Param("amount") BigDecimal amount, @Param("ldcrrid") Integer ldcrrid);

	@Modifying
	@Transactional
	@Query("Delete From TariffEntity e where e.ldcrrid=:ldcrrid")
	int removeById(@Param("ldcrrid") Integer ldcrrid);

}
