package com.baidu.shop.service;

import com.baidu.shop.base.Result;
import com.baidu.shop.entity.BrandEntity;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @ClassName BrandService
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/8/31
 * @Version V1.0
 **/
@Api(tags = "品牌接口")
public interface BrandService {

    @GetMapping(value = "brand/getBrandInfo")
    @ApiOperation(value = "查询品牌信息")
    Result<PageInfo<BrandEntity>> getBrandInfo(Integer page, Integer rows,String sort,Boolean desc);

}