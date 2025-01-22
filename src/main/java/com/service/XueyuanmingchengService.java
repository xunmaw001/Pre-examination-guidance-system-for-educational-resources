package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuanmingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueyuanmingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueyuanmingchengView;


/**
 * 学院名称
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface XueyuanmingchengService extends IService<XueyuanmingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueyuanmingchengVO> selectListVO(Wrapper<XueyuanmingchengEntity> wrapper);
   	
   	XueyuanmingchengVO selectVO(@Param("ew") Wrapper<XueyuanmingchengEntity> wrapper);
   	
   	List<XueyuanmingchengView> selectListView(Wrapper<XueyuanmingchengEntity> wrapper);
   	
   	XueyuanmingchengView selectView(@Param("ew") Wrapper<XueyuanmingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueyuanmingchengEntity> wrapper);
   	

}

