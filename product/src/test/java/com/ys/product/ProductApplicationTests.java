package com.ys.product;

import com.ys.product.domain.entity.Brand;
import com.ys.product.domain.vo.OneclassifyVo;
import com.ys.product.mapper.BrandMapper;
import com.ys.product.mapper.OneclassifyMapper;
import com.ys.product.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductApplicationTests {
@Resource
BrandMapper brandMapper;
    @Test
    public void contextLoads() {
        List<Brand> brands = brandMapper.brands();
        log.error(""+brands);

    }

}
