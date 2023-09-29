package com.example.on_thi_2.controller;

import com.example.on_thi_2.entity.GiaoDichNhaDat;
import com.example.on_thi_2.service.IGiaoDichNhaDatService;
import com.example.on_thi_2.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ItemController {
    @Autowired
    private IGiaoDichNhaDatService iGiaoDichNhaDatService;
    @Autowired
    private IKhachHangService iKhachHangService;

    @GetMapping("/list")
    public String listPaging(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<GiaoDichNhaDat> list = iGiaoDichNhaDatService.findAll(PageRequest.of(page, 4));
        model.addAttribute("giaoDichNhaDats", list);
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("giaoDichNhaDat", new GiaoDichNhaDat());
        model.addAttribute("khachHangs", iKhachHangService.findAll());
        return "/create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("giaoDichNhaDat") GiaoDichNhaDat giaoDichNhaDat, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("khachHangs", iKhachHangService.findAll());
            return "/create";
        }
        iGiaoDichNhaDatService.create(giaoDichNhaDat);
        return "redirect:/list";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable("id") int id) {
        model.addAttribute("giaoDichNhaDat", iGiaoDichNhaDatService.findById(id));
        model.addAttribute("khachHangs", iKhachHangService.findAll());
        return "/update";
    }

    @PostMapping("/update")
    public String doUpdate(@Valid @ModelAttribute("giaoDichNhaDat") GiaoDichNhaDat giaoDichNhaDat, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("giaoDichNhaDat", giaoDichNhaDat);
            model.addAttribute("khachHangs", iKhachHangService.findAll());
            return "/update";
        }
        iGiaoDichNhaDatService.update(giaoDichNhaDat);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String doDelete(Model model, @RequestParam("id") int id) {
        iGiaoDichNhaDatService.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(Model model, @PathVariable("id") int id) {
        model.addAttribute("giaoDichNhaDat", iGiaoDichNhaDatService.findById(id));
        return "/detail";
    }


    @PostMapping("/search")
    public String doSearch(Model model, @RequestParam("searchByTenKH") String searchByTenKH, @RequestParam("searchByLoaiDV") String searchByLoaiDV, @RequestParam(name = "page", defaultValue = "0") int page) {
        model.addAttribute("giaoDichNhaDats", iGiaoDichNhaDatService.findByTenKhAndLoaiDichVu(PageRequest.of(page, 4), searchByTenKH, searchByLoaiDV));
        return "/list";
    }


}
