ALTER TABLE logins
ADD CONSTRAINT fk_logins_domain_login_policies
FOREIGN KEY (domain)
REFERENCES domain_login_policies(domain) ON DELETE CASCADE;