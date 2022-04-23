package com.olx.application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OlxUser {
	private int userId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private long phoneNo;
	

}
