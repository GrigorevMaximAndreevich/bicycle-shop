--Добавление колонки cart_id в таблицу users
ALTER TABLE users
ADD COLUMN cart_id UUID UNIQUE;

ALTER TABLE users
ADD CONSTRAINT fk_user_cart
    FOREIGN KEY (cart_id) REFERENCES carts (id);