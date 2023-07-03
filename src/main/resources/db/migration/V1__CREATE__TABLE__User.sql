CREATE TABLE Users(
  id serial primary key,
  name varchar(100) not null,
  age integer not null,
  created_at timestamp NOT NULL,
  modified_at timestamp NOT NULL
)