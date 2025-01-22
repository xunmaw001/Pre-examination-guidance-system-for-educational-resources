import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import dianpingxinxi from '@/views/modules/dianpingxinxi/list'
    import jiaozixinxi from '@/views/modules/jiaozixinxi/list'
    import examfailrecord from '@/views/modules/examfailrecord/list'
    import zizhimianshi from '@/views/modules/zizhimianshi/list'
    import xueyuanmingcheng from '@/views/modules/xueyuanmingcheng/list'
    import jiaoxueshipin from '@/views/modules/jiaoxueshipin/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import examquestion from '@/views/modules/examquestion/list'
    import wentixinxi from '@/views/modules/wentixinxi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import exampaper from '@/views/modules/exampaper/list'
    import ziliaoleixing from '@/views/modules/ziliaoleixing/list'
    import fuxiziliao from '@/views/modules/fuxiziliao/list'
    import discussjiaoxueshipin from '@/views/modules/discussjiaoxueshipin/list'
    import discusswentixinxi from '@/views/modules/discusswentixinxi/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/dianpingxinxi',
        name: '点评信息',
        component: dianpingxinxi
      }
      ,{
	path: '/jiaozixinxi',
        name: '教资信息',
        component: jiaozixinxi
      }
      ,{
	path: '/examfailrecord',
        name: '错题本',
        component: examfailrecord
      }
      ,{
	path: '/zizhimianshi',
        name: '资质面试',
        component: zizhimianshi
      }
      ,{
	path: '/xueyuanmingcheng',
        name: '学院名称',
        component: xueyuanmingcheng
      }
      ,{
	path: '/jiaoxueshipin',
        name: '教学视频',
        component: jiaoxueshipin
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/examquestion',
        name: '练习题库管理',
        component: examquestion
      }
      ,{
	path: '/wentixinxi',
        name: '问题信息',
        component: wentixinxi
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/exampaper',
        name: '在线练习管理',
        component: exampaper
      }
      ,{
	path: '/ziliaoleixing',
        name: '资料类型',
        component: ziliaoleixing
      }
      ,{
	path: '/fuxiziliao',
        name: '复习资料',
        component: fuxiziliao
      }
      ,{
	path: '/discussjiaoxueshipin',
        name: '教学视频评论',
        component: discussjiaoxueshipin
      }
      ,{
	path: '/discusswentixinxi',
        name: '问题信息评论',
        component: discusswentixinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '练习记录',
        component: examrecord
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
