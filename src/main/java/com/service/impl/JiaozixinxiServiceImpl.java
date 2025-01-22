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


import com.dao.JiaozixinxiDao;
import com.entity.JiaozixinxiEntity;
import com.service.JiaozixinxiService;
import com.entity.vo.JiaozixinxiVO;
import com.entity.view.JiaozixinxiView;

@Service("jiaozixinxiService")
public class JiaozixinxiServiceImpl extends ServiceImpl<JiaozixinxiDao, JiaozixinxiEntity> implements JiaozixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaozixinxiEntity> page = this.selectPage(
                new Query<JiaozixinxiEntity>(params).getPage(),
                new EntityWrapper<JiaozixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaozixinxiEntity> wrapper) {
		  Page<JiaozixinxiView> page =new Query<JiaozixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaozixinxiVO> selectListVO(Wrapper<JiaozixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaozixinxiVO selectVO(Wrapper<JiaozixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaozixinxiView> selectListView(Wrapper<JiaozixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaozixinxiView selectView(Wrapper<JiaozixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
