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
 * 教资信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
@TableName("jiaozixinxi")
public class JiaozixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaozixinxiEntity() {
		
	}
	
	public JiaozixinxiEntity(T t) {
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
	 * 考试名称
	 */
					
	private String kaoshimingcheng;
	
	/**
	 * 级别
	 */
					
	private String jibie;
	
	/**
	 * 考试科目
	 */
					
	private String kaoshikemu;
	
	/**
	 * 证书名称
	 */
					
	private String zhengshumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 报考时间
	 */
					
	private String baokaoshijian;
	
	/**
	 * 考试时间
	 */
					
	private String kaoshishijian;
	
	/**
	 * 地区
	 */
					
	private String diqu;
	
	/**
	 * 考试地点
	 */
					
	private String kaoshididian;
	
	/**
	 * 考试大纲
	 */
					
	private String kaoshidagang;
	
	
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
	 * 设置：考试名称
	 */
	public void setKaoshimingcheng(String kaoshimingcheng) {
		this.kaoshimingcheng = kaoshimingcheng;
	}
	/**
	 * 获取：考试名称
	 */
	public String getKaoshimingcheng() {
		return kaoshimingcheng;
	}
	/**
	 * 设置：级别
	 */
	public void setJibie(String jibie) {
		this.jibie = jibie;
	}
	/**
	 * 获取：级别
	 */
	public String getJibie() {
		return jibie;
	}
	/**
	 * 设置：考试科目
	 */
	public void setKaoshikemu(String kaoshikemu) {
		this.kaoshikemu = kaoshikemu;
	}
	/**
	 * 获取：考试科目
	 */
	public String getKaoshikemu() {
		return kaoshikemu;
	}
	/**
	 * 设置：证书名称
	 */
	public void setZhengshumingcheng(String zhengshumingcheng) {
		this.zhengshumingcheng = zhengshumingcheng;
	}
	/**
	 * 获取：证书名称
	 */
	public String getZhengshumingcheng() {
		return zhengshumingcheng;
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
	 * 设置：报考时间
	 */
	public void setBaokaoshijian(String baokaoshijian) {
		this.baokaoshijian = baokaoshijian;
	}
	/**
	 * 获取：报考时间
	 */
	public String getBaokaoshijian() {
		return baokaoshijian;
	}
	/**
	 * 设置：考试时间
	 */
	public void setKaoshishijian(String kaoshishijian) {
		this.kaoshishijian = kaoshishijian;
	}
	/**
	 * 获取：考试时间
	 */
	public String getKaoshishijian() {
		return kaoshishijian;
	}
	/**
	 * 设置：地区
	 */
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
	/**
	 * 设置：考试地点
	 */
	public void setKaoshididian(String kaoshididian) {
		this.kaoshididian = kaoshididian;
	}
	/**
	 * 获取：考试地点
	 */
	public String getKaoshididian() {
		return kaoshididian;
	}
	/**
	 * 设置：考试大纲
	 */
	public void setKaoshidagang(String kaoshidagang) {
		this.kaoshidagang = kaoshidagang;
	}
	/**
	 * 获取：考试大纲
	 */
	public String getKaoshidagang() {
		return kaoshidagang;
	}

}
