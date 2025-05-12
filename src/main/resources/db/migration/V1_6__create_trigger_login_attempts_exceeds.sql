CREATE OR REPLACE FUNCTION check_login_attempts()
RETURNS TRIGGER AS $$
BEGIN
    IF NEW.attempts IS NOT NULL AND NEW.allowed_attempts IS NOT NULL THEN
        IF NEW.attempts >= NEW.allowed_attempts THEN
            NEW.active := FALSE;
            NEW.deactivation_reason :=  'max attempts exceeded';
        END IF;
    END iF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;


CREATE TRIGGER trg_after_attempts_update
AFTER UPDATE ON logins
FOR EACH ROW
WHEN (OLD.attempts IS DISTINCT FROM NEW.attempts)
EXECUTE FUNCTION check_login_attempts();
