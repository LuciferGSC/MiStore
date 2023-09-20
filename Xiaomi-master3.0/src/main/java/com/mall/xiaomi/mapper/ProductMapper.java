package com.mall.xiaomi.mapper;

import com.mall.xiaomi.pojo.Product;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProductMapper extends Mapper<Product> {

    @Select("select product_id from product")
    List<Integer> selectIds();

    @Select("select * from product where product_id=#{id}")
    Product selectById(Integer id);

    @Select("select * from product where product_name like CONCAT('%',#{search},'%')")
    List<Product> selectBySearch(String search);

}