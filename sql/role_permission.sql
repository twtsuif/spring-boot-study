create table spring_security.role_permission
(
    role_id       bigint auto_increment comment '角色ID',
    permission_id bigint default 0 not null comment '菜单id',
    primary key (role_id, permission_id)
);

