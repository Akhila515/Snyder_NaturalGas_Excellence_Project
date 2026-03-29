package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.TariffModel;
import com.example.demo.service.LDCTariffService;

@RequestMapping("/ldc/tariff")
@RestController
public class LDCTariffController {

	@Autowired
	LDCTariffService ldctariffservice;

	@GetMapping("/{ldcrrid}")
	public List<TariffModel> getById(@PathVariable Integer ldcrrid) {
		List<TariffModel> lm = ldctariffservice.getById(ldcrrid);
		return lm;
	}

	@GetMapping("/all")
	public List<TariffModel> getAll() {
		List<TariffModel> lm = ldctariffservice.getAll();
		return lm;
	}

	@PostMapping("/add")
	public String saveAll(@RequestBody TariffModel model) {
		ldctariffservice.saveAll(model);
		return "added record Successfully";
	}

	@PatchMapping("/{ldcrrid}")
	public String updateAll(@PathVariable Integer ldcrrid, @RequestBody TariffModel model) {
		ldctariffservice.updateAll(ldcrrid, model);
		return "updated details Successfully";
	}

	@DeleteMapping("/{ldcrrid}")
	public String removeById(@PathVariable Integer ldcrrid) {
		ldctariffservice.removeById(ldcrrid);
		return "record deleted Successfully";
	}

}
