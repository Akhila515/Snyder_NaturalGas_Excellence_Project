package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.ToleranceEntity;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.model.ToleranceModel;
import com.example.demo.repository.ToleranceRepo;

@Service
public class LDCToleranceService {

	@Autowired
	ToleranceRepo tolerancerepo;

	public List<ToleranceModel> getById(Integer categoryid) {
		List<ToleranceEntity> lEntity = tolerancerepo.findByid(categoryid);

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no record for this ID.Please add the data");
		}

		ToleranceModel model = new ToleranceModel();

		List<ToleranceModel> lModel = new ArrayList<>();

		for (ToleranceEntity entity : lEntity) {

			model.setLdcid(entity.getLdcid());
			model.setCategoryid(entity.getCategoryid());
			model.setName(entity.getName());
			model.setStatus(entity.getStatus());
			model.setTargetnotes(entity.getTargetnotes());
			model.setUseasexception(entity.getUseasexception());
		}
		lModel.add(model);
		return lModel;
	}

	public List<ToleranceModel> getAll() {
		List<ToleranceEntity> lEntity = tolerancerepo.findAll();

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no data available");
		}

		List<ToleranceModel> lModel = new ArrayList<>();

		for (ToleranceEntity entity : lEntity) {

			ToleranceModel model = new ToleranceModel();

			model.setLdcid(entity.getLdcid());
			model.setCategoryid(entity.getCategoryid());
			model.setName(entity.getName());
			model.setStatus(entity.getStatus());
			model.setTargetnotes(entity.getTargetnotes());
			model.setUseasexception(entity.getUseasexception());

			lModel.add(model);
		}

		return lModel;
	}

	public void saveAll(ToleranceModel model) {
		ToleranceEntity entity = new ToleranceEntity();

		if (model.getLdcid() == null) {
			throw new DataNotFoundException("Please provide proper data");
		}

		entity.setLdcid(model.getLdcid());
		entity.setCategoryid(model.getCategoryid());
		entity.setName(model.getName());
		entity.setStatus(model.getStatus());
		entity.setTargetnotes(model.getTargetnotes());
		entity.setUseasexception(model.getUseasexception());

		tolerancerepo.save(entity);
	}

	public void updateAll(Integer categoryid, ToleranceModel model) {
		String name = model.getName();

		int record = tolerancerepo.saveAll(name, categoryid);

		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

	public void removeById(Integer categoryid) {
		int record = tolerancerepo.removeById(categoryid);
		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}
}
