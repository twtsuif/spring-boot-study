# Redis Use



Java的Redis客户端

Lettuce、Jedis、Redission、......



spring-data-redis包含Lettuce和Jedis，默认使用Lettuce



Lettuce

https://lettuce.io/

线程安全的Redis客户端，提供同步、异步和响应式API，支持单机、订阅发布、哨兵和集群。

Netty通信层



Jedis

线程不安全，使用线程池，完成操作或异常归还







## 使用记录

RedisAutoConfiguration.class

springboot本身就自动注入了一个RedisTemplate

默认使用localhost:6379



调用接口前

没有进行连接

