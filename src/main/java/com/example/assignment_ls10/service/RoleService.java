package com.example.assignment_ls10.service;

import com.example.assignment_ls10.entity.Roles;
import com.example.assignment_ls10.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements RoleServiceImp{
    @Autowired
    RolesRepository repository;

    @Override
    public Roles getRoleByRoleId(int roleId) {
        return repository.findById(roleId).get();
    }
}
