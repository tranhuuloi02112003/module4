package com.example.on_thi_2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang {
    @Id
    @Column(name = "khach_hang_id")
    private Integer khachHangId;
    private String maKh;
    private String tenKh;
    private String Sdt;
    private String email;
    @OneToMany(mappedBy = "khachHang")
    private List<GiaoDichNhaDat> giaoDichNhaDats;
}
