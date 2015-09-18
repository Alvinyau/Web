package com.alvin.menu.service;

import com.alvin.menu.model.Menu;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alvinyau on 2015/9/14.
 */
public interface IMenuService {

    public List<Menu> queryMenuInfoList(Menu menu);

    public List<Menu> queryMenuInfoListForPid(BigDecimal pId);

    public Menu queryMenuInfoByID(BigDecimal id);

}
