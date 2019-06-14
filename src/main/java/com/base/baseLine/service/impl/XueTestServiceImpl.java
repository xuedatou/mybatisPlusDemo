package com.base.baseLine.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.base.baseLine.model.XueTest;
import com.base.baseLine.dao.XueTestDao;
import com.base.baseLine.service.XueTestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author base
 * @since 2019-06-13
 */
@Service("xueTestService")
public class XueTestServiceImpl extends ServiceImpl<XueTestDao, XueTest> implements XueTestService {
    @Resource(name = "xueTestDao")
    XueTestDao xueTestDao;

    @Override
    public List<XueTest> selectAll(Wrapper<XueTest> queryWrapper) {
        return xueTestDao.selectAll(queryWrapper);
    }
}
