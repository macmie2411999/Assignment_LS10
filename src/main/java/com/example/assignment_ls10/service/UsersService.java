package com.example.assignment_ls10.service;

import com.example.assignment_ls10.entity.Users;
import com.example.assignment_ls10.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements UsersServiceImp {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Users findByUsername(String username) {
        // TODO Auto-generated method stub
        return usersRepository.findByUsername(username);
    }
}
