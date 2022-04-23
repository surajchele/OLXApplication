package com.olx.advertise.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.advertise.entity.OlxAdvertise;
import com.olx.advertise.entity.OlxAdvertiseCategoriesStatus;
import com.olx.advertise.service.OlxAdvertiseService;
@RestController
@RequestMapping("/advertise")
public class OlxAdvertiseController {
	@Autowired
	private OlxAdvertiseService olxAdvertiseService;

	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<OlxAdvertise> allAdvertisementCategories() {
		return olxAdvertiseService.allAdvertisementCategories();
		}
	@GetMapping(value = "/status",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<OlxAdvertiseCategoriesStatus> advertisementCategoriesStatus() {
		return olxAdvertiseService.advertisementCategoriesStatus();
		}

}
