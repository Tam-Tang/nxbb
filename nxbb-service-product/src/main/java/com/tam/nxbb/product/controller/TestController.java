package com.tam.nxbb.product.controller;

import com.tam.nxbb.dao.mapper.BrandMapper;
import com.tam.nxbb.domain.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private BrandMapper brandMapper;

    @GetMapping(value = "/test")
    public List<Brand> test() {
        return brandMapper.getAll();
    }
}
