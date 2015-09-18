package com.alvin.menu.model;

import com.alvin.tree.model.TreeNode;
import java.math.BigDecimal;
import java.util.Date;

public class Menu{
    private BigDecimal id;

    private String name;

    private String linkUrl;

    private BigDecimal pid;

    private BigDecimal lft;

    private BigDecimal rgt;

    private Long sortValue;

    private String showIcon;

    private String description;

    private Long creator;

    private Date createTime;

    private Long modifier;

    private Date modifiedTime;

    private String code;

    private Short display;

    private Object resources;

    private Short menuLevel;

    private Short menuLevel1;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public BigDecimal getPid() {
        return pid;
    }

    public void setPid(BigDecimal pid) {
        this.pid = pid;
    }

    public BigDecimal getLft() {
        return lft;
    }

    public void setLft(BigDecimal lft) {
        this.lft = lft;
    }

    public BigDecimal getRgt() {
        return rgt;
    }

    public void setRgt(BigDecimal rgt) {
        this.rgt = rgt;
    }

    public Long getSortValue() {
        return sortValue;
    }

    public void setSortValue(Long sortValue) {
        this.sortValue = sortValue;
    }

    public String getShowIcon() {
        return showIcon;
    }

    public void setShowIcon(String showIcon) {
        this.showIcon = showIcon == null ? null : showIcon.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Short getDisplay() {
        return display;
    }

    public void setDisplay(Short display) {
        this.display = display;
    }

    public Object getResources() {
        return resources;
    }

    public void setResources(Object resources) {
        this.resources = resources;
    }

    public Short getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Short menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Short getMenuLevel1() {
        return menuLevel1;
    }

    public void setMenuLevel1(Short menuLevel1) {
        this.menuLevel1 = menuLevel1;
    }
}