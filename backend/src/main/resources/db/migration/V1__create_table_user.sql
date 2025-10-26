CREATE TABLE users(
    id serial PRIMARY KEY,
    name varchar(255),
    email varchar(255),
    password varchar(255),
    monthly_limit NUMERIC(14, 2) DEFAULT 0 CHECK ( monthly_limit >= 0 ),
    created_at TIMESTAMPTZ DEFAULT now() NOT NULL,
    UNIQUE (email)
);