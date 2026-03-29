package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.PoolEntity;


import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;

@Repository
public interface PoolRepo extends JpaRepository<PoolEntity, Integer> {

	@Query("select e from PoolEntity e where ldcpoolid=:ldcpoolid")
	public List<PoolEntity> findByid(@PathParam("ldcpoolid") Integer ldcpoolid);

	@Query("select e from PoolEntity e")
	public List<PoolEntity> findAll();

	@Modifying
	@Transactional
	@Query("UPDATE PoolEntity c SET c.poolname = :poolname WHERE c.ldcpoolid = :ldcpoolid")
	int saveAll(@Param("poolname") String poolname, @Param("ldcpoolid") Integer ldcpoolid);

	@Modifying
	@Transactional
	@Query("Delete From PoolEntity e where e.ldcpoolid=:ldcpoolid")
	int removeById(@Param("ldcpoolid") Integer ldcpoolid);
}
