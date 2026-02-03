CREATE TABLE students (
	id SERIAL PRIMARY KEY NOT NULL,
	name VARCHAR(50) NOT NULL,
	age INT,
	email VARCHAR(100) UNIQUE
);

CREATE TABLE courses (
   id SERIAL NOT NULL,
   student_id INT,
   course_name VARCHAR(50),
   grade VARCHAR(2),
   PRIMARY KEY (id),
   FOREIGN KEY (student_id) REFERENCES students(id)
);

INSERT INTO students (name, age, email)
VALUES
('Sample1', 18, 'sample1@example.com'),
('Sample2', 20, 'sample2@example.com'),
('Sample3', 23, 'sample3@example.com'),
('Sample4', 25, 'sample4@example.com'),
('Sample5', 30, 'sample5@example.com');

INSERT INTO courses (STUDENT_ID, COURSE_NAME, GRADE)
VALUES (1, 'Power Systems', 80),
       (4, 'Electrical Circuits', 90),
       (3, 'Calculus', 85);

select * from students;
select * from courses;