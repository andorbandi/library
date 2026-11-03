create table books(
  id integer not null primary key autoincrement,
  title varchar(100),
  author varchar(100),
  year integer,
  pages integer
);