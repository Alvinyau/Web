package com.alvin.menu.dao;

import com.alvin.menu.model.Menu;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Alvinyau on 2015/9/14.
 */
@Repository
public interface IMenuDao {

    public List<Menu> queryMenuInfoList(Menu menu);

    public List<Menu> queryMenuInfoListForPid(BigDecimal pId);

    public Menu queryMenuInfoByID(BigDecimal id);
}
