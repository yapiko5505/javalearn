drop table staff if exists;

create table staff (
    id int auto_increment primary key,
    login varchar(100) not null unique,
    password varchar(100) not null
);

insert into staff values(null, 'mimi', 'staff1');
insert into staff values(null, 'yuyu', 'staff2');
insert into staff values(null, 'kaka', 'staff3');