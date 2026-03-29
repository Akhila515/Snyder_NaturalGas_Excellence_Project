package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ChargesEntity;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.model.ChargesModel;
import com.example.demo.repository.LDCRepo;

@Service
public class LDCChargesService {

	@Autowired
	LDCRepo ldcrepo;

	public ChargesModel getById(Integer chargeid) {
		ChargesEntity entity = ldcrepo.findByid(chargeid);

		if (entity == null) {
			throw new DataNotFoundException("There is no record for this ID.Please add the data");
		}

		ChargesModel model = new ChargesModel();

		model.setLdcid(entity.getLdcid());
		model.setName(entity.getName());
		model.setChargeid(entity.getChargeid());
		model.setMeterid(entity.getMeterid());
		model.setChargetype(entity.getChargetype());

		return model;
	}

	public List<ChargesModel> getAll() {
		List<ChargesEntity> lEntity = ldcrepo.findAll();

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no data available");
		}

		List<ChargesModel> lModel = new ArrayList<>();

		for (ChargesEntity entity : lEntity) {

			ChargesModel model = new ChargesModel();

			model.setLdcid(entity.getLdcid());
			model.setName(entity.getName());
			model.setChargeid(entity.getChargeid());
			model.setMeterid(entity.getMeterid());
			model.setChargetype(entity.getChargetype());

			lModel.add(model);
		}

		return lModel;
	}

	public void saveAll(ChargesModel model) {
		ChargesEntity entity = new ChargesEntity();

		if (model.getChargeid() == null || model.getName() == null) {
			throw new DataNotFoundException("Please provide proper data");
		}

		entity.setLdcid(model.getLdcid());
		entity.setName(model.getName());
		entity.setChargeid(model.getChargeid());
		entity.setMeterid(model.getMeterid());
		entity.setChargetype(model.getChargetype());

		ldcrepo.save(entity);
	}

	public void updateAll(Integer chargeid, ChargesModel model) {
		// String name = model.getName();

		ChargesEntity entity = ldcrepo.findByid(chargeid);

		if (entity == null) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
		if (model.getName() != null) {
			entity.setName(model.getName());
		}
		if (model.getLdcid() != null) {
			entity.setLdcid(model.getLdcid());
		}
		if (model.getMeterid() != null) {
			entity.setMeterid(model.getMeterid());
		}
		if (model.getChargetype() != null) {
			entity.setChargetype(model.getChargetype());
		}

		ldcrepo.save(entity);

	}

	public void removeById(Integer chargeid) {
		ChargesEntity entity = ldcrepo.findByid(chargeid);
		if (entity == null) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
		ldcrepo.delete(entity);
	}
}
