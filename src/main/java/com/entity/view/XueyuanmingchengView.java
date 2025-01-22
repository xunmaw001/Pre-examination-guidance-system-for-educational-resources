package com.entity.view;

import com.entity.XueyuanmingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学院名称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
@TableName("xueyuanmingcheng")
public class XueyuanmingchengView  extends XueyuanmingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueyuanmingchengView(){
	}
 
 	public XueyuanmingchengView(XueyuanmingchengEntity xueyuanmingchengEntity){
 	try {
			BeanUtils.copyProperties(this, xueyuanmingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
