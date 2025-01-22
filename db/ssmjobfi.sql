-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmjobfi
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssmjobfi`
--

/*!40000 DROP DATABASE IF EXISTS `ssmjobfi`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmjobfi` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmjobfi`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dianpingxinxi`
--

DROP TABLE IF EXISTS `dianpingxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dianpingxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `dianpingneirong` longtext COMMENT '点评内容',
  `yijian` longtext COMMENT '意见',
  `dianpingshijian` datetime DEFAULT NULL COMMENT '点评时间',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='点评信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dianpingxinxi`
--

LOCK TABLES `dianpingxinxi` WRITE;
/*!40000 ALTER TABLE `dianpingxinxi` DISABLE KEYS */;
INSERT INTO `dianpingxinxi` VALUES (101,'2022-04-23 14:54:25','标题1','学号1','姓名1','点评内容1','意见1','2022-04-23 22:54:25','工号1','教师姓名1'),(102,'2022-04-23 14:54:25','标题2','学号2','姓名2','点评内容2','意见2','2022-04-23 22:54:25','工号2','教师姓名2'),(103,'2022-04-23 14:54:25','标题3','学号3','姓名3','点评内容3','意见3','2022-04-23 22:54:25','工号3','教师姓名3'),(104,'2022-04-23 14:54:25','标题4','学号4','姓名4','点评内容4','意见4','2022-04-23 22:54:25','工号4','教师姓名4'),(105,'2022-04-23 14:54:25','标题5','学号5','姓名5','点评内容5','意见5','2022-04-23 22:54:25','工号5','教师姓名5'),(106,'2022-04-23 14:54:25','标题6','学号6','姓名6','点评内容6','意见6','2022-04-23 22:54:25','工号6','教师姓名6');
/*!40000 ALTER TABLE `dianpingxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjiaoxueshipin`
--

DROP TABLE IF EXISTS `discussjiaoxueshipin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjiaoxueshipin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='教学视频评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjiaoxueshipin`
--

LOCK TABLES `discussjiaoxueshipin` WRITE;
/*!40000 ALTER TABLE `discussjiaoxueshipin` DISABLE KEYS */;
INSERT INTO `discussjiaoxueshipin` VALUES (161,'2022-04-23 14:54:25',1,1,'用户名1','评论内容1','回复内容1'),(162,'2022-04-23 14:54:25',2,2,'用户名2','评论内容2','回复内容2'),(163,'2022-04-23 14:54:25',3,3,'用户名3','评论内容3','回复内容3'),(164,'2022-04-23 14:54:25',4,4,'用户名4','评论内容4','回复内容4'),(165,'2022-04-23 14:54:25',5,5,'用户名5','评论内容5','回复内容5'),(166,'2022-04-23 14:54:25',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjiaoxueshipin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusswentixinxi`
--

DROP TABLE IF EXISTS `discusswentixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusswentixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='问题信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusswentixinxi`
--

LOCK TABLES `discusswentixinxi` WRITE;
/*!40000 ALTER TABLE `discusswentixinxi` DISABLE KEYS */;
INSERT INTO `discusswentixinxi` VALUES (151,'2022-04-23 14:54:25',1,1,'用户名1','评论内容1','回复内容1'),(152,'2022-04-23 14:54:25',2,2,'用户名2','评论内容2','回复内容2'),(153,'2022-04-23 14:54:25',3,3,'用户名3','评论内容3','回复内容3'),(154,'2022-04-23 14:54:25',4,4,'用户名4','评论内容4','回复内容4'),(155,'2022-04-23 14:54:25',5,5,'用户名5','评论内容5','回复内容5'),(156,'2022-04-23 14:54:25',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusswentixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exampaper`
--

DROP TABLE IF EXISTS `exampaper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exampaper` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `name` varchar(200) NOT NULL COMMENT '在线练习名称',
  `time` int(11) NOT NULL COMMENT '练习时长(分钟)',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '在线练习状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='在线练习表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exampaper`
--

LOCK TABLES `exampaper` WRITE;
/*!40000 ALTER TABLE `exampaper` DISABLE KEYS */;
INSERT INTO `exampaper` VALUES (1,'2022-04-23 14:54:25','十万个为什么',60,1);
/*!40000 ALTER TABLE `exampaper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `examquestion`
--

DROP TABLE IF EXISTS `examquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examquestion` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `paperid` bigint(20) NOT NULL COMMENT '所属在线练习id（外键）',
  `papername` varchar(200) NOT NULL COMMENT '在线练习名称',
  `questionname` varchar(200) NOT NULL COMMENT '练习题库名称',
  `options` longtext COMMENT '选项，json字符串',
  `score` bigint(20) DEFAULT '0' COMMENT '分值',
  `answer` varchar(200) DEFAULT NULL COMMENT '正确答案',
  `analysis` longtext COMMENT '答案解析',
  `type` bigint(20) DEFAULT '0' COMMENT '练习题库类型，0：单选题 1：多选题 2：判断题 3：填空题（暂不考虑多项填空）',
  `sequence` bigint(20) DEFAULT '100' COMMENT '练习题库排序，值越大排越前面',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='练习题库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examquestion`
--

LOCK TABLES `examquestion` WRITE;
/*!40000 ALTER TABLE `examquestion` DISABLE KEYS */;
INSERT INTO `examquestion` VALUES (1,'2022-04-23 14:54:25',1,'十万个为什么','下面动物不属于昆虫的是（）。','[{\"text\":\"A.苍蝇\",\"code\":\"A\"},{\"text\":\"B.蜜蜂\",\"code\":\"B\"},{\"text\":\"C.蜂鸟\",\"code\":\"C\"}]',20,'C','蜂鸟',0,1),(2,'2022-04-23 14:54:25',1,'十万个为什么','油着火后可以用水扑灭。','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',20,'B','油着火后不可以用水扑灭',2,2),(3,'2022-04-23 14:54:25',1,'十万个为什么','地球是个球体，中间是（ ）。','[]',30,'赤道','赤道',3,3),(4,'2022-04-23 14:54:25',1,'十万个为什么','下面动物中会流汗的有（ ）。','[{\"text\":\"A.马\",\"code\":\"A\"},{\"text\":\"B.猫\",\"code\":\"B\"},{\"text\":\"C.狗\",\"code\":\"C\"}]',30,'A,B','狗不会流汗',1,4);
/*!40000 ALTER TABLE `examquestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `examrecord`
--

DROP TABLE IF EXISTS `examrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `examrecord` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `paperid` bigint(20) NOT NULL COMMENT '在线练习id（外键）',
  `papername` varchar(200) NOT NULL COMMENT '在线练习名称',
  `questionid` bigint(20) NOT NULL COMMENT '练习题库id（外键）',
  `questionname` varchar(200) NOT NULL COMMENT '练习题库名称',
  `options` longtext COMMENT '选项，json字符串',
  `score` bigint(20) DEFAULT '0' COMMENT '分值',
  `answer` varchar(200) DEFAULT NULL COMMENT '正确答案',
  `analysis` longtext COMMENT '答案解析',
  `myscore` bigint(20) NOT NULL DEFAULT '0' COMMENT '练习题库得分',
  `myanswer` varchar(200) DEFAULT NULL COMMENT '考生答案',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1650725905281 DEFAULT CHARSET=utf8 COMMENT='练习记录表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `examrecord`
--

LOCK TABLES `examrecord` WRITE;
/*!40000 ALTER TABLE `examrecord` DISABLE KEYS */;
INSERT INTO `examrecord` VALUES (1650725896570,'2022-04-23 14:58:16',11,'姓名1',1,'十万个为什么',1,'下面动物不属于昆虫的是（）。','[{\"text\":\"A.苍蝇\",\"code\":\"A\"},{\"text\":\"B.蜜蜂\",\"code\":\"B\"},{\"text\":\"C.蜂鸟\",\"code\":\"C\"}]',20,'C','蜂鸟',0,'A'),(1650725900502,'2022-04-23 14:58:20',11,'姓名1',1,'十万个为什么',2,'油着火后可以用水扑灭。','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',20,'B','油着火后不可以用水扑灭',0,'A'),(1650725902758,'2022-04-23 14:58:21',11,'姓名1',1,'十万个为什么',3,'地球是个球体，中间是（ ）。','[]',30,'赤道','赤道',0,'12'),(1650725905280,'2022-04-23 14:58:24',11,'姓名1',1,'十万个为什么',4,'下面动物中会流汗的有（ ）。','[{\"text\":\"A.马\",\"code\":\"A\"},{\"text\":\"B.猫\",\"code\":\"B\"},{\"text\":\"C.狗\",\"code\":\"C\"}]',30,'A,B','狗不会流汗',0,'B');
/*!40000 ALTER TABLE `examrecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fuxiziliao`
--

DROP TABLE IF EXISTS `fuxiziliao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fuxiziliao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ziliaobianhao` varchar(200) DEFAULT NULL COMMENT '资料编号',
  `ziliaomingcheng` varchar(200) NOT NULL COMMENT '资料名称',
  `ziliaoleixing` varchar(200) NOT NULL COMMENT '资料类型',
  `tupian` varchar(200) NOT NULL COMMENT '图片',
  `shipin` varchar(200) DEFAULT NULL COMMENT '视频',
  `ziliaofujian` varchar(200) DEFAULT NULL COMMENT '资料附件',
  `ziliaojieshao` longtext COMMENT '资料介绍',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `ziliaobianhao` (`ziliaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='复习资料';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fuxiziliao`
--

LOCK TABLES `fuxiziliao` WRITE;
/*!40000 ALTER TABLE `fuxiziliao` DISABLE KEYS */;
INSERT INTO `fuxiziliao` VALUES (71,'2022-04-23 14:54:25','1111111111','资料名称1','资料类型1','upload/fuxiziliao_tupian1.jpg','','','资料介绍1','2022-04-23 22:54:25'),(72,'2022-04-23 14:54:25','2222222222','资料名称2','资料类型2','upload/fuxiziliao_tupian2.jpg','','','资料介绍2','2022-04-23 22:54:25'),(73,'2022-04-23 14:54:25','3333333333','资料名称3','资料类型3','upload/fuxiziliao_tupian3.jpg','','','资料介绍3','2022-04-23 22:54:25'),(74,'2022-04-23 14:54:25','4444444444','资料名称4','资料类型4','upload/fuxiziliao_tupian4.jpg','','','资料介绍4','2022-04-23 22:54:25'),(75,'2022-04-23 14:54:25','5555555555','资料名称5','资料类型5','upload/fuxiziliao_tupian5.jpg','','','资料介绍5','2022-04-23 22:54:25'),(76,'2022-04-23 14:54:25','6666666666','资料名称6','资料类型6','upload/fuxiziliao_tupian6.jpg','','','资料介绍6','2022-04-23 22:54:25');
/*!40000 ALTER TABLE `fuxiziliao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshi`
--

DROP TABLE IF EXISTS `jiaoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `jiangjiejiage` float DEFAULT NULL COMMENT '讲解价格',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='教师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshi`
--

LOCK TABLES `jiaoshi` WRITE;
/*!40000 ALTER TABLE `jiaoshi` DISABLE KEYS */;
INSERT INTO `jiaoshi` VALUES (21,'2022-04-23 14:54:25','1','1','教师姓名1','男','upload/jiaoshi_touxiang1.jpg','年龄1',1,'学院1','13823888881','773890001@qq.com'),(22,'2022-04-23 14:54:25','工号2','123456','教师姓名2','男','upload/jiaoshi_touxiang2.jpg','年龄2',2,'学院2','13823888882','773890002@qq.com'),(23,'2022-04-23 14:54:25','工号3','123456','教师姓名3','男','upload/jiaoshi_touxiang3.jpg','年龄3',3,'学院3','13823888883','773890003@qq.com'),(24,'2022-04-23 14:54:25','工号4','123456','教师姓名4','男','upload/jiaoshi_touxiang4.jpg','年龄4',4,'学院4','13823888884','773890004@qq.com'),(25,'2022-04-23 14:54:25','工号5','123456','教师姓名5','男','upload/jiaoshi_touxiang5.jpg','年龄5',5,'学院5','13823888885','773890005@qq.com'),(26,'2022-04-23 14:54:25','工号6','123456','教师姓名6','男','upload/jiaoshi_touxiang6.jpg','年龄6',6,'学院6','13823888886','773890006@qq.com');
/*!40000 ALTER TABLE `jiaoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoxueshipin`
--

DROP TABLE IF EXISTS `jiaoxueshipin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoxueshipin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shipinleixing` varchar(200) NOT NULL COMMENT '视频类型',
  `shipinmingcheng` varchar(200) NOT NULL COMMENT '视频名称',
  `fengmiantu` varchar(200) DEFAULT NULL COMMENT '封面图',
  `shipin` varchar(200) DEFAULT NULL COMMENT '视频',
  `shipinjieshao` longtext COMMENT '视频介绍',
  `faburiqi` datetime DEFAULT NULL COMMENT '发布日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='教学视频';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoxueshipin`
--

LOCK TABLES `jiaoxueshipin` WRITE;
/*!40000 ALTER TABLE `jiaoxueshipin` DISABLE KEYS */;
INSERT INTO `jiaoxueshipin` VALUES (81,'2022-04-23 14:54:25','视频类型1','视频名称1','upload/jiaoxueshipin_fengmiantu1.jpg','','视频介绍1','2022-04-23 22:54:25'),(82,'2022-04-23 14:54:25','视频类型2','视频名称2','upload/jiaoxueshipin_fengmiantu2.jpg','','视频介绍2','2022-04-23 22:54:25'),(83,'2022-04-23 14:54:25','视频类型3','视频名称3','upload/jiaoxueshipin_fengmiantu3.jpg','','视频介绍3','2022-04-23 22:54:25'),(84,'2022-04-23 14:54:25','视频类型4','视频名称4','upload/jiaoxueshipin_fengmiantu4.jpg','','视频介绍4','2022-04-23 22:54:25'),(85,'2022-04-23 14:54:25','视频类型5','视频名称5','upload/jiaoxueshipin_fengmiantu5.jpg','','视频介绍5','2022-04-23 22:54:25'),(86,'2022-04-23 14:54:25','视频类型6','视频名称6','upload/jiaoxueshipin_fengmiantu6.jpg','','视频介绍6','2022-04-23 22:54:25');
/*!40000 ALTER TABLE `jiaoxueshipin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaozixinxi`
--

DROP TABLE IF EXISTS `jiaozixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaozixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kaoshimingcheng` varchar(200) NOT NULL COMMENT '考试名称',
  `jibie` varchar(200) DEFAULT NULL COMMENT '级别',
  `kaoshikemu` varchar(200) NOT NULL COMMENT '考试科目',
  `zhengshumingcheng` varchar(200) DEFAULT NULL COMMENT '证书名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `baokaoshijian` varchar(200) DEFAULT NULL COMMENT '报考时间',
  `kaoshishijian` varchar(200) DEFAULT NULL COMMENT '考试时间',
  `diqu` varchar(200) DEFAULT NULL COMMENT '地区',
  `kaoshididian` varchar(200) DEFAULT NULL COMMENT '考试地点',
  `kaoshidagang` longtext COMMENT '考试大纲',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='教资信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaozixinxi`
--

LOCK TABLES `jiaozixinxi` WRITE;
/*!40000 ALTER TABLE `jiaozixinxi` DISABLE KEYS */;
INSERT INTO `jiaozixinxi` VALUES (51,'2022-04-23 14:54:25','考试名称1','级别1','考试科目1','证书名称1','upload/jiaozixinxi_tupian1.jpg','报考时间1','考试时间1','地区1','考试地点1','考试大纲1'),(52,'2022-04-23 14:54:25','考试名称2','级别2','考试科目2','证书名称2','upload/jiaozixinxi_tupian2.jpg','报考时间2','考试时间2','地区2','考试地点2','考试大纲2'),(53,'2022-04-23 14:54:25','考试名称3','级别3','考试科目3','证书名称3','upload/jiaozixinxi_tupian3.jpg','报考时间3','考试时间3','地区3','考试地点3','考试大纲3'),(54,'2022-04-23 14:54:25','考试名称4','级别4','考试科目4','证书名称4','upload/jiaozixinxi_tupian4.jpg','报考时间4','考试时间4','地区4','考试地点4','考试大纲4'),(55,'2022-04-23 14:54:25','考试名称5','级别5','考试科目5','证书名称5','upload/jiaozixinxi_tupian5.jpg','报考时间5','考试时间5','地区5','考试地点5','考试大纲5'),(56,'2022-04-23 14:54:25','考试名称6','级别6','考试科目6','证书名称6','upload/jiaozixinxi_tupian6.jpg','报考时间6','考试时间6','地区6','考试地点6','考试大纲6');
/*!40000 ALTER TABLE `jiaozixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','a7aseunw8zb16pslgu1692587zlavam3','2022-04-23 14:55:14','2022-04-23 15:55:26'),(2,21,'1','jiaoshi','管理员','5fngvxxvonz5dbr4vkm1r6d731slyge4','2022-04-23 14:55:31','2022-04-23 15:55:49'),(3,11,'1','xuesheng','学生','p50ni1lq3s423lxfsmrhuzq06d5ik05a','2022-04-23 14:55:36','2022-04-23 15:57:55');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-04-23 14:54:25');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wentixinxi`
--

DROP TABLE IF EXISTS `wentixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wentixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `leixing` varchar(200) NOT NULL COMMENT '类型',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `wentimiaoshu` longtext COMMENT '问题描述',
  `wangpanlianjie` varchar(200) DEFAULT NULL COMMENT '网盘链接',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='问题信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wentixinxi`
--

LOCK TABLES `wentixinxi` WRITE;
/*!40000 ALTER TABLE `wentixinxi` DISABLE KEYS */;
INSERT INTO `wentixinxi` VALUES (41,'2022-04-23 14:54:25','标题1','类型1','upload/wentixinxi_tupian1.jpg','问题描述1','网盘链接1','2022-04-23 22:54:25',1,1,1),(42,'2022-04-23 14:54:25','标题2','类型2','upload/wentixinxi_tupian2.jpg','问题描述2','网盘链接2','2022-04-23 22:54:25',2,2,2),(43,'2022-04-23 14:54:25','标题3','类型3','upload/wentixinxi_tupian3.jpg','问题描述3','网盘链接3','2022-04-23 22:54:25',3,3,3),(44,'2022-04-23 14:54:25','标题4','类型4','upload/wentixinxi_tupian4.jpg','问题描述4','网盘链接4','2022-04-23 22:54:25',4,4,4),(45,'2022-04-23 14:54:25','标题5','类型5','upload/wentixinxi_tupian5.jpg','问题描述5','网盘链接5','2022-04-23 22:54:25',5,5,5),(46,'2022-04-23 14:54:25','标题6','类型6','upload/wentixinxi_tupian6.jpg','问题描述6','网盘链接6','2022-04-23 22:54:25',6,6,6);
/*!40000 ALTER TABLE `wentixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2022-04-23 14:54:25','1','1','姓名1','男','upload/xuesheng_touxiang1.jpg','学院1','773890001@qq.com','13823888881'),(12,'2022-04-23 14:54:25','学号2','123456','姓名2','男','upload/xuesheng_touxiang2.jpg','学院2','773890002@qq.com','13823888882'),(13,'2022-04-23 14:54:25','学号3','123456','姓名3','男','upload/xuesheng_touxiang3.jpg','学院3','773890003@qq.com','13823888883'),(14,'2022-04-23 14:54:25','学号4','123456','姓名4','男','upload/xuesheng_touxiang4.jpg','学院4','773890004@qq.com','13823888884'),(15,'2022-04-23 14:54:25','学号5','123456','姓名5','男','upload/xuesheng_touxiang5.jpg','学院5','773890005@qq.com','13823888885'),(16,'2022-04-23 14:54:25','学号6','123456','姓名6','男','upload/xuesheng_touxiang6.jpg','学院6','773890006@qq.com','13823888886');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueyuanmingcheng`
--

DROP TABLE IF EXISTS `xueyuanmingcheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueyuanmingcheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='学院名称';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueyuanmingcheng`
--

LOCK TABLES `xueyuanmingcheng` WRITE;
/*!40000 ALTER TABLE `xueyuanmingcheng` DISABLE KEYS */;
INSERT INTO `xueyuanmingcheng` VALUES (31,'2022-04-23 14:54:25','学院1'),(32,'2022-04-23 14:54:25','学院2'),(33,'2022-04-23 14:54:25','学院3'),(34,'2022-04-23 14:54:25','学院4'),(35,'2022-04-23 14:54:25','学院5'),(36,'2022-04-23 14:54:25','学院6');
/*!40000 ALTER TABLE `xueyuanmingcheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ziliaoleixing`
--

DROP TABLE IF EXISTS `ziliaoleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ziliaoleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ziliaoleixing` varchar(200) NOT NULL COMMENT '资料类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='资料类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ziliaoleixing`
--

LOCK TABLES `ziliaoleixing` WRITE;
/*!40000 ALTER TABLE `ziliaoleixing` DISABLE KEYS */;
INSERT INTO `ziliaoleixing` VALUES (61,'2022-04-23 14:54:25','资料类型1'),(62,'2022-04-23 14:54:25','资料类型2'),(63,'2022-04-23 14:54:25','资料类型3'),(64,'2022-04-23 14:54:25','资料类型4'),(65,'2022-04-23 14:54:25','资料类型5'),(66,'2022-04-23 14:54:25','资料类型6');
/*!40000 ALTER TABLE `ziliaoleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zizhimianshi`
--

DROP TABLE IF EXISTS `zizhimianshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zizhimianshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `jiangjiejiage` float DEFAULT NULL COMMENT '讲解价格',
  `shipin` varchar(200) NOT NULL COMMENT '视频',
  `fujian` varchar(200) NOT NULL COMMENT '附件',
  `dabianwenti` longtext COMMENT '答辩问题',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='资质面试';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zizhimianshi`
--

LOCK TABLES `zizhimianshi` WRITE;
/*!40000 ALTER TABLE `zizhimianshi` DISABLE KEYS */;
INSERT INTO `zizhimianshi` VALUES (91,'2022-04-23 14:54:25','标题1','工号1','教师姓名1','学院1',1,'','','答辩问题1','2022-04-23 22:54:25','学号1','姓名1','未支付'),(92,'2022-04-23 14:54:25','标题2','工号2','教师姓名2','学院2',2,'','','答辩问题2','2022-04-23 22:54:25','学号2','姓名2','未支付'),(93,'2022-04-23 14:54:25','标题3','工号3','教师姓名3','学院3',3,'','','答辩问题3','2022-04-23 22:54:25','学号3','姓名3','未支付'),(94,'2022-04-23 14:54:25','标题4','工号4','教师姓名4','学院4',4,'','','答辩问题4','2022-04-23 22:54:25','学号4','姓名4','未支付'),(95,'2022-04-23 14:54:25','标题5','工号5','教师姓名5','学院5',5,'','','答辩问题5','2022-04-23 22:54:25','学号5','姓名5','未支付'),(96,'2022-04-23 14:54:25','标题6','工号6','教师姓名6','学院6',6,'','','答辩问题6','2022-04-23 22:54:25','学号6','姓名6','未支付');
/*!40000 ALTER TABLE `zizhimianshi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-24 14:55:15
