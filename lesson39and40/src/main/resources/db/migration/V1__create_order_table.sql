create table orders (
    id uuid primary key ,
    name varchar,
    count int,
    cost int,
    is_deleted boolean,
    is_delivery boolean
)