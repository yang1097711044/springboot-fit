package com.ys.product.domain.vo;

import com.ys.product.domain.entity.Product;
import com.ys.product.domain.entity.Twoclassify;
import lombok.Data;

import java.util.List;
@Data
public class TwoclassifyVo extends Twoclassify {
    List<Product> products;
}
