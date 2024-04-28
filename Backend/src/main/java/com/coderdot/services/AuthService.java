package com.coderdot.services;

import com.coderdot.dto.SignupRequest;
import com.coderdot.entities.User;

public interface AuthService {
    User createCustomer(SignupRequest signupRequest);
}
