package com.example.application.data.service;

//works as a mailman runing some business logic and insurign that we are not going to access
// the DB directly from the UI layer

import com.example.application.data.entity.User;
import com.example.application.data.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrmService {

    private final UserRepository userRepository;

    public CrmService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveNewUser(User user){
        if(user == null){
            System.err.println("User is null");
            return;
        }

        userRepository.save(user);
    }
}
