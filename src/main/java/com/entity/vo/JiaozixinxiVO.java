package com.entity.vo;

import com.entity.JiaozixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教资信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public class JiaozixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
