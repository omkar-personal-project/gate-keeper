CREATE TABLE domain_login_policies (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    domain VARCHAR(255) UNIQUE NOT NULL,
    description VARCHAR(255),
    contact_verification_required BOOLEAN DEFAULT FALSE,
    contact_verified BOOLEAN DEFAULT FALSE,
    jwt_token_expiry_in_sec BIGINT NOT NULL DEFAULT 1800,
    policy_type VARCHAR(100) NOT NULL DEFAULT 'DEFAULT'
);