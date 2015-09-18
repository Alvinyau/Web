package com.alvin.tree.model;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Alvinyau on 2015/9/18.
 */
public class TreeNode {

    private String id;
    private String name;
    private String pId;
    private String pName;
    private String isParent;
    private String open;

    public TreeNode(){

    }

    public TreeNode(String id, String name, String pId, String pName, String isParent) {
        this.id = id;
        this.name = name;
        this.pId = pId;
        this.pName = pName;
        this.isParent = isParent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }
}
