create database utvonalak;

use utvonalak;

create table celok(
    id int not null primary key auto_increment,
    place varchar(50),
    finish varchar(50),
);

grant all privileges
on utvonalak.*
to utvonalak@localhost
identified by 'titok';
