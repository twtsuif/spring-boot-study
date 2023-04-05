# 日志记录



SpringBoot的内部日志使用Commons Logging

支持常用的日志库 java.util.Logging、Log4J、Log4J2、Logback



## slf4j

Simple Logging Facade for Java

日志框架的规范，一套接口。



## Implement

#### Log4J

apache开源

控制日志输出位置、格式等



#### logback

log4j同作者，更好特性，用于取代log4j



#### Log4J2

https://logging.apache.org/log4j/2.x/

logback的改进

丢失数据少、disruptor技术、性能高、减少死锁



## Use

日志等级

trace、debug、info、warn、error、fatal、off


<br>
SpringBoot配置文件中

logging.file.name可以指定保存的文件名 默认项目同级

logging.config指定配置文件


<br>
使用log4j2

springboot规则

只需要在resource目录下放置log4j2.xml配置即可


<br>
配合lombok @Slf4j注解 log日志

