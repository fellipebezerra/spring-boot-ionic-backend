package com.felipebezerra.cursomc.servicies;

import org.springframework.security.core.context.SecurityContextHolder;

import com.felipebezerra.cursomc.security.UserSS;

public class UserService {

	public static UserSS authendicated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
