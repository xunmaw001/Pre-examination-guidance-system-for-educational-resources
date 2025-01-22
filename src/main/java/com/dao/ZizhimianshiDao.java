package com.dao;

import com.entity.ZizhimianshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZizhimianshiVO;
import com.entity.view.ZizhimianshiView;


/**
 * 资质面试
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface ZizhimianshiDao extends BaseMapper<ZizhimianshiEntity> {
	
	List<ZizhimianshiVO> selectListVO(@Param("ew") Wrapper<ZizhimianshiEntity> wrapper);
	
	ZizhimianshiVO selectVO(@Param("ew") Wrapper<ZizhimianshiEntity> wrapper);
	
	List<ZizhimianshiView> selectListView(@Param("ew") Wrapper<ZizhimianshiEntity> wrapper);

	List<ZizhimianshiView> selectListView(Pagination page,@Param("ew") Wrapper<ZizhimianshiEntity> wrapper);
	
	ZizhimianshiView selectView(@Param("ew") Wrapper<ZizhimianshiEntity> wrapper);
	

}
