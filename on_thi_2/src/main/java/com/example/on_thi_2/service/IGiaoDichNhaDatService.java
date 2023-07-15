package com.example.on_thi_2.service;

import com.example.on_thi_2.entity.GiaoDichNhaDat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGiaoDichNhaDatService {
    Page<GiaoDichNhaDat> findAll(Pageable pageable);
    void create(GiaoDichNhaDat giaoDichNhaDat);
    void update(GiaoDichNhaDat giaoDichNhaDat);

    void deleteById(int id);
    GiaoDichNhaDat findById(int id);
    Page<GiaoDichNhaDat> findByLoaiDichVu(Pageable pageable, String loaiDichVu);
    Page<GiaoDichNhaDat> findByTenKhAndLoaiDichVu(Pageable pageable, String ten, String loaiDichVu);
}
