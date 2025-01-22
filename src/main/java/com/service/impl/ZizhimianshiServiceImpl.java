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


import com.dao.ZizhimianshiDao;
import com.entity.ZizhimianshiEntity;
import com.service.ZizhimianshiService;
import com.entity.vo.ZizhimianshiVO;
import com.entity.view.ZizhimianshiView;

@Service("zizhimianshiService")
public class ZizhimianshiServiceImpl extends ServiceImpl<ZizhimianshiDao, ZizhimianshiEntity> implements ZizhimianshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZizhimianshiEntity> page = this.selectPage(
                new Query<ZizhimianshiEntity>(params).getPage(),
                new EntityWrapper<ZizhimianshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZizhimianshiEntity> wrapper) {
		  Page<ZizhimianshiView> page =new Query<ZizhimianshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZizhimianshiVO> selectListVO(Wrapper<ZizhimianshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZizhimianshiVO selectVO(Wrapper<ZizhimianshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZizhimianshiView> selectListView(Wrapper<ZizhimianshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZizhimianshiView selectView(Wrapper<ZizhimianshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
