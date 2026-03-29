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

import com.example.demo.model.ToleranceModel;
import com.example.demo.service.LDCToleranceService;

@RequestMapping("ldc/tolerance")
@RestController
public class LDCToleranceController {

	@Autowired
	LDCToleranceService ldctoleranceservice;

	@GetMapping("/{categoryid}")
	public List<ToleranceModel> getById(@PathVariable Integer categoryid) {
		List<ToleranceModel> lm = ldctoleranceservice.getById(categoryid);
		return lm;
	}

	@GetMapping("/all")
	public List<ToleranceModel> getAll() {
		List<ToleranceModel> lm = ldctoleranceservice.getAll();
		return lm;
	}

	@PostMapping("/add")
	public String saveAll(@RequestBody ToleranceModel model) {
		ldctoleranceservice.saveAll(model);
		return "added record Successfully";
	}

	@PatchMapping("/{categoryid}")
	public String updateAll(@PathVariable Integer categoryid, @RequestBody ToleranceModel model) {
		ldctoleranceservice.updateAll(categoryid, model);
		return "updated details Successfully";
	}

	@DeleteMapping("/{categoryid}")
	public String removeById(@PathVariable Integer categoryid) {
		ldctoleranceservice.removeById(categoryid);
		return "record deleted Successfully";
	}

}
