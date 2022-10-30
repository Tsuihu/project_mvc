package com.example.project_mvc.service.impl;

import com.example.project_mvc.dao.CustomDao;
import com.example.project_mvc.pojo.Custom;
import com.example.project_mvc.pojo.bo.PageRequestBO;
import com.example.project_mvc.pojo.bo.PageResultBO;
import com.example.project_mvc.service.ICustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomServiceImpl implements ICustomService {
    @Autowired
    CustomDao customDao;

    /**
     * 分页查询操作
     * @param model（第几页，每页多少条）
     * @return 泛型，数据总条数和分页查询结果
     */
    @Override
    public PageResultBO<Custom> getPagedCustom(PageRequestBO model) {
        // 判断参数是否错误
        if(model.getPageIndex() < 0) {
            model.setPageIndex(0);
        }
        List<Custom> list = customDao.getPagedCustom(model);
        Integer count = customDao.getPagedCustomCount();
        PageResultBO<Custom> pageResult = new PageResultBO(list,count);
        return pageResult;
    }

    /**
     * 向custom插入一条数据
     * @param custom
     * @return custom对象
     */
    @Override
    public Custom insertCustom(Custom custom) {
        customDao.insertCustom(custom);
        return custom;
    }

    /**
     * 修改custom里的数据
     * @param custom
     * @return custom对象
     */
    @Override
    public Custom updateCustom(Custom custom) {
        customDao.updateCustom(custom);
        return custom;
    }

    /**
     * 删除一条数据
     * @param customId
     * @return
     */
    @Override
    public Custom deleteCustom(Integer customId) {
        customDao.deleteCustom(customId);
        return null;
    }

    /**
     * 根据customId查询数据
     * @param customId
     * @return
     */
    @Override
    public Custom getCustomById(Integer customId) {
        Custom custom = customDao.getCustomById(customId);
        return custom;
    }

    /**
     * 根据name查询含有name的数据
     * @param customName
     * @return 数组
     */
    @Override
    public List<Custom> getCustomListByName(String customName) {
        List<Custom> customList = customDao.getCustomListByName(customName);
        return customList;
    }
}
