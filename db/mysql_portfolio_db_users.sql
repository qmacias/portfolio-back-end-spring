-- 1. Create users
CREATE USER 'jobseeker' @'localhost' IDENTIFIED BY '4KZYG0&U0jv2*';
GRANT ALL PRIVILEGES ON portfolio.* TO 'jobseeker' @'localhost';
