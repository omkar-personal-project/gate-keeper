CREATE TABLE logins (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    user_id UUID NOT NULL,
    user_name VARCHAR(100) NOT NULL,
    password TEXT NOT NULL,
    domain VARCHAR(255) NOT NULL,
    auth_provider VARCHAR(100),
    last_login TIMESTAMPTZ,
    attempts INTEGER DEFAULT 0,
    allowed_attempts INTEGER,
    active BOOLEAN DEFAULT TRUE,
    is_deleted BOOLEAN DEFAULT FALSE,
    contact_verification_required BOOLEAN DEFAULT FALSE,
    deactivation_reason TEXT,
    updated_at TIMESTAMPTZ DEFAULT now(),
    created_at TIMESTAMPTZ DEFAULT now(),

    CONSTRAINT fk_login_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    CONSTRAINT unique_domain_username UNIQUE (domain, user_name)
);