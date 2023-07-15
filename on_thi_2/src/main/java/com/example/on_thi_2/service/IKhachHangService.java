package com.example.on_thi_2.service;

import com.example.on_thi_2.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IKhachHangService {
    List<KhachHang> findAll();
    void create(KhachHang khachHang);
    void deleteById(int id);
    KhachHang findById(int id);
    Page<KhachHang> findByTenKh(Pageable pageable, String name);
}
