package com.base.baseLine.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.base.baseLine.model.ResultData;
import com.base.baseLine.model.XueTest;
import com.base.baseLine.service.XueTestService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
        QueryWrapper<XueTest> q = new QueryWrapper<>();
        q.eq("ID","2");
        XueTest xueTest = xueTestService.getOne(q);
        resultData.put("xueTest",xueTest);
        return resultData;
    }
    @RequestMapping("/getMap")
    @ResponseBody
    public Object getMapDemo(){
        QueryWrapper<XueTest> q = new QueryWrapper<>();
        q.eq("AGE","23");

        resultData.put("xueTest", xueTestService.getMap(q));
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
        Page page = new Page(2,3);
        resultData.put("xueTest",xueTestService.page(page));
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
//    @RequestMapping("/selectDemo")
//    @ResponseBody
//    public Object selectDemo(){
//        XueTest xueTest = xueTestService.getById("1");
//        resultData.put("xueTest",xueTest);
//        return resultData;
//    }



}

