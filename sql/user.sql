create table spring_security.user
(
    id       bigint auto_increment comment '主键'
        primary key,
    username varchar(64) default 'NULL' not null comment '用户名',
    password varchar(64) default 'NULL' not null comment '密码'
)
    comment '用户表';

