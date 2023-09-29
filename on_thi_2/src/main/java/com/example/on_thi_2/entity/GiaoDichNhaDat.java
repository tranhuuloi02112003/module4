package com.example.on_thi_2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiaoDichNhaDat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank()
    @Pattern(regexp = "^(MGD-[0-9]{4})")
    private String maGiaoDich;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String day;
    @NotBlank()
    private String loaiDichVu;
    @Min(value = 500000, message = "giá phải lớn hơn hoặc bằng 500000")
    @NotNull()
    private Double donGia;
    @Min(value = 20, message = "diện tích phải lớn hơn hoặc bằng 20")
    @NotNull()
    private Double dienTich;
    @ManyToOne
    @JoinColumn(name = "khach_hang_id",referencedColumnName = "khach_hang_id")
    private KhachHang khachHang;

}
