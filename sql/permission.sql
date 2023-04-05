create table spring_security.permission
(
    id   bigint auto_increment
        primary key,
    name varchar(64) default 'NULL' not null comment '权限'
)
    comment '权限表';

