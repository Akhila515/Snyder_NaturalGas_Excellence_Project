package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.TariffEntity;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.model.TariffModel;
import com.example.demo.repository.TariffRepo;

@Service
public class LDCTariffService {

	@Autowired
	TariffRepo tariffrepo;

	public List<TariffModel> getById(Integer ldcrrid) {
		List<TariffEntity> lEntity = tariffrepo.findByid(ldcrrid);

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no record for this ID.Please add the data");
		}

		TariffModel model = new TariffModel();

		List<TariffModel> lModel = new ArrayList<>();

		for (TariffEntity entity : lEntity) {

			model.setLdcid(entity.getLdcid());
			model.setLdcrrid(entity.getLdcrrid());
			model.setMetertype(entity.getMetertype());
			model.setUnit(entity.getUnit());
			model.setAmount(entity.getAmount());
		}
		lModel.add(model);
		return lModel;
	}

	public List<TariffModel> getAll() {
		List<TariffEntity> lEntity = tariffrepo.findAll();

		if (lEntity.isEmpty()) {
			throw new DataNotFoundException("There is no data available");
		}

		List<TariffModel> lModel = new ArrayList<>();

		for (TariffEntity entity : lEntity) {

			TariffModel model = new TariffModel();

			model.setLdcid(entity.getLdcid());
			model.setLdcrrid(entity.getLdcrrid());
			model.setMetertype(entity.getMetertype());
			model.setUnit(entity.getUnit());
			model.setAmount(entity.getAmount());

			lModel.add(model);
		}

		return lModel;
	}

	public void saveAll(TariffModel model) {
		TariffEntity entity = new TariffEntity();

		if (model.getLdcid() == null) {
			throw new DataNotFoundException("Please provide proper data");
		}

		entity.setLdcid(model.getLdcid());
		entity.setLdcrrid(model.getLdcrrid());
		entity.setMetertype(model.getMetertype());
		entity.setUnit(model.getUnit());
		entity.setAmount(model.getAmount());

		tariffrepo.save(entity);
	}

	public void updateAll(Integer ldcrrid, TariffModel model) {
		BigDecimal name = model.getAmount();

		int record = tariffrepo.saveAll(name, ldcrrid);

		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

	public void removeById(Integer ldcrrid) {
		int record = tariffrepo.removeById(ldcrrid);
		if (record == 0) {
			throw new DataNotFoundException("There is no record exist by this id");
		}
	}

}
