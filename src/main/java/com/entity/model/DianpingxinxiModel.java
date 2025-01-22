package com.entity.model;

import com.entity.DianpingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 点评信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public class DianpingxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 点评内容
	 */
	
	private String dianpingneirong;
		
	/**
	 * 意见
	 */
	
	private String yijian;
		
	/**
	 * 点评时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dianpingshijian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：点评内容
	 */
	 
	public void setDianpingneirong(String dianpingneirong) {
		this.dianpingneirong = dianpingneirong;
	}
	
	/**
	 * 获取：点评内容
	 */
	public String getDianpingneirong() {
		return dianpingneirong;
	}
				
	
	/**
	 * 设置：意见
	 */
	 
	public void setYijian(String yijian) {
		this.yijian = yijian;
	}
	
	/**
	 * 获取：意见
	 */
	public String getYijian() {
		return yijian;
	}
				
	
	/**
	 * 设置：点评时间
	 */
	 
	public void setDianpingshijian(Date dianpingshijian) {
		this.dianpingshijian = dianpingshijian;
	}
	
	/**
	 * 获取：点评时间
	 */
	public Date getDianpingshijian() {
		return dianpingshijian;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
