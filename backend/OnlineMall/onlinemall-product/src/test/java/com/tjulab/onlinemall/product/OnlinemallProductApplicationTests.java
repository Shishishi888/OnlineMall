package com.tjulab.onlinemall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tjulab.onlinemall.product.entity.BrandEntity;
import com.tjulab.onlinemall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OnlinemallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("");
//        brandEntity.setName("iPhone 13");
//        brandService.save(brandEntity);
//        System.out.println("save success ...");

//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("The new generation of iPhone.");
//        brandService.updateById(brandEntity);
//        System.out.println("update success ...");

        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntityList.forEach((item) -> {
            System.out.println(item);
        });
    }

}
