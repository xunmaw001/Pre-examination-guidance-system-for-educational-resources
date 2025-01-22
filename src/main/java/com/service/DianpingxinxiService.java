package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianpingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianpingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianpingxinxiView;


/**
 * 点评信息
 *
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
public interface DianpingxinxiService extends IService<DianpingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianpingxinxiVO> selectListVO(Wrapper<DianpingxinxiEntity> wrapper);
   	
   	DianpingxinxiVO selectVO(@Param("ew") Wrapper<DianpingxinxiEntity> wrapper);
   	
   	List<DianpingxinxiView> selectListView(Wrapper<DianpingxinxiEntity> wrapper);
   	
   	DianpingxinxiView selectView(@Param("ew") Wrapper<DianpingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianpingxinxiEntity> wrapper);
   	

}

