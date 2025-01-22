package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZizhimianshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZizhimianshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZizhimianshiView;


/**
 * 资质面试
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface ZizhimianshiService extends IService<ZizhimianshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZizhimianshiVO> selectListVO(Wrapper<ZizhimianshiEntity> wrapper);
   	
   	ZizhimianshiVO selectVO(@Param("ew") Wrapper<ZizhimianshiEntity> wrapper);
   	
   	List<ZizhimianshiView> selectListView(Wrapper<ZizhimianshiEntity> wrapper);
   	
   	ZizhimianshiView selectView(@Param("ew") Wrapper<ZizhimianshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZizhimianshiEntity> wrapper);
   	

}

