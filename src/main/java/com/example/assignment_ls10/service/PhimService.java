package com.example.assignment_ls10.service;

import com.example.assignment_ls10.entity.Phim;
import com.example.assignment_ls10.repository.PhimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PhimService implements PhimServiceImp{

    @Autowired
    PhimRepository phimRepository;

    @Override
    public List<Map<String, ?>> getAllPhim() {

//        return phimRepository.findAll();
        return phimRepository.getPhimWithCategory();
    }

    @Override
    public List<Map<String, ?>> getPhimByQuocGia(Integer id){
        List<Map<String, ?>> listPhim = phimRepository.getPhimByQuocGia(id);
        for (Map<String, ?> map: listPhim) {
            System.out.println(map.get("ten_phim"));
        }
        return phimRepository.getPhimByQuocGia(id);
    }

    @Override
    public void insertPhim(Phim phim) {
        phimRepository.save(phim);
    }
}
