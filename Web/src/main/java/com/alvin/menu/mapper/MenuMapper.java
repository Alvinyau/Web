package com.alvin.menu.mapper;

import com.alvin.menu.model.Menu;
import com.sun.deploy.security.BlacklistedCerts;

import java.math.BigDecimal;
import java.util.List;

public interface MenuMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    public List<Menu> queryMenuInfoList(Menu menu);

    public List<Menu> queryMenuInfoListForPid(BigDecimal id);

}