package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaozixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaozixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaozixinxiView;


/**
 * 教资信息
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface JiaozixinxiService extends IService<JiaozixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaozixinxiVO> selectListVO(Wrapper<JiaozixinxiEntity> wrapper);
   	
   	JiaozixinxiVO selectVO(@Param("ew") Wrapper<JiaozixinxiEntity> wrapper);
   	
   	List<JiaozixinxiView> selectListView(Wrapper<JiaozixinxiEntity> wrapper);
   	
   	JiaozixinxiView selectView(@Param("ew") Wrapper<JiaozixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaozixinxiEntity> wrapper);
   	

}

