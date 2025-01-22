package com.dao;

import com.entity.JiaozixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaozixinxiVO;
import com.entity.view.JiaozixinxiView;


/**
 * 教资信息
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface JiaozixinxiDao extends BaseMapper<JiaozixinxiEntity> {
	
	List<JiaozixinxiVO> selectListVO(@Param("ew") Wrapper<JiaozixinxiEntity> wrapper);
	
	JiaozixinxiVO selectVO(@Param("ew") Wrapper<JiaozixinxiEntity> wrapper);
	
	List<JiaozixinxiView> selectListView(@Param("ew") Wrapper<JiaozixinxiEntity> wrapper);

	List<JiaozixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaozixinxiEntity> wrapper);
	
	JiaozixinxiView selectView(@Param("ew") Wrapper<JiaozixinxiEntity> wrapper);
	

}
