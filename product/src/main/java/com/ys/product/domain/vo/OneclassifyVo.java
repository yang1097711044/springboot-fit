package com.ys.product.domain.vo;

import com.ys.product.domain.entity.Oneclassify;
import com.ys.product.domain.entity.Twoclassify;
import lombok.Data;

import java.util.List;

/**
 * @author liuya
 */
@Data
public class OneclassifyVo extends Oneclassify {
    List<TwoclassifyVo> twoclassifies;
}
