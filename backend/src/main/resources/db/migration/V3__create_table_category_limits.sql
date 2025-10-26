CREATE TABLE category_limits (
    id serial PRIMARY KEY,
    user_id INTEGER NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    category VARCHAR(50) NOT NULL,
    limit_amount NUMERIC(14, 2) NOT NULL CHECK ( limit_amount >= 0 ),
    created_at TIMESTAMPTZ DEFAULT now() NOT NULL,
    UNIQUE (user_id, category)
)