package com.example.assignment_ls10.repository;

import com.example.assignment_ls10.entity.LoaiPhim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiPhimRepository extends JpaRepository<LoaiPhim, Integer> {

}
