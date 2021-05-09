package com.example.springboot_rest_jpa_auth.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username,String password);
}
