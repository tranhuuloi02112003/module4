package com.example.on_thi_2.service.impl;

import com.example.on_thi_2.entity.KhachHang;
import com.example.on_thi_2.repository.IKhachHangRepository;
import com.example.on_thi_2.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements IKhachHangService {
    @Autowired
    private IKhachHangRepository iKhachHangRepository;

    @Override
    public List<KhachHang> findAll() {
        return iKhachHangRepository.findAll();
    }

    @Override
    public void create(KhachHang khachHang) {
        iKhachHangRepository.save(khachHang);

    }

    @Override
    public void deleteById(int id) {
iKhachHangRepository.deleteById(id);
    }

    @Override
    public KhachHang findById(int id) {
        return iKhachHangRepository.findById(id).orElse(null);
    }

    @Override
    public Page<KhachHang> findByTenKh(Pageable pageable, String name) {
        return iKhachHangRepository.findByTenKh(pageable,"%"+name+"%");
    }
}
