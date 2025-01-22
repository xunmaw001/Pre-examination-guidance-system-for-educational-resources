package com.entity.vo;

import com.entity.FuxiziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 复习资料
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public class FuxiziliaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
