package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WentixinxiEntity;
import com.entity.view.WentixinxiView;

import com.service.WentixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 问题信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-23 22:53:50
 */
@RestController
@RequestMapping("/wentixinxi")
public class WentixinxiController {
    @Autowired
    private WentixinxiService wentixinxiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WentixinxiEntity wentixinxi, 
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wentixinxi.setUserid((Long)request.getSession().getAttribute("userId"));
    	}

        EntityWrapper<WentixinxiEntity> ew = new EntityWrapper<WentixinxiEntity>();
		PageUtils page = wentixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wentixinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WentixinxiEntity wentixinxi, 
		HttpServletRequest request){
        EntityWrapper<WentixinxiEntity> ew = new EntityWrapper<WentixinxiEntity>();
		PageUtils page = wentixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wentixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WentixinxiEntity wentixinxi){
       	EntityWrapper<WentixinxiEntity> ew = new EntityWrapper<WentixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wentixinxi, "wentixinxi")); 
        return R.ok().put("data", wentixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WentixinxiEntity wentixinxi){
        EntityWrapper< WentixinxiEntity> ew = new EntityWrapper< WentixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wentixinxi, "wentixinxi")); 
		WentixinxiView wentixinxiView =  wentixinxiService.selectView(ew);
		return R.ok("查询问题信息成功").put("data", wentixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WentixinxiEntity wentixinxi = wentixinxiService.selectById(id);
        return R.ok().put("data", wentixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WentixinxiEntity wentixinxi = wentixinxiService.selectById(id);
        return R.ok().put("data", wentixinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        WentixinxiEntity wentixinxi = wentixinxiService.selectById(id);
        if(type.equals("1")) {
        	wentixinxi.setThumbsupnum(wentixinxi.getThumbsupnum()+1);
        } else {
        	wentixinxi.setCrazilynum(wentixinxi.getCrazilynum()+1);
        }
        wentixinxiService.updateById(wentixinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WentixinxiEntity wentixinxi, HttpServletRequest request){
    	wentixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wentixinxi);
    	wentixinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        wentixinxiService.insert(wentixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WentixinxiEntity wentixinxi, HttpServletRequest request){
    	wentixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wentixinxi);

        wentixinxiService.insert(wentixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WentixinxiEntity wentixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wentixinxi);
        wentixinxiService.updateById(wentixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wentixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WentixinxiEntity> wrapper = new EntityWrapper<WentixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
		if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}


		int count = wentixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
