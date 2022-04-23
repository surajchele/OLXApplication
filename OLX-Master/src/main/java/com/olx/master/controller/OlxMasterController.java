package com.olx.master.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.master.entity.Advertises;
import com.olx.master.entity.OlxMaster;
import com.olx.master.service.OlxMasterService;

@RestController
public class OlxMasterController {

	@Autowired
	OlxMasterService olxMasterService;

	@GetMapping(value = "/user/advertise",produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<OlxMaster> getAllAdvertise() {
		return olxMasterService.getAllAdvertise();

	}

	@GetMapping(value = "/user/advertise/{postId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public OlxMaster getAdvetise(@PathVariable("/{postId}") long id) {
		return olxMasterService.getAdvetise(id);

	}

	@PostMapping(value = "/advertise",produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<OlxMaster> createNewAdvetise(@RequestBody OlxMaster olxMaster,
			@RequestHeader("auth-token") String token) {

		OlxMaster createAdvertise = olxMasterService.createNewAdvetise(olxMaster, token);
		if (createAdvertise == null) {
			return new ResponseEntity<OlxMaster>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<OlxMaster>(createAdvertise, HttpStatus.CREATED);

	}

	@PutMapping(value = "/advertise/{id}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public OlxMaster updateAdvertise(@PathVariable int adId, @RequestBody OlxMaster olxMaster) {
		return olxMasterService.updateAdvertise(adId, olxMaster);

	}

	@DeleteMapping("/user/advertise/{postId}")
	public boolean DeleteAdvertise(@PathVariable("adId") long adId) {
		return olxMasterService.DeleteAdvertise(adId);

	}

	@GetMapping(value = "/advertise/search/filtercriteria", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public Advertises SearchFilterAdvertisements() {
		return olxMasterService.SearchFilterAdvertisements();

	}

	@GetMapping(value = "/advertise/search", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public Advertises SearchFilter() {
		return olxMasterService.SearchFilter();

	}

	@GetMapping(value = "/advertise/{postId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public OlxMaster getAdvetises(@PathVariable("/{postId}") long id) {
		return olxMasterService.getAdvetise(id);

	}

}
