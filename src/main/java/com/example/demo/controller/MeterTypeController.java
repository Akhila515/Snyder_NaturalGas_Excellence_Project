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

import com.example.demo.model.MeterTypeModel;
import com.example.demo.service.MeterTypeService;

@RequestMapping("/ldc/metertype")
@RestController
public class MeterTypeController {
	
	@Autowired
	MeterTypeService metertypeservice;
	
	@GetMapping("/{metertypeid}")
	public List<MeterTypeModel> getById(@PathVariable Integer metertypeid){
		List<MeterTypeModel> lm=metertypeservice.getById(metertypeid);
		return lm;
	}

	@GetMapping("/all")
	public List<MeterTypeModel> getAll(){
		List<MeterTypeModel> lm=metertypeservice.getAll();
		return lm;	
	}
	@PostMapping("/add")
	public String saveAll(@RequestBody MeterTypeModel model) {
		metertypeservice.saveAll(model);
		return "added record Successfully";
	}
	
	@PatchMapping("/{metertypeid}")
	public String updateAll(@PathVariable Integer metertypeid, @RequestBody MeterTypeModel model) {
		metertypeservice.updateAll(metertypeid, model);
		return "updated details Successfully";
	}

	@DeleteMapping("/{metertypeid}")
	public String removeById(@PathVariable Integer metertypeid) {
		metertypeservice.removeById(metertypeid);
		return "record deleted Successfully";
	}
}
