package com.example.assignment_ls10.service;

import com.example.assignment_ls10.entity.LoaiPhim;
import com.example.assignment_ls10.repository.LoaiPhimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiPhimService implements LoaiPhimServiceImp{

    @Autowired
    LoaiPhimRepository loaiPhimRepository;

    @Override
    public List<LoaiPhim> getAllLoaiPhim() {
        return loaiPhimRepository.findAll();
    }
}


