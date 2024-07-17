drop table if exists pupils;
create table pupils(
                         id uuid primary key,
                         name varchar,
                         last_name varchar,
                         sex varchar,
                         birth_date date,
                         class_number int,
                         address varchar
)
