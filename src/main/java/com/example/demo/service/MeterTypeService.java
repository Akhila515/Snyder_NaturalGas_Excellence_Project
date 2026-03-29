package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.MeterTypeEntity;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.model.MeterTypeModel;
import com.example.demo.repository.MeterTypeRepo;

@Service
public class MeterTypeService {

	@Autowired
	MeterTypeRepo metertyperepo;

	public List<MeterTypeModel> getById(Integer metertypeid) {

		List<MeterTypeEntity> lEntity = metertyperepo.findByid(metertypeid);

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no record for this ID.Please add the data");
		}

		MeterTypeModel model = new MeterTypeModel();

		List<MeterTypeModel> lModel = new ArrayList<>();

		for (MeterTypeEntity entity : lEntity) {

			model.setId(entity.getId());
			model.setLdcid(entity.getLdcid());
			model.setMetertypeid(entity.getMetertypeid());
			model.setMetertype(entity.getMetertype());
			model.setCreatedby(entity.getCreatedby());
			model.setCreatedon(entity.getCreatedon());
			model.setUpdatedby(entity.getUpdatedby());
			model.setUpdatedon(entity.getUpdatedon());

		}
		lModel.add(model);
		return lModel;
	}

	public List<MeterTypeModel> getAll() {
		List<MeterTypeEntity> lEntity = metertyperepo.findAll();

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no record for this ID.Please add the data");
		}

		List<MeterTypeModel> lModel = new ArrayList<>();

		for (MeterTypeEntity entity : lEntity) {

			MeterTypeModel model = new MeterTypeModel();

			model.setId(entity.getId());
			model.setLdcid(entity.getLdcid());
			model.setMetertypeid(entity.getMetertypeid());
			model.setMetertype(entity.getMetertype());
			model.setCreatedby(entity.getCreatedby());
			model.setCreatedon(entity.getCreatedon());
			model.setUpdatedby(entity.getUpdatedby());
			model.setUpdatedon(entity.getUpdatedon());
			lModel.add(model);
		}

		return lModel;
	}

	public void saveAll(MeterTypeModel model) {
		MeterTypeEntity entity = new MeterTypeEntity();

		if (model.getLdcid() == null) {
			throw new DataNotFoundException("Please provide proper data");
		}

		entity.setId(model.getId());
		entity.setLdcid(model.getLdcid());
		entity.setMetertypeid(model.getMetertypeid());
		entity.setMetertype(model.getMetertype());
		entity.setCreatedby(model.getCreatedby());
		entity.setCreatedon(model.getCreatedon());
		entity.setUpdatedby(model.getUpdatedby());
		entity.setUpdatedon(model.getUpdatedon());

		metertyperepo.save(entity);
	}

	public void updateAll(Integer metertypeid, MeterTypeModel model) {
		String metertype = model.getMetertype();

		int record = metertyperepo.saveAll(metertype, metertypeid);

		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

	public void removeById(Integer metertypeid) {
		int record = metertyperepo.removeById(metertypeid);
		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

}
