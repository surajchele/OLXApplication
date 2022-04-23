package com.olx.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.olx.application.entity.OlxUser;

@Service
public class OlxLogInServiceImplementation implements OlxLogInService {
	String token="auth-token";
	static List<OlxUser> users = new ArrayList<OlxUser>();

	static {
		users.add(new OlxUser(1, "Anand", "Kulkarni", "anand", "anand123", "anand@gmail.com", 1234567890L));
//		users.add(new OlxUser(2, "Suraj", "Chele", "suraj", "suraj123", "suraj@gmail.com", 7875371959L));

	}

	@Override
	public String userLogin(OlxUser olxuser) {
		
		for (OlxUser user : users)
			if (user.getUserName().equals(olxuser.getUserName()) && user.getPassword().equals(olxuser.getPassword())) {
				return token;
			}
		return null;
	}

	@Override
	public boolean userLogout(String token) {
		for (OlxUser user : users) {
			if (token.equals("SC66579")) {
				users.remove(token);
				return true;
			}

		}
		return false;

	}

	@Override
	public List<OlxUser> getAllUsers() {
		return users;
	}

	@Override
	public OlxUser registerUser(OlxUser olxuser) {
		users.add(olxuser);
		return olxuser;
	}

}
