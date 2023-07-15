package com.example.on_thi_2.service.impl;

import com.example.on_thi_2.entity.GiaoDichNhaDat;
import com.example.on_thi_2.repository.IGiaoDichNhaDatRepository;
import com.example.on_thi_2.service.IGiaoDichNhaDatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GiaodichNhaDatService implements IGiaoDichNhaDatService {
    @Autowired
    private IGiaoDichNhaDatRepository iGiaoDichNhaDatRepository;

    @Override
    public Page<GiaoDichNhaDat> findAll(Pageable pageable) {
        return iGiaoDichNhaDatRepository.findAll(pageable);
    }

    @Override
    public void create(GiaoDichNhaDat giaoDichNhaDat) {
        iGiaoDichNhaDatRepository.save(giaoDichNhaDat);
    }

    @Override
    public void update(GiaoDichNhaDat giaoDichNhaDat) {
        iGiaoDichNhaDatRepository.save(giaoDichNhaDat);
    }

    @Override
    public void deleteById(int id) {
        iGiaoDichNhaDatRepository.deleteById(id);
    }

    @Override
    public GiaoDichNhaDat findById(int id) {
        return iGiaoDichNhaDatRepository.findById(id).orElse(null);
    }

    @Override
    public Page<GiaoDichNhaDat> findByLoaiDichVu(Pageable pageable, String loaiDichVu) {
        return iGiaoDichNhaDatRepository.findByLoaiDichVu(pageable,"%"+loaiDichVu+"%" );
    }

    @Override
    public Page<GiaoDichNhaDat> findByTenKhAndLoaiDichVu(Pageable pageable, String ten, String loaiDichVu) {
        return iGiaoDichNhaDatRepository.findByTenKhAndLoaiDichVu(pageable,"%"+ten+"%","%"+loaiDichVu+"%");
    }

//    @Override
//    public Page<GiaoDichNhaDat> findByTenKhAndLoaiDichVu(Pageable pageable, String ten, String loaiDichVu) {
//        return iGiaoDichNhaDatRepository.findByTenKhAndLoaiDichVu(pageable,"%"+ten+"%","%"+loaiDichVu+"%");
//    }
}
