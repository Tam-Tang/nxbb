package com.tam.nxbb.dao.mapper;

import com.tam.nxbb.domain.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {

    @Select("select * from bbs_brand")
    List<Brand> getAll();
}
