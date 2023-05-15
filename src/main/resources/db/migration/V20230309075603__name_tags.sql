create table name_tags
(
    address varchar      not null,
    tag     varchar(255) not null,
    chain   varchar(20)  not null,
    primary key (address, chain)
);