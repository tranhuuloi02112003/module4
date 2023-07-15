package com.example.on_thi_2.repository;

import com.example.on_thi_2.entity.GiaoDichNhaDat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IGiaoDichNhaDatRepository extends JpaRepository<GiaoDichNhaDat, Integer> {
    @Query(value = "select * from GiaoDichNhaDat where loaiDichVu like :loaiDichVu", nativeQuery = true)
    Page<GiaoDichNhaDat> findByLoaiDichVu(Pageable pageable, @Param("loaiDichVu") String loaiDichVu);


    @Query(value = "select gdnd.* from giao_dich_nha_dat gdnd join khach_hang kh on kh.khach_hang_id=gdnd.khach_hang_id where ten_kh like :ten and loai_dich_vu like :loaiDichVu", nativeQuery = true)
    Page<GiaoDichNhaDat> findByTenKhAndLoaiDichVu(Pageable pageable, @Param("ten") String ten, @Param("loaiDichVu") String loaiDichVu);
}
