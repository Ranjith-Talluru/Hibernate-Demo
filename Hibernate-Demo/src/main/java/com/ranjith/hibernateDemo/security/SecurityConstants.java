package com.ranjith.hibernateDemo.security;

public interface SecurityConstants {

	String SECRET = "SecretKeyToGenJWTs";
	long EXPIRATION_TIME = 864_000_000; // 10 Days
	String TOKEN_PREFIX = "Bearer ";
	String HEADER_STRING = "Authorization";
	String SIGN_UP_URL = "/users/sign-up";

}
