package com.mall.xiaomi;

import com.mall.xiaomi.mapper.ProductMapper;
import com.mall.xiaomi.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class xiaomiAppTests {
    @Autowired
    private ProductMapper productMapper;


    @Test
    public void testA(){
        List<Product> list = productMapper.selectBySearch("Red");
        System.out.println(list);

    }
}
