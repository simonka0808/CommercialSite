create table coat(
coat_id varchar(36) not null primary key,
coat_quantity int(10) not null,
coat_brand varchar(100) not null,
coat_model varchar(100) not null,
description varchar(200) not null,
in_stock boolean not null,
size int(5) not null,
colour varchar(100) not null
)
