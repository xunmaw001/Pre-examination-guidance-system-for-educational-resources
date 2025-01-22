package com.dao;

import com.entity.DianpingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianpingxinxiVO;
import com.entity.view.DianpingxinxiView;


/**
 * 点评信息
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface DianpingxinxiDao extends BaseMapper<DianpingxinxiEntity> {
	
	List<DianpingxinxiVO> selectListVO(@Param("ew") Wrapper<DianpingxinxiEntity> wrapper);
	
	DianpingxinxiVO selectVO(@Param("ew") Wrapper<DianpingxinxiEntity> wrapper);
	
	List<DianpingxinxiView> selectListView(@Param("ew") Wrapper<DianpingxinxiEntity> wrapper);

	List<DianpingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DianpingxinxiEntity> wrapper);
	
	DianpingxinxiView selectView(@Param("ew") Wrapper<DianpingxinxiEntity> wrapper);
	

}
