use product_inventory;

drop table tbl_inv;
create table tbl_inv (
prod_id int auto_increment not null primary key,
prod_name varchar(100),
prod_price decimal(8,2),
prod_qty int
)

select * from tbl_inv;