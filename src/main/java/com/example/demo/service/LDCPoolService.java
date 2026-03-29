package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.PoolEntity;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.model.PoolModel;
import com.example.demo.repository.PoolRepo;

@Service
public class LDCPoolService {

	@Autowired
	PoolRepo poolrepo;

	public List<PoolModel> getById(Integer ldcpoolid) {
		List<PoolEntity> lEntity = poolrepo.findByid(ldcpoolid);

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no record for this ID.Please add the data");
		}

		PoolModel model = new PoolModel();

		List<PoolModel> lModel = new ArrayList<>();

		for (PoolEntity entity : lEntity) {

			model.setLdcid(entity.getLdcid());
			model.setLdcpoolid(entity.getLdcpoolid());
			model.setPoolname(entity.getPoolname());
			model.setAccountnumber(entity.getAccountnumber());
			model.setPrimarypileline(entity.getPrimarypileline());
		}
		lModel.add(model);
		return lModel;
	}

	public List<PoolModel> getAll() {
		List<PoolEntity> lEntity = poolrepo.findAll();

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no data available");
		}

		List<PoolModel> lModel = new ArrayList<>();

		for (PoolEntity entity : lEntity) {

			PoolModel model = new PoolModel();

			model.setLdcid(entity.getLdcid());
			model.setLdcpoolid(entity.getLdcpoolid());
			model.setPoolname(entity.getPoolname());
			model.setAccountnumber(entity.getAccountnumber());
			model.setPrimarypileline(entity.getPrimarypileline());

			lModel.add(model);
		}

		return lModel;
	}

	public void saveAll(PoolModel model) {
		PoolEntity entity = new PoolEntity();

		if (model.getLdcid() == null) {
			throw new DataNotFoundException("Please provide proper data");
		}

		entity.setLdcid(model.getLdcid());
		entity.setLdcpoolid(model.getLdcpoolid());
		entity.setPoolname(model.getPoolname());
		entity.setAccountnumber(model.getAccountnumber());
		entity.setPrimarypileline(model.getPrimarypileline());

		poolrepo.save(entity);
	}

	public void updateAll(Integer ldcpoolid, PoolModel model) {
		String name = model.getPoolname();

		int record = poolrepo.saveAll(name, ldcpoolid);

		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

	public void removeById(Integer ldcpoolid) {
		int record = poolrepo.removeById(ldcpoolid);
		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

}
