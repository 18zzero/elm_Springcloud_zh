
基于 **Spring Cloud 微服务架构** 的外卖点餐系统  
前端采用 Vue，后端采用 Spring Cloud + Spring Boot，支持服务注册与发现、配置中心、API网关、分布式业务模块等。

---

## Springcloud_zenghao_elm项目简介

本项目为仿饿了么外卖点餐系统，采用前后端分离与微服务架构设计，涵盖用户注册登录、商家与菜品浏览、购物车、下单、支付、地址管理、订单管理等完整业务流程。  
适合微服务学习、毕业设计、企业级项目实践。

---

## 技术栈

- 前端：Vue.js
- 后端：Spring Boot、Spring Cloud（Eureka、Gateway、Config）、MyBatis
- 数据库：MySQL
- 其他：Maven

---

## 项目架构
前端（elmweb） <---> API网关（gateway_server_14000） <---> 各业务微服务
|
-------------------------------------------------
| 用户 | 商家 | 菜品 | 购物车 | 地址 | 订单 | ...
-------------------------------------------------
| | |
[注册中心] [配置中心] [数据库
---

## 主要功能

- **用户端**：注册/登录、浏览商家/菜品、购物车、下单、支付、地址管理、订单管理
- **系统支撑**：服务注册与发现、统一网关、动态配置、权限校验、限流熔断、跨域处理

---

## 目录结构
springcloud_elm-main/
├── business_server_10300/ # 商家服务
├── business_server_10301/ # 商家服务（副本/分片）
├── cart_server_10400/ # 购物车服务
├── cart_server_10401/ # 购物车服务（副本/分片）
├── config_server_15000/ # 配置中心
├── config_server_15001/ # 配置中心（副本/高可用）
├── deliveryaddress_server_10500/ # 配送地址服务
├── eureka_server_8761/ # 注册中心
├── eureka_server_8762/ # 注册中心（副本/高可用）
├── food_server_10200/ # 菜品服务
├── food_server_10201/ # 菜品服务（副本/分片）
├── gateway_server_14000/ # API网关
├── orders_server_10600/ # 订单服务
├── orders_server_10601/ # 订单服务（副本/分片）
├── user_server_10100/ # 用户服务
├── elmweb/ # 前端Vue项目
├── elm.sql # 数据库脚本
└── pom.xml # 父工程Maven配置



---

## 快速启动

1. **准备环境**
   - JDK 8+
   - Maven 3.6+
   - MySQL 5.7+/8.0
   - Node.js（前端）

2. **初始化数据库**
   - 创建数据库，导入 `elm.sql`

3. **启动注册中心、配置中心**
   - 先启动 `eureka_server_8761`、`eureka_server_8762`
   - 再启动 `config_server_15000`、`config_server_15001`

4. **启动各业务微服务**
   - 启动 `user_server_10100`、`business_server_10300`、`food_server_10200` 等

5. **启动API网关**
   - 启动 `gateway_server_14000`

6. **启动前端项目**
   - 进入 `elmweb` 目录，`npm install`，`npm run serve`

7. **访问系统**
   - 浏览器访问 `http://localhost:8080`（或前端实际端口）

---

## 说明

- 所有服务均可独立扩展、弹性部署，支持高可用。
- 详细接口文档、二次开发说明请见各微服务模块内的README或注释。
- 如需体验完整功能，建议所有服务均启动。

---

## License

本项目遵循 MIT License，欢迎学习和二次开发。





