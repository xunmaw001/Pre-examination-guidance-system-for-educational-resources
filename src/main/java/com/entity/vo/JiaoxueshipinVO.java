package com.entity.vo;

import com.entity.JiaoxueshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教学视频
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public class JiaoxueshipinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 视频名称
	 */
	
	private String shipinmingcheng;
		
	/**
	 * 封面图
	 */
	
	private String fengmiantu;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 视频介绍
	 */
	
	private String shipinjieshao;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：视频名称
	 */
	 
	public void setShipinmingcheng(String shipinmingcheng) {
		this.shipinmingcheng = shipinmingcheng;
	}
	
	/**
	 * 获取：视频名称
	 */
	public String getShipinmingcheng() {
		return shipinmingcheng;
	}
				
	
	/**
	 * 设置：封面图
	 */
	 
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
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
	 * 设置：视频介绍
	 */
	 
	public void setShipinjieshao(String shipinjieshao) {
		this.shipinjieshao = shipinjieshao;
	}
	
	/**
	 * 获取：视频介绍
	 */
	public String getShipinjieshao() {
		return shipinjieshao;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
