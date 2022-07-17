package com.example.assignment_ls10.service;

import com.example.assignment_ls10.entity.RoleUser;

import java.util.List;
import java.util.Map;

public interface RoleUserServiceImp {
    public List<Map<String,  ?>> getAllRoleByUserName(String username);
    public List<RoleUser> getAllByUserId(long userId);
}

