package com.base.baseLine.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.base.baseLine.model.XueTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author base
 * @since 2019-06-13
 */
@Mapper
public interface XueTestDao extends BaseMapper<XueTest> {

   List<XueTest> selectAll(@Param(Constants.WRAPPER) Wrapper<XueTest> queryWrapper);

   IPage<XueTest> myGetAllPage(Page page,@Param("age")String age);

}
