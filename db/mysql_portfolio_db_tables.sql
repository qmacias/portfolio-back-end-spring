-- 0. Set auto commit to zero
SET autocommit = 0;

-- 0.1 Start a new transaction
START TRANSACTION;

-- 1. Create database
CREATE DATABASE IF NOT EXISTS portfolio DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
use portfolio;

-- 2. Insert images table
#DROP TABLE IF EXISTS images;
CREATE TABLE images (
  id BIGINT NOT NULL AUTO_INCREMENT,
  path VARCHAR(255) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_image_id(id)
);

-- 3. Insert people table
#DROP TABLE IF EXISTS people;
CREATE TABLE people (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  age INT NOT NULL,
  degree VARCHAR(255) NOT NULL,
  email VARCHAR(255) UNIQUE NOT NULL,
  summary TEXT NOT NULL,
  image_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_person_id(id),
  INDEX idx_images_id(image_id),
  FOREIGN KEY images_reference_ibfk(image_id) REFERENCES images(id)
);

-- 3.1. Insert phones table
#DROP TABLE IF EXISTS phones;
CREATE TABLE phones (
  id BIGINT NOT NULL AUTO_INCREMENT,
  number VARCHAR(64) NOT NULL,
  person_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_phones_id(id),
  INDEX idx_people_id(person_id),
  FOREIGN KEY people_reference_ibfk(person_id) REFERENCES people(id)
);

-- 4. Insert address table
#DROP TABLE IF EXISTS address;
CREATE TABLE address (
  id BIGINT NOT NULL AUTO_INCREMENT,
  type VARCHAR(64) NOT NULL,
  description VARCHAR(255) NOT NULL,
  person_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_address_id(id),
  INDEX idx_people_id(person_id),
  FOREIGN KEY people_reference_ibfk(person_id) REFERENCES people(id)
);

-- 5. Insert categories table
#DROP TABLE IF EXISTS categories;
CREATE TABLE categories (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(64) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_categories_id(id)
);

-- 6. Insert modalities table
#DROP TABLE IF EXISTS modalities;
CREATE TABLE modalities (
  id BIGINT NOT NULL AUTO_INCREMENT,
  type VARCHAR(64) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_modalities_id(id)
);

-- 7. Insert education table
#DROP TABLE IF EXISTS education;
CREATE TABLE education (
  id BIGINT NOT NULL AUTO_INCREMENT,
  description VARCHAR(255) NOT NULL,
  location VARCHAR(255) NOT NULL,
  schedule INT NOT NULL,
  is_certified TINYINT NOT NULL,
  date VARCHAR(255) NOT NULL,
  person_id BIGINT NOT NULL,
  category_id BIGINT NOT NULL,
  modality_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_education_id(id),
  INDEX idx_people_id(person_id),
  INDEX idx_categories_id(category_id),
  INDEX idx_modalities_id(modality_id),
  FOREIGN KEY people_reference_ibfk(person_id) REFERENCES people(id),
  FOREIGN KEY categories_reference_ibfk(category_id) REFERENCES categories(id),
  FOREIGN KEY modalities_reference_ibfk(modality_id) REFERENCES modalities(id)
);

-- 8. Insert certificates table
#DROP TABLE IF EXISTS certificates;
CREATE TABLE certificates (
  id VARCHAR(64) NOT NULL,
  url VARCHAR(255) NOT NULL,
  education_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_certificate_id(id),
  INDEX idx_education_id(education_id),
  FOREIGN KEY education_reference_ibfk(education_id) REFERENCES education(id)
);

-- 9. Insert users table
#DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id BIGINT NOT NULL AUTO_INCREMENT,
  username VARCHAR(255) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL,
  person_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_user_id(id),
  INDEX idx_people_id_0(person_id),
  FOREIGN KEY people_reference_ibfk_0(person_id) REFERENCES people(id)
);

-- 10. Insert social table
#DROP TABLE IF EXISTS social;
CREATE TABLE social (
  id BIGINT NOT NULL AUTO_INCREMENT,
  link VARCHAR(255) NOT NULL,
  person_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_social_id(id),
  INDEX idx_people_id_1(person_id),
  FOREIGN KEY people_reference_ibfk_1(person_id) REFERENCES people(id)
);

-- 11. Insert jobs table
#DROP TABLE IF EXISTS jobs;
CREATE TABLE jobs (
  id BIGINT NOT NULL AUTO_INCREMENT,
  position VARCHAR(255) NOT NULL,
  description TEXT NOT NULL,
  start_date VARCHAR(64) NOT NULL,
  finish_date VARCHAR(64) NOT NULL,
  person_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_job_id(id),
  INDEX idx_people_id_2(person_id),
  FOREIGN KEY people_reference_ibfk_2(person_id) REFERENCES people(id)
);

-- 12. Insert achievements table
#DROP TABLE IF EXISTS achievements;
CREATE TABLE achievements (
  id BIGINT NOT NULL AUTO_INCREMENT,
  description TEXT NOT NULL,
  job_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_achiev_id(id),
  INDEX idx_jobs_id(job_id),
  FOREIGN KEY jobs_reference_ibfk(job_id) REFERENCES jobs(id)
);

-- 13. Insert technologies table
#DROP TABLE IF EXISTS technologies;
CREATE TABLE technologies (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_technologies_id(id)
);

-- 14. Insert projects table
#DROP TABLE IF EXISTS projects;
CREATE TABLE projects (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  description TEXT NOT NULL,
  releaseDate VARCHAR(10) NOT NULL,
  person_id BIGINT NOT NULL,
  image_id BIGINT NOT NULL,
  technology_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_project_id(id),
  INDEX idx_people_id_3(person_id),
  INDEX idx_images_id(image_id),
  INDEX idx_technologies_id(technology_id),
  FOREIGN KEY people_reference_ibfk_3(person_id) REFERENCES people(id),
  FOREIGN KEY images_reference_ibfk(image_id) REFERENCES images(id),
  FOREIGN KEY technologies_reference_ibfk(image_id) REFERENCES technologies(id)
);

-- 15. Insert skills table
#DROP TABLE IF EXISTS skills;
CREATE TABLE skills (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  person_id BIGINT NOT NULL,
  technology_id BIGINT NOT NULL,
  created_at DATETIME NOT NULL,
  updated_at DATETIME DEFAULT NULL,
  deleted_at DATETIME DEFAULT NULL,
  UNIQUE KEY uq_skills_id(id),
  INDEX idx_people_id_4(person_id),
  INDEX idx_technologies_id(technology_id),
  FOREIGN KEY people_reference_ibfk_4(person_id) REFERENCES people(id),
  FOREIGN KEY technologies_reference_ibfk(technology_id) REFERENCES technologies(id)
);

-- 16. Commit changes    
COMMIT;