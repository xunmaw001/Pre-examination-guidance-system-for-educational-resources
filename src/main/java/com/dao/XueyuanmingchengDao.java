package com.dao;

import com.entity.XueyuanmingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuanmingchengVO;
import com.entity.view.XueyuanmingchengView;


/**
 * 学院名称
 * 
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface XueyuanmingchengDao extends BaseMapper<XueyuanmingchengEntity> {
	
	List<XueyuanmingchengVO> selectListVO(@Param("ew") Wrapper<XueyuanmingchengEntity> wrapper);
	
	XueyuanmingchengVO selectVO(@Param("ew") Wrapper<XueyuanmingchengEntity> wrapper);
	
	List<XueyuanmingchengView> selectListView(@Param("ew") Wrapper<XueyuanmingchengEntity> wrapper);

	List<XueyuanmingchengView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuanmingchengEntity> wrapper);
	
	XueyuanmingchengView selectView(@Param("ew") Wrapper<XueyuanmingchengEntity> wrapper);
	

}
