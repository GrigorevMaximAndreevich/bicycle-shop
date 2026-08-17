--Создание таблицы для Bike
CREATE TABLE bikes (
    id UUID PRIMARY KEY,
    brand VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    price DECIMAL(15, 2) NOT NULL CHECK (price >= 0),
    size VARCHAR(255) NOT NULL,
    release_year INTEGER NOT NULL,
    description VARCHAR(1000) NOT NULL,
    quantity INTEGER NOT NULL CHECK (quantity >= 0),
    created_at TIMESTAMP WITH TIME ZONE NOT NULL,
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL
);