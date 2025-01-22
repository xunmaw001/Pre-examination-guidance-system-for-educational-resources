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


import com.dao.XueyuanmingchengDao;
import com.entity.XueyuanmingchengEntity;
import com.service.XueyuanmingchengService;
import com.entity.vo.XueyuanmingchengVO;
import com.entity.view.XueyuanmingchengView;

@Service("xueyuanmingchengService")
public class XueyuanmingchengServiceImpl extends ServiceImpl<XueyuanmingchengDao, XueyuanmingchengEntity> implements XueyuanmingchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueyuanmingchengEntity> page = this.selectPage(
                new Query<XueyuanmingchengEntity>(params).getPage(),
                new EntityWrapper<XueyuanmingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueyuanmingchengEntity> wrapper) {
		  Page<XueyuanmingchengView> page =new Query<XueyuanmingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueyuanmingchengVO> selectListVO(Wrapper<XueyuanmingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueyuanmingchengVO selectVO(Wrapper<XueyuanmingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueyuanmingchengView> selectListView(Wrapper<XueyuanmingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueyuanmingchengView selectView(Wrapper<XueyuanmingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
