insert into users(username,password,enabled)values('user','pass',true);
insert into users(username,password,enabled)values('admin','pass',true);


insert into authorities(username,authority)values('user','R0LE_USER'); 
insert into authorities(username,authority)values('admin','R0LE_ADMIN');