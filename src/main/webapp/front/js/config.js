
var projectName = '教资考前指导系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '练习记录',
	url: '../examrecord/list.html'
}, 
{
	name: '错题本',
	url: '../examrecord/wrong.html'
},
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '教师',
	url: './pages/jiaoshi/list.html'
}, 
{
	name: '问题信息',
	url: './pages/wentixinxi/list.html'
}, 
{
	name: '教资信息',
	url: './pages/jiaozixinxi/list.html'
}, 
{
	name: '复习资料',
	url: './pages/fuxiziliao/list.html'
}, 
{
	name: '教学视频',
	url: './pages/jiaoxueshipin/list.html'
}, 

{
	name: '在线练习',
	url: './pages/exampaper/list.html'
}, 
]

var adminurl =  "http://localhost:8080/ssmjobfi/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"学院名称","menuJump":"列表","tableName":"xueyuanmingcheng"}],"menu":"学院名称管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除","查看评论"],"menu":"问题信息","menuJump":"列表","tableName":"wentixinxi"}],"menu":"问题信息管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"教资信息","menuJump":"列表","tableName":"jiaozixinxi"}],"menu":"教资信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"资料类型","menuJump":"列表","tableName":"ziliaoleixing"}],"menu":"资料类型管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除"],"menu":"复习资料","menuJump":"列表","tableName":"fuxiziliao"}],"menu":"复习资料管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除","查看评论"],"menu":"教学视频","menuJump":"列表","tableName":"jiaoxueshipin"}],"menu":"教学视频管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"资质面试","menuJump":"列表","tableName":"zizhimianshi"}],"menu":"资质面试管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"点评信息","menuJump":"列表","tableName":"dianpingxinxi"}],"menu":"点评信息管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","面试"],"menu":"教师列表","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师模块"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"问题信息列表","menuJump":"列表","tableName":"wentixinxi"}],"menu":"问题信息模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"教资信息列表","menuJump":"列表","tableName":"jiaozixinxi"}],"menu":"教资信息模块"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"复习资料列表","menuJump":"列表","tableName":"fuxiziliao"}],"menu":"复习资料模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"教学视频列表","menuJump":"列表","tableName":"jiaoxueshipin"}],"menu":"教学视频模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除","查看评论"],"menu":"问题信息","menuJump":"列表","tableName":"wentixinxi"}],"menu":"问题信息管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除","修改","支付"],"menu":"资质面试","menuJump":"列表","tableName":"zizhimianshi"}],"menu":"资质面试管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"点评信息","menuJump":"列表","tableName":"dianpingxinxi"}],"menu":"点评信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","面试"],"menu":"教师列表","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师模块"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"问题信息列表","menuJump":"列表","tableName":"wentixinxi"}],"menu":"问题信息模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"教资信息列表","menuJump":"列表","tableName":"jiaozixinxi"}],"menu":"教资信息模块"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"复习资料列表","menuJump":"列表","tableName":"fuxiziliao"}],"menu":"复习资料模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"教学视频列表","menuJump":"列表","tableName":"jiaoxueshipin"}],"menu":"教学视频模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除","查看评论"],"menu":"问题信息","menuJump":"列表","tableName":"wentixinxi"}],"menu":"问题信息管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除","点评"],"menu":"资质面试","menuJump":"列表","tableName":"zizhimianshi"}],"menu":"资质面试管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"点评信息","menuJump":"列表","tableName":"dianpingxinxi"}],"menu":"点评信息管理"},{"child":[{"appFrontIcon":"cuIcon-calendar","buttons":["新增","查看","修改","删除"],"menu":"练习题库管理","tableName":"examquestion"}],"menu":"练习题库管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"在线练习管理","tableName":"exampaper"}],"menu":"在线练习管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","删除"],"menu":"错题本","tableName":"examfailrecord"},{"appFrontIcon":"cuIcon-read","buttons":["查看","删除"],"menu":"练习记录","tableName":"examrecord"}],"menu":"练习管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","面试"],"menu":"教师列表","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师模块"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"问题信息列表","menuJump":"列表","tableName":"wentixinxi"}],"menu":"问题信息模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"教资信息列表","menuJump":"列表","tableName":"jiaozixinxi"}],"menu":"教资信息模块"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"复习资料列表","menuJump":"列表","tableName":"fuxiziliao"}],"menu":"复习资料模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"教学视频列表","menuJump":"列表","tableName":"jiaoxueshipin"}],"menu":"教学视频模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
