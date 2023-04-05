# Redis



## 简介

https://redis.io/



## 模块

<img src="https://cdn.jsdelivr.net/gh/twtsuif/picture/twtsuif2023-03-27/e9e2bf7962375902e7121dff4d1ffc3e--1168--image-20230327190132655.png" alt="image-20230327190132655" style="zoom: 80%;" />



## 数据结构

<img src="https://cdn.jsdelivr.net/gh/twtsuif/picture/twtsuif2023-04-04/bb867280c702264e3ddc287fa6e85161--bc83--image-20230404142501958.png" alt="image-20230404142501958" style="zoom:67%;" />

List、Hash、Set、Sorted Set称为集合类型 一个键对应一个集合的数据

有两种实现结构



渐进式rehash

使用两个全局Hash表，开始时只使用Hash表1，数据增多时Hash表2开始分配空间。

每处理一个请求，Hash表1索引位置的所有entries拷贝到Hash表2



## IO模型

同时连接多个客户端，单线程执行。

持久化、异步删除、集群数据同步等操作由额外线程处理。



socket 的listen、accept、recv关键阻塞点  改为非阻塞模式



多路复用

一个线程处理多个IO流，select/epoll技术。

内核同时存在多个监听和已连接socket

<img src="https://cdn.jsdelivr.net/gh/twtsuif/picture/twtsuif2023-04-04/3fe375f3f551ca74016b3bf9442d08ff--0c5c--image-20230404143814954.png" alt="image-20230404143814954" style="zoom:67%;" />





## AOF

Append Only File



Redis通常作为缓存，若服务器宕机，内存数据会完全丢失。

为了避免从后端数据库中恢复，所以使用AOF日志。



写后日志 记录每一条指令 在主线程中执行

优点：避免检查开销、不会阻塞

风险：对下一操作阻塞

解决：控制写回磁盘的时机



**写回策略**

appendfsync配置项

- Always 同步写回
- Everysec 每秒写回
- No 由操作系统决定



**重写机制**

解决AOF文件过大

重写时根据现状创建一个新AOF文件

读取所有的k-v 每一个k-v用一条命令记录



**写回磁盘**

子进程bgrewriteaof

fork内存拷贝





## RDB

Redis DataBase内存快照



**全量快照**

save主线程 

bgsave创建子进程

COW机制

注意：fork命令会阻塞



**增量快照**



Redis4混合使用AOF和RDB

两次快照之间以AOF记录
