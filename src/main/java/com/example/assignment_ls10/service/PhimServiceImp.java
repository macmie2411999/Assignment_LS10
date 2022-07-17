package com.example.assignment_ls10.service;

import com.example.assignment_ls10.entity.Phim;

import java.util.List;
import java.util.Map;

public interface PhimServiceImp {
    public List<Map<String, ?>> getAllPhim();
    public List<Map<String, ?>> getPhimByQuocGia(Integer id);
    public void insertPhim(Phim phim);
}
