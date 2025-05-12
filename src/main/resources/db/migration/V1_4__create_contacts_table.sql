CREATE TABLE contacts (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    detail VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL,
    verified BOOLEAN DEFAULT FALSE,
    is_primary BOOLEAN DEFAULT FALSE,
    verification_required BOOLEAN DEFAULT FALSE,
    user_id UUID NOT NULL,
    CONSTRAINT fk_contacts_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);