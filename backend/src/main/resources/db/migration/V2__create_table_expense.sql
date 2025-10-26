CREATE TABLE expense(
    id serial PRIMARY KEY,
    user_id INTEGER NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    expense_date DATE NOT NULL,
    category varchar(255) NOT NULL,
    amount NUMERIC(14, 2) NOT NULL CHECK ( amount >= 0 ),
    notes TEXT,
    created_at TIMESTAMPTZ DEFAULT now() NOT NULL
);

CREATE INDEX idx_expenses_user_date ON expenses(user_id, expense_date);