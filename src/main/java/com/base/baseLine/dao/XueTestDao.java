package com.base.baseLine.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.base.baseLine.model.XueTest;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

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

   List<XueTest> selectAll(Wrapper<XueTest> queryWrapper);

}
