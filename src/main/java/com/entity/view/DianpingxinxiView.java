package com.entity.view;

import com.entity.DianpingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 点评信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
@TableName("dianpingxinxi")
public class DianpingxinxiView  extends DianpingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianpingxinxiView(){
	}
 
 	public DianpingxinxiView(DianpingxinxiEntity dianpingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, dianpingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
