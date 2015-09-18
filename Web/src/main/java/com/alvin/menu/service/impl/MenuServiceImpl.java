package com.alvin.menu.service.impl;

import com.alvin.menu.dao.IMenuDao;
import com.alvin.menu.model.Menu;
import com.alvin.menu.service.IMenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alvinyau on 2015/9/14.
 */
@Service
public class MenuServiceImpl implements IMenuService{

    @Resource
    private IMenuDao iMenuDao;

    @Override
    public List<Menu> queryMenuInfoList(Menu menu) {
        return this.iMenuDao.queryMenuInfoList(menu);
    }

    @Override
    public List<Menu> queryMenuInfoListForPid(BigDecimal pId) {
        return this.iMenuDao.queryMenuInfoListForPid(pId);
    }

    @Override
    public Menu queryMenuInfoByID(BigDecimal id) {
        return this.iMenuDao.queryMenuInfoByID(id);
    }
}
