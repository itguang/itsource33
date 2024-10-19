![haibao.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192204865.png)



# 项目介绍

在线小说阅读系统是一种基于Web的应用程序，旨在为用户提供便捷的小说阅读体验。这种系统通常包括前端用户界面和后端管理功能，支持用户注册、登录、搜索、阅读、收藏、评论等功能。其中用户也是创作者,创作者可以注册用户后,进行小说创作,发布到系统,其他用户可以查看小说

**本系统虽然页面简介不花哨, 但是功能还是比较丰富的, 适合初学者二次开发学习使用**


**关键词**：小说系统；小说阅读;  Spring Boot 框架；Java；MySQL数据库;  VUE;  前后端分离

**技术栈:**

* 后端:  SpringBoot +Mybatis
* 数据库 : MySQL 8
* 前端:  VUE + ElementUI

**开发环境依赖：**
* MySQL 8 数据库
* JDK1.8
* Maven 3
* IDEA
* Node 14

## 一 业务介绍

### 1.功能模块
- 登录/注册: 点击注册用户,注册成功即可登录
  ![Clip_2024-10-19_21-59-08.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192159002.png)

### 2.首页

* 登录成功后进入首页:
  ![首页.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192205296.png)

* 排行榜功能
  ![排行榜.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192205526.png)

### 3.点击小说进行阅读

![阅读小说.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192205042.png)
* 还可以进行评论
  ![评论.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192206343.png)
* 点击章节,阅读小说,可以点击上一章下一章进行切换:
  ![阅读.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192206123.png)


### 3.小说创作:

- 点击右上角,进入我的主页,可以看到我创作的小说
  ![个人中心.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192209669.png)

可以看到我看的小说, 作品数量, 收藏数量, 推荐数量,  评论,关注, 和粉丝

- 个人资料修改:

![个人资料.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192212076.png)

### 作品管理

作品管理页面可以进行小说创作:

![作品管理.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192213397.png)


可以新增小说:名称, 封面, 小说简介, 和章节等
![新增小说.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192214195.png)

### 小说管理后台:

该系统还有一个小说管理员后台, 管理员登录后可以进行小说分类的修改和新增,还可以对所有小说进行修改

![Clip_2024-10-19_22-15-52.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192216440.png)


- 后台新增小说
  ![后台-新增小说.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192220175.png)


- 后台查询所有小说:
  ![后台-查询小说.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192220330.png)


- 后台对小说进行编辑:
  ![后台-小说编辑.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192220930.png)
  ![Clip_2024-10-19_22-21-22.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192221043.png)

## 二 技术介绍
### 1.技术栈

* 后端:  SpringBoot +JPA
* 数据库 : MySQL 8
* 前端:  VUE + ElementUI

**开发环境依赖：**
* MySQL 8 数据库
* JDK1.8
* Maven 3
* IDEA
* Node 14

### 2.代码介绍
> ![代码.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192226629.png)


### 三 Quick Start

### 1. 环境准备
* MYSQL 8
* JDK1.8
* Maven 3
* IDEA
* Node 14 （如果不需要对配置后台二次开发,不需要安装)

> 以上环境需要准备好, 在自己的本地搭建好,方可进行下面步骤
### 2. 下载源码



**文章末尾获取下载方式。**

### 3. 后端部署

- Step1: 下载源码
- Step2: IDEA 打开项目
- Step3: 安装 Maven 依赖
- Step4: 配置检查
> 数据库配置: 找到配置文件 `src/main/resources/application.yml` 修改为你本地的数据库配置。如
```yml
spring.datasource.url=jdbc:mysql://localhost:3306/itsource33??useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false&serverTimezone=UTC&createDatabaseIfNotExist=true  
spring.datasource.username=root  
spring.datasource.password=root
```

注意：**不需要手动创建数据库和初始化表结构，直接运行项目，会自动创建数据库，初始化SQL语句**
- Step4: 启动后端项目
> Idea 运行后端项目,看到以下信息,表示运行成功
> ![Clip_2024-10-19_22-31-50.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192232668.png)



### 4. 前端部署

分别进入 `novel_vue_client-master` 和 `novel_vue_server-master` 目录

打开终端, 执行下面命令,运行前端项目:
- Step1: 安装npm依赖
>  npm install --registry=http://registry.npmmirror.com
- Step2: 启动前端项目
> npm run serve
> 看到如下信息表示部署成功
> ![Clip_2024-10-19_22-37-26.png](https://itguang.oss-cn-beijing.aliyuncs.com/202410192237524.png)
浏览器点击任何一个即可打开

>登录:  输入账号密码 itsource itsource 即可登录

## 下载源码

---
---

关注微信公众号: **ITSource 每日分享**,回复 `0033` 获取源码

---
---

**关注微信公众号 【ITSource每日分享】,免费获取一万个IT资源：项目源码，软件工具，面试面经，学习视频 应有尽有！！！!**

![关注 微信公众号 ! 获取更多学习资源呀](https://itguang.oss-cn-beijing.aliyuncs.com/订阅号.jpeg)

**更多资源推荐:**
- [ITSource 分享 第10期【个人博客系统】](https://mp.weixin.qq.com/s/j5O3oi0Yc28v8ROomyR9_g)
- [ITSource 分享 第11期【简单的教务管理系统】](https://mp.weixin.qq.com/s/5AEgWPW1v0Y5Z77LGoMm1Q)
- [ITSource分享第12期【驾校理论课考试系统】springboot+vue](https://mp.weixin.qq.com/s/YpJXaGC5338ydeLCMBiLtg)
- [ITSource分享第13期【班级信息管理系统】](https://mp.weixin.qq.com/s/7FYxlXoKrb5r-nckcPlAWw)
- [ITSource分享第14期【电影院售票管理系统】springboot+vue](https://mp.weixin.qq.com/s/oRU1VtvB68Z1qJbuGIGrGw)
- [ITSource分享第15期【图书管理系统】](https://mp.weixin.qq.com/s/rgixOXuJyJyZlL8Ny0AE8A)
- [ITSource分享第16期【连锁门店管理系统】springboot+vue](https://mp.weixin.qq.com/s/5aOJ9EHIqcVqtYWdKn3ONw)
- [ITSource分享第17期【宠物管理系统(带论文)springboot+vue】](https://mp.weixin.qq.com/s/S_mDclr4BKOzGZHG6etnoA)
- [ITSource分享第18期【二手交易(电商,商城)系统(带论文和PPT)springboot+vue】](https://mp.weixin.qq.com/s/_LlrbVBq_6nhGp3BY7F38A)
- [ITSource分享第19期【学生选课管理系统springboot+vue】](https://mp.weixin.qq.com/s/b8qTt-XT9SZNzQTKOJQqSw)
- [ITSource分享第20期-Java SpringBoot 微信点餐系统视频](https://mp.weixin.qq.com/s/xqmR6R96yFSZeQOmkCQcmQ)
- [ITSource分享第21期【房屋租赁管理系统】springboot+vue](https://mp.weixin.qq.com/s/7F7EhKv_CG81LEDS1XEJHw)
- [# ITSource分享第22期【景区旅游管理系统】springboot](https://mp.weixin.qq.com/s/ygvHpQeg_frDWD2f1F-R_A)
- [ ITSource分享第23期【图书管理系统】springboot+layui前后端分离](https://mp.weixin.qq.com/s/b1-prJSZdQcEBy0M6JOnDg)
- [第24期【在线拍卖系统】springboot+vue前后端分离+论文+PPT](https://mp.weixin.qq.com/s/VGKHG_ZPER3VA5rTdbXFiQ)
- [第25期【汽车票网上预定系统】springboot+vue前后端分离+论文](https://mp.weixin.qq.com/s/CB6xxXJkvK1GAhAVFUgHZw)
- [# 第26期【在线旅游购买网站系统】springboot+vue前后端分离+论文+PPT](https://mp.weixin.qq.com/s/BfUtXw77GQzXgPQfGyubmg)
- [# 第27期【校园网上租赁交易系统设计与实现】springboot+vue前后端分离+论文+部署文档](https://mp.weixin.qq.com/s/FvWVPlmOkuULLQ9seQHcpQ)
- [# ITSource分享第28期【网上宠物用品交易系统设计与实现】springboot+vue前后端分离+论文+部署文档](https://mp.weixin.qq.com/s/dMLwreWgZFsY56VrQv_dzw)
- [# ITSource分享第29期【在线文档管理系统的设计与实现】springboot+vue前后端分离+论文+PPT+部署文档](https://mp.weixin.qq.com/s/K1ON3lHfR_1K3iKgC2yhMw)


