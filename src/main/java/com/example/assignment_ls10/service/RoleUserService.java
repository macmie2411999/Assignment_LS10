package com.example.assignment_ls10.service;

import com.example.assignment_ls10.entity.RoleUser;
import com.example.assignment_ls10.repository.RoleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleUserService implements RoleUserServiceImp{

    @Autowired
    RoleUserRepository repository;

    @Override
    public List<Map<String, ?>> getAllRoleByUserName(String username) {
        // TODO Auto-generated method stub
        return repository.getAllRoleByUsername(username);
    }

    @Override
    public List<RoleUser> getAllByUserId(long userId) {
        // TODO Auto-generated method stub
        return repository.findByIdUserId(userId);
    }
}
