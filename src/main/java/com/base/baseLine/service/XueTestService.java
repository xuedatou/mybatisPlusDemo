package com.base.baseLine.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.base.baseLine.model.XueTest;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
}
