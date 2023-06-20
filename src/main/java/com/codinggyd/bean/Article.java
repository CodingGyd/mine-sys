package com.codinggyd.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @Title: Article.java
 * @Package: com.codinggyd.bean
 * @Description: 文章信息实体类
 * 
 * @Author: guoyd
 * @Date: 2017年9月11日
 *
 * Copyright @ 2017 Corpration Name
 */
public class Article implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4785066758102282805L;
	private Integer id;
	/**
	 * 标题
	 */
	public String title;
	/**
	 * 描述
	 */
	public String descs;
	
	/**
	 * 原始内容
	 */
	private String content;

	/**
	 * html内容
	 */
	private String htmlContent;
	
	/**
	 * 更新时间
	 */
	private String updatetime;
	/**
	 * 被阅读次数
	 */
	private Integer readingcount;
	 
	/**
	 * 文章类型
	 */
	private String type;
	
	/**
	 * 文章关键词
	 */
	private List<ArticleKeyWordRelation> keys;
	private Integer userId;
	private boolean editing;//easyui 表格对象属性
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

 
	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getReadingcount() {
		return readingcount;
	}

	public void setReadingcount(Integer readingcount) {
		this.readingcount = readingcount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEditing() {
		return editing;
	}

	public void setEditing(boolean editing) {
		this.editing = editing;
	}

	public List<ArticleKeyWordRelation> getKeys() {
		return keys;
	}

	public void setKeys(List<ArticleKeyWordRelation> keys) {
		this.keys = keys;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	 
}
