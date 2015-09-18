package com.alvin.menu.dao.impl;

import com.alvin.menu.dao.IMenuDao;
import com.alvin.menu.mapper.MenuMapper;
import com.alvin.menu.model.Menu;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alvinyau on 2015/9/14.
 */
@Repository
public class MenuDaoImpl implements IMenuDao{

    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> queryMenuInfoList(Menu menu) {
        return this.menuMapper.queryMenuInfoList(menu);
    }

    @Override
    public List<Menu> queryMenuInfoListForPid(BigDecimal pId) {
        return this.menuMapper.queryMenuInfoListForPid(pId);
    }

    @Override
    public Menu queryMenuInfoByID(BigDecimal id) {
        return this.menuMapper.selectByPrimaryKey(id);
    }
}
