package com.base.baseLine.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.base.baseLine.model.ResultData;
import com.base.baseLine.model.XueTest;
import com.base.baseLine.service.XueTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author base
 * @since 2019-06-13
 */
@RestController
@RequestMapping("/baseLine")
public class XueTestController {
    public Map<String, Object> resultData = new ResultData();

    @Resource(name="xueTestService")
    XueTestService xueTestService;

    @RequestMapping("/selectDemo")
    @ResponseBody
    public Object selectDemo(){
        XueTest xueTest = xueTestService.getById("1");
        resultData.put("xueTest",xueTest);
        return resultData;
    }
    @RequestMapping("/getOne")
    @ResponseBody
    public Object getOneDemo(){
        QueryWrapper q = new QueryWrapper();
        q.eq("ID","2");
        XueTest xueTest = xueTestService.getOne(q);
        resultData.put("xueTest",xueTest);
        return resultData;
    }
    @RequestMapping("/getMap")
    @ResponseBody
    public Object getMapDemo(){
        QueryWrapper q = new QueryWrapper();
        q.between("AGE",2,23);
        List<Map<String, Object>> list = xueTestService.listMaps(q);
        resultData.put("xueTest", list);
        return resultData;
    }
    @RequestMapping("/getList")
    @ResponseBody
    public Object listDemo(){

        resultData.put("xueTest",xueTestService.list());
        return resultData;
    }
    @RequestMapping("/getPage")
    @ResponseBody
    public Object getPage(){
        Page page = new Page(2,3);// 当前页码，每页条数
        IPage pageResult  = xueTestService.page(page);
        resultData.put("xueTest",pageResult );
        return resultData;
    }
    @RequestMapping("/getPageQuery")
    @ResponseBody
    public Object getPageQuery(){
        Page page = new Page(2,2);
        page.setAsc("ID");
        QueryWrapper q = new QueryWrapper();
        q.eq("AGE","23");
        resultData.put("xueTest",xueTestService.page(page,q));
        return resultData;
    }
    @RequestMapping("/testWrapper")
    @ResponseBody
    public Object testWrapper(){
        QueryWrapper q = new QueryWrapper();
        q.eq("MYNAME","XXD");
        resultData.put("xueTest",xueTestService.selectAll(q));
        return resultData;
    }
    @RequestMapping("/updateDemo")
    @ResponseBody
    public Object updateDemo(){
        UpdateWrapper updateWrapper = new UpdateWrapper();
        updateWrapper.eq("AGE","23");
        updateWrapper.set("MYNAME","zhang");
        xueTestService.update(updateWrapper);

        resultData.put("xueTest","");
        return resultData;
    }
    @RequestMapping("/testDemo")
    @ResponseBody
    public Object testDemo(){
        QueryWrapper q = new QueryWrapper();
        XueTest xueTest = new XueTest();
        xueTest.setMyname("zhang");
        q.setEntity(xueTest);
        resultData.put("xueTest",xueTestService.getOne(q));
        return resultData;
    }


    @RequestMapping("/saveOrUpdate")
    @ResponseBody
    public Object saveOrUpdate(){
        XueTest xueTest = new XueTest();
        xueTest.setId("2");
        xueTest.setMyname("zhang1d1");
        xueTestService.saveOrUpdate(xueTest);
        resultData.put("xueTest","");
        return resultData;
    }

    @RequestMapping("/myGetAllPage")
    @ResponseBody
    public Object myGetAllPage(){
        Page page = new Page(2,3);// 当前页码，每页条数
        IPage pageResult  = xueTestService.myGetAllPage(page,"23");
        resultData.put("xueTest",pageResult);
        return resultData;
    }

}

