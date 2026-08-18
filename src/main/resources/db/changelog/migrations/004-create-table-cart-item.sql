--Создание таблицы для CartItem
CREATE TABLE cart_items (
    id UUID PRIMARY KEY,
    cart_id UUID NOT NULL,
    bike_id UUID NOT NULL,
    quantity INTEGER NOT NULL CHECK (quantity >= 1),

    CONSTRAINT fk_cart_item_cart
        FOREIGN KEY (cart_id) REFERENCES carts (id),

    CONSTRAINT fk_cart_item_bike
        FOREIGN KEY (bike_id) REFERENCES bikes (id)
);