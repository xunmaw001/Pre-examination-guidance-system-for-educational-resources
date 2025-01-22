package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DianpingxinxiDao;
import com.entity.DianpingxinxiEntity;
import com.service.DianpingxinxiService;
import com.entity.vo.DianpingxinxiVO;
import com.entity.view.DianpingxinxiView;

@Service("dianpingxinxiService")
public class DianpingxinxiServiceImpl extends ServiceImpl<DianpingxinxiDao, DianpingxinxiEntity> implements DianpingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianpingxinxiEntity> page = this.selectPage(
                new Query<DianpingxinxiEntity>(params).getPage(),
                new EntityWrapper<DianpingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianpingxinxiEntity> wrapper) {
		  Page<DianpingxinxiView> page =new Query<DianpingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianpingxinxiVO> selectListVO(Wrapper<DianpingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianpingxinxiVO selectVO(Wrapper<DianpingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianpingxinxiView> selectListView(Wrapper<DianpingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianpingxinxiView selectView(Wrapper<DianpingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
