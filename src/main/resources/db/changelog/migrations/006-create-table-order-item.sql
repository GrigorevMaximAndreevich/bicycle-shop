--Создание таблицы для OrderItem
CREATE TABLE order_items (
    id UUID PRIMARY KEY,
    order_id UUID NOT NULL,
    bike_id UUID NOT NULL,
    quantity INTEGER NOT NULL CHECK (quantity >= 1),
    price DECIMAL(15, 2) NOT NULL CHECK (price >= 0),

    CONSTRAINT fk_order_item_order
        FOREIGN KEY (order_id) REFERENCES orders (id),

    CONSTRAINT fk_order_item_bike
        FOREIGN KEY (bike_id) REFERENCES bikes (id)
);