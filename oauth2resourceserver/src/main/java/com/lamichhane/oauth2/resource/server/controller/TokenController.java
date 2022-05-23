package com.lamichhane.oauth2.resource.server.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	@GetMapping
	public Jwt getToken(@AuthenticationPrincipal Jwt jwt) {
		return jwt;
	}

}
