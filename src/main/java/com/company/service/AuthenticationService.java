package com.company.service;

import com.company.dao.response.JwtAuthenticationResponse;
import com.company.dao.request.SignUpRequest;
import com.company.dao.request.SigninRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
