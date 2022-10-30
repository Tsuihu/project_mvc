package com.example.project_mvc.controller;

import com.example.project_mvc.pojo.Custom;
import com.example.project_mvc.pojo.bo.PageRequestBO;
import com.example.project_mvc.pojo.bo.PageResultBO;
import com.example.project_mvc.service.ICustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/custom")
public class CustomController {
    @Autowired
    ICustomService customService;

    /**
     * 分页接口
     * @param model
     * @return
     * @throws Exception
     */
    @PostMapping("/getpagecustom.do")
    public PageResultBO<Custom> getPageCustom(@RequestBody PageRequestBO model) throws Exception {
        return customService.getPagedCustom(model);
    }

    /**
     * 插入数据接口
     * @param custom
     * @return custom对象
     */
    @PostMapping("/insertcustom.do")
    public Custom insertCustom(@RequestBody Custom custom) {
        customService.insertCustom(custom);
        return custom;
    }

    /**
     * 修改数据接口
     * @param custom
     * @return custom对象
     */
    @PostMapping("/updatecustom.do")
    public Custom updateCustom(@RequestBody Custom custom) {
        customService.updateCustom(custom);
        return custom;
    }

    /**
     * 删除数据接口
     * @param customId
     * @return
     */
    @PostMapping("/deleteustom.do")
    public Custom deleteCustom(Integer customId) {
        customService.deleteCustom(customId);
        return null;
    }

    /**
     * 根据customId查询一条数据
     * @param customId
     * @return custom对象
     */
    @PostMapping("/getcustombyid.do")
    public Custom getCustomById(Integer customId) {
        Custom custom = customService.getCustomById(customId);
        return custom;
    }

    /**
     * 根据name查询相关数据
     * @param customName
     * @return 数组
     */
    @PostMapping("/getcustomlistbyname.do")
    public List<Custom> getCustomListByName(String customName) {
        List<Custom> customList = customService.getCustomListByName(customName);
        return customList;
    }
}
