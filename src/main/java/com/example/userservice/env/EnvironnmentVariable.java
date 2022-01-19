package com.example.userservice.env;

public class EnvironnmentVariable {
    public static final String SECRET_KEY_HMAC = "secret";
    public static final long ACCESS_TOKEN_DELAY = 6 * 60 * 60 * 1000;
    public static final long REFRESH_TOKEN_DELAY = 6 * 24 * 60 * 60 * 1000;
    public static final String HEAD_TOKEN = "Bearer ";
}