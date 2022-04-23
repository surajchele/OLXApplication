package com.olx.application.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.olx.application.entity.OlxUser;

public interface OlxLogInService {
	String userLogin(OlxUser olxuser);
	 boolean userLogout(String token);
	 List<OlxUser> getAllUsers();
	 OlxUser registerUser(OlxUser olxuser); 

}
