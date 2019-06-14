package com.base.baseLine.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.base.baseLine.model.XueTest;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author base
 * @since 2019-06-13
 */
public interface XueTestService extends IService<XueTest> {
    List<XueTest> selectAll(Wrapper<XueTest> queryWrapper);
    IPage<XueTest> myGetAllPage(Page page,String age);
}
