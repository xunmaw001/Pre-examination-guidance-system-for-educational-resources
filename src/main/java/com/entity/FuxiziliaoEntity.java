package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 复习资料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
@TableName("fuxiziliao")
public class FuxiziliaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FuxiziliaoEntity() {
		
	}
	
	public FuxiziliaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 资料编号
	 */
					
	private String ziliaobianhao;
	
	/**
	 * 资料名称
	 */
					
	private String ziliaomingcheng;
	
	/**
	 * 资料类型
	 */
					
	private String ziliaoleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 资料附件
	 */
					
	private String ziliaofujian;
	
	/**
	 * 资料介绍
	 */
					
	private String ziliaojieshao;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：资料编号
	 */
	public void setZiliaobianhao(String ziliaobianhao) {
		this.ziliaobianhao = ziliaobianhao;
	}
	/**
	 * 获取：资料编号
	 */
	public String getZiliaobianhao() {
		return ziliaobianhao;
	}
	/**
	 * 设置：资料名称
	 */
	public void setZiliaomingcheng(String ziliaomingcheng) {
		this.ziliaomingcheng = ziliaomingcheng;
	}
	/**
	 * 获取：资料名称
	 */
	public String getZiliaomingcheng() {
		return ziliaomingcheng;
	}
	/**
	 * 设置：资料类型
	 */
	public void setZiliaoleixing(String ziliaoleixing) {
		this.ziliaoleixing = ziliaoleixing;
	}
	/**
	 * 获取：资料类型
	 */
	public String getZiliaoleixing() {
		return ziliaoleixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：资料附件
	 */
	public void setZiliaofujian(String ziliaofujian) {
		this.ziliaofujian = ziliaofujian;
	}
	/**
	 * 获取：资料附件
	 */
	public String getZiliaofujian() {
		return ziliaofujian;
	}
	/**
	 * 设置：资料介绍
	 */
	public void setZiliaojieshao(String ziliaojieshao) {
		this.ziliaojieshao = ziliaojieshao;
	}
	/**
	 * 获取：资料介绍
	 */
	public String getZiliaojieshao() {
		return ziliaojieshao;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
