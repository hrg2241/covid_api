package com.training.amdocs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.amdocs.doa.CentersDoa;
import com.training.amdocs.entities.Centers;


@RestController
public class CenterController 
{
	@Autowired
	CentersDoa doa;
	 
	@GetMapping("/allcenters")
	public List<Centers> allCenters()
	{
		return doa.GETALL();
	}
	@GetMapping("/allcenters/{pin}")
	Centers getallCenters(@PathVariable String pincode)
	{
		return doa.get(pincode);
	}
	@PostMapping("/covidcenter")
	public String addCenter(@RequestBody Centers centers)
	{
		return doa.Insert(centers.getCenter_id(), centers.getCenter_name(), centers.getPincode());
	}
	
}
