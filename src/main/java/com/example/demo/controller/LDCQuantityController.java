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


import com.example.demo.model.QuantityModel;
import com.example.demo.service.QuantityService;

@RequestMapping("/ldc/quantity")
@RestController
public class LDCQuantityController {

	@Autowired
	QuantityService quantityservice;

	@GetMapping("/{dailytypeid}")
	public List<QuantityModel> getById(@PathVariable Integer dailytypeid) {
		List<QuantityModel> lm = quantityservice.getById(dailytypeid);
		return lm;
	}

	@GetMapping("/all")
	public List<QuantityModel> getAll() {
		List<QuantityModel> lm = quantityservice.getAll();
		return lm;
	}

	@PostMapping("/add")
	public String saveAll(@RequestBody QuantityModel model) {
		quantityservice.saveAll(model);
		return "added record Successfully";
	}

	@PatchMapping("/{dailytypeid}")
	public String updateAll(@PathVariable Integer dailytypeid, @RequestBody QuantityModel model) {
		quantityservice.updateAll(dailytypeid, model);
		return "updated details Successfully";
	}

	@DeleteMapping("/{dailytypeid}")
	public String removeById(@PathVariable Integer dailytypeid) {
		quantityservice.removeById(dailytypeid);
		return "record deleted Successfully";
	}

}
