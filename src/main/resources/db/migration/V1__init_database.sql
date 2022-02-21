drop table if exists workout;
drop table if exists hibernate_sequence;

create table run_workout (
                      id bigint not null,
                      title varchar(255),
                      distance decimal(6,2),
                      time varchar(255),
                      primary key (id)
) engine=InnoDB;

create table hibernate_sequence (
    next_val bigint
) engine=InnoDB;

insert into hibernate_sequence values ( 1 );