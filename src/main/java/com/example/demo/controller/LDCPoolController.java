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

import com.example.demo.model.PoolModel;
import com.example.demo.service.LDCPoolService;

@RequestMapping("/ldc/pool")
@RestController
public class LDCPoolController {

	@Autowired
	LDCPoolService ldcpoolservice;

	@GetMapping("/{ldcpoolid}")
	public List<PoolModel> getById(@PathVariable Integer ldcpoolid) {
		List<PoolModel> lm = ldcpoolservice.getById(ldcpoolid);
		return lm;
	}

	@GetMapping("/all")
	public List<PoolModel> getAll() {
		List<PoolModel> lm = ldcpoolservice.getAll();
		return lm;
	}

	@PostMapping("/add")
	public String saveAll(@RequestBody PoolModel model) {
		ldcpoolservice.saveAll(model);
		return "added record Successfully";
	}

	@PatchMapping("/{ldcpoolid}")
	public String updateAll(@PathVariable Integer ldcpoolid, @RequestBody PoolModel model) {
		ldcpoolservice.updateAll(ldcpoolid, model);
		return "updated details Successfully";
	}

	@DeleteMapping("/{ldcpoolid}")
	public String removeById(@PathVariable Integer ldcpoolid) {
		ldcpoolservice.removeById(ldcpoolid);
		return "record deleted Successfully";
	}

}
