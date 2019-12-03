package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fgnb
 * @email fgnb@atguigu.com
 * @date 2019-12-02 19:53:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
