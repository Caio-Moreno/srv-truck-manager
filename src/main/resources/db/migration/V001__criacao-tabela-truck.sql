create table truck (
  id bigint not null auto_increment,
  description varchar(100) null,
  plate varchar(7) not null,

  primary key (id)
) engine=InnoDB default charset=utf8;