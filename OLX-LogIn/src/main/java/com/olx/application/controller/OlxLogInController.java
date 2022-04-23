package com.olx.application.controller;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.olx.application.entity.OlxUser;
import com.olx.application.service.OlxLogInService;

@RestController
@RequestMapping("/user")
public class OlxLogInController {


	@Autowired
	OlxLogInService olxLogInService;

	@PostMapping(value = "/authenticate", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> userLogin(@RequestBody OlxUser olxuser) {
		String userlogin = olxLogInService.userLogin(olxuser);
			return new ResponseEntity<String>(userlogin, HttpStatus.OK);

	}

	@DeleteMapping("/logout")
	public boolean userLogout(@RequestHeader("auth-token") String token) {
		return olxLogInService.userLogout(token);

		
	}

	@GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<OlxUser> getAllUsers() {
		return olxLogInService.getAllUsers();
	}

	@PostMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public OlxUser registerUser(@RequestBody OlxUser olxuser) {
		return olxLogInService.registerUser(olxuser);

	}

}
