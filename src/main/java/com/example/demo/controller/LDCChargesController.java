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

import com.example.demo.model.ChargesModel;
import com.example.demo.service.LDCChargesService;

@RequestMapping("/ldc/charges")
@RestController
public class LDCChargesController {

	@Autowired
	LDCChargesService ldcchargesservice;

	@GetMapping("/{chargeid}")
	public ChargesModel getById(@PathVariable Integer chargeid) {
		ChargesModel m = ldcchargesservice.getById(chargeid);
		return m;
	}

	@GetMapping("/All")
	public List<ChargesModel> getAll() {
		List<ChargesModel> m = ldcchargesservice.getAll();
		return m;
	}

	@PostMapping("/add")
	public String saveAll(@RequestBody ChargesModel model) {
		ldcchargesservice.saveAll(model);
		return "added record Successfully";
	}

	@PatchMapping("/{chargeid}")
	public String updateAll(@PathVariable Integer chargeid, @RequestBody ChargesModel model) {
		ldcchargesservice.updateAll(chargeid, model);
		return "updated details Successfully";
	}

	@DeleteMapping("/{chargeid}")
	public String removeById(@PathVariable Integer chargeid) {
		ldcchargesservice.removeById(chargeid);
		return "record deleted Successfully";
	}
}