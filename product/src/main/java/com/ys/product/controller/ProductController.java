package com.ys.product.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ys.product.domain.entity.Brand;
import com.ys.product.domain.entity.Product;
import com.ys.product.domain.vo.OneclassifyVo;
import com.ys.product.service.ProductService;
import com.ys.product.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {
    @Resource
    ProductService productService;
    @RequestMapping("/brands")
    public ResponseEntity brands(){
        List<Brand> brands = productService.brands();
        return ResponseEntity.success(brands);
    }
    @RequestMapping("/lists")
    public ResponseEntity findAll(){
        List<OneclassifyVo> lists = productService.lists();
        return ResponseEntity.success(lists);
    }

    @PostMapping("/insertBrands")
    public ResponseEntity insert(@RequestParam(value = "num",required = false) int num,@RequestParam(value = "name",required = true) String name,@RequestParam(value = "desc",required = false) String desc){
        int rows = productService.insertBrand(num, name, desc);
        return ResponseEntity.success(rows);
    }

    @RequestMapping("/findProducts/{page}/{size}")
    public ResponseEntity findProducts(@PathVariable int page, @PathVariable int size){
        IPage<Product> iPage = productService.selectProductPage(page,size);
        return ResponseEntity.success(iPage);
    }

    @RequestMapping("/insertPro")
    public ResponseEntity insertProduct(String name, String image, String desc, double price, int oId, int wId, int bId){
        int rows = productService.insertProduct(name, image, desc, price, oId, wId, bId);
        return ResponseEntity.success(rows);
    }

}
