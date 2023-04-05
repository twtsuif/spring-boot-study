create table spring_security.user_role
(
    user_id bigint auto_increment comment '用户id',
    role_id bigint default 0 not null comment '角色id',
    primary key (user_id, role_id)
);

