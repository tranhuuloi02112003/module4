package com.example.on_thi_2.repository;

import com.example.on_thi_2.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IKhachHangRepository extends JpaRepository<KhachHang,Integer> {

    @Query(value = "select * from KhachHang where tenKh like :tenKh", nativeQuery = true)
    Page<KhachHang> findByTenKh(Pageable pageable, @Param("tenKh") String tenKh);
}
