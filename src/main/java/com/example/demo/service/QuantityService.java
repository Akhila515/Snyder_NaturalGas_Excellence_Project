package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.QuantityEntity;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.model.QuantityModel;
import com.example.demo.repository.QuantityRepo;

@Service
public class QuantityService {

	@Autowired
	QuantityRepo quantityrepo;

	public List<QuantityModel> getById(Integer dailytypeid) {
		List<QuantityEntity> lEntity = quantityrepo.findByid(dailytypeid);

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no record for this ID.Please add the data");
		}

		QuantityModel model = new QuantityModel();

		List<QuantityModel> lModel = new ArrayList<>();

		for (QuantityEntity entity : lEntity) {

			model.setLdcid(entity.getLdcid());
			model.setDailytypeid(entity.getDailytypeid());
			model.setName(entity.getName());
			model.setAbbrevation(entity.getAbbrevation());
			model.setStartdate(entity.getStartdate());
			model.setEnddate(entity.getEnddate());
		}
		lModel.add(model);
		return lModel;
	}

	public List<QuantityModel> getAll() {
		List<QuantityEntity> lEntity = quantityrepo.findAll();

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no data available");
		}

		List<QuantityModel> lModel = new ArrayList<>();

		for (QuantityEntity entity : lEntity) {

			QuantityModel model = new QuantityModel();

			model.setLdcid(entity.getLdcid());
			model.setDailytypeid(entity.getDailytypeid());
			model.setName(entity.getName());
			model.setAbbrevation(entity.getAbbrevation());
			model.setStartdate(entity.getStartdate());
			model.setEnddate(entity.getEnddate());

			lModel.add(model);
		}

		return lModel;
	}

	public void saveAll(QuantityModel model) {
		QuantityEntity entity = new QuantityEntity();

		if (model.getLdcid() == null) {
			throw new DataNotFoundException("Please provide proper data");
		}

		entity.setLdcid(model.getLdcid());
		entity.setDailytypeid(model.getDailytypeid());
		entity.setName(model.getName());
		entity.setAbbrevation(model.getAbbrevation());
		entity.setStartdate(model.getStartdate());
		entity.setEnddate(model.getEnddate());

		quantityrepo.save(entity);
	}

	public void updateAll(Integer dailytypeid, QuantityModel model) {
		String name = model.getName();

		int record = quantityrepo.saveAll(name, dailytypeid);

		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

	public void removeById(Integer dailytypeid) {
		int record = quantityrepo.removeById(dailytypeid);
		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

}
