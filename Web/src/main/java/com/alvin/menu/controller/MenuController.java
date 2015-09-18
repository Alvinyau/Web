package com.alvin.menu.controller;

import com.alvin.menu.model.Menu;
import com.alvin.menu.service.IMenuService;
import com.alvin.tree.model.TreeNode;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alvinyau on 2015/9/14.
 */
@Controller
@RequestMapping(value="/menu")
public class MenuController {

    private final static Logger LOG= Logger.getLogger(MenuController.class);

    @Resource
    private IMenuService iMenuService;
    private List<TreeNode> treeNodeList=null;
    private StringBuffer stringBuffer=null;


    @RequestMapping(value="linkToMenuInfoPager",method=RequestMethod.GET)
    public String linkToMenuInfoPager(ModelMap model){
        return "menu";
    }

    @ResponseBody
    @RequestMapping(value="queryMenuInfoList",method=RequestMethod.POST)
    public List<TreeNode> queryMenuInfoList(@RequestParam String id,String name){
        LOG.info("queryMenuInfoList() start.");
        treeNodeList=new ArrayList<TreeNode>();
        BigDecimal menuId=new BigDecimal(10044);
        this.buildTree(menuId);
        LOG.info("queryMenuInfoList() end.");
        return treeNodeList;
    }

    private void buildTree(BigDecimal id){
        TreeNode treeNode=null;
        Menu menu=this.iMenuService.queryMenuInfoByID(id);
        if(menu!=null){
            BigDecimal idTemp=menu.getId();
            if(idTemp!=null && !idTemp.equals(0)){
                treeNode=new TreeNode(idTemp.toString(),menu.getName(),menu.getPid()!=null?menu.getPid().toString():null,"","");
                List<Menu> temp=this.iMenuService.queryMenuInfoListForPid(idTemp);
                if(temp!=null && temp.size()>0){
                    treeNode.setIsParent("true");
                    treeNode.setOpen("false");
                    treeNodeList.add(treeNode);
                    for(Menu child:temp){
                        buildTree(child.getId());
                    }
                }else{
                    treeNodeList.add(treeNode);
                }
            }
        }
    }

}
