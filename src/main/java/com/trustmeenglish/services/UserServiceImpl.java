package com.trustmeenglish.services;

import com.trustmeenglish.model.User;
import com.trustmeenglish.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Override
    public User getUser(Long id) {
        return userRepository.findAllById(id).get();
    }
}
