package com.dao;

import com.entity.FuxiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuxiziliaoVO;
import com.entity.view.FuxiziliaoView;


/**
 * 复习资料
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface FuxiziliaoDao extends BaseMapper<FuxiziliaoEntity> {
	
	List<FuxiziliaoVO> selectListVO(@Param("ew") Wrapper<FuxiziliaoEntity> wrapper);
	
	FuxiziliaoVO selectVO(@Param("ew") Wrapper<FuxiziliaoEntity> wrapper);
	
	List<FuxiziliaoView> selectListView(@Param("ew") Wrapper<FuxiziliaoEntity> wrapper);

	List<FuxiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<FuxiziliaoEntity> wrapper);
	
	FuxiziliaoView selectView(@Param("ew") Wrapper<FuxiziliaoEntity> wrapper);
	

}
