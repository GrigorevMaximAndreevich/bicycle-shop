--Создание таблицы для Order
CREATE TABLE orders (
    id UUID PRIMARY KEY,
    status VARCHAR(255) NOT NULL,
    total_price DECIMAL(15, 2) NOT NULL CHECK (total_price >= 0),
    user_id UUID NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL,
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL,

    CONSTRAINT fk_order_user
        FOREIGN KEY (user_id) REFERENCES users (id)
);