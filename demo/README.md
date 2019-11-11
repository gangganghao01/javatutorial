# 项目简介
Java Unit Test Demo，简要展示了常见的几种单元测试的编写方法，以及Jacoco覆盖率统计方法。

## 工程目录结构
```
├── core
│   ├── pom.xml
│   └── src
│       ├── main
│       └── test
├── persistence
│   ├── pom.xml
│   └── src
│       ├── main
│       └── test
├── pojo
│   ├── pom.xml
│   └── src
│       ├── main
│       └── test
├── cov.gangganghao.com
│   └── pom.xml
├── pom.xml
└── target
    └── site
        └── jacoco
```

## 快速开始
* > 下载代码后执行命令：mvn verify -Pjacoco，即可执行单测并统计覆盖率
* > target/site/jacoco目录下可查看详细覆盖率统计

## 单元测试说明
### BigDecimalUtilTest
* > 简单介绍了单元测试的常见写法，包括正常输入、异常输入、分支、忽略以及Junit执行的一些常见配置
### HttpServiceTest、ModuleMapperTest
* > 简单介绍了Mock框架-Mockito，Mock的方式进行针对网络接口、数据库交互的一种单元测试方法，主要介绍了无返回值和有返回值两种情况的Mock
### Jacoco
* > Jacoco是一个开源的覆盖率工具（官网地址：http://www.jacoco.org/jacoco/），它针对的开发语言是java，其使用方法很灵活，可以嵌入到Ant、Maven中，并提供了EclEmma Eclipse插件，可以使用其JavaAgent技术监控Java程序等等。很多第三方的工具提供了对JaCoCo的集成，如sonar、Jenkins等。 


## 模块说明
### core
* > 主服务模块，主要包含一个工具类BigDecimalUtil和Http请求接口HttpService
### persistence
* > 数据持久层模块，主要包含ModuleMapper
### pojo
* > pojo，主要包含接口响应ResponseVO
### cov.gangganghao.com
* > Jacoco覆盖率统计模块


