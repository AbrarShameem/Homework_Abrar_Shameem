CREATE TABLE `stud` (
`firstname` VARCHAR(50) NOT NULL,
`lastname` VARCHAR(45) NOT NULL,
`studentid` INT NOT NULL,
`gpa` INT NOT NULL,
`grade` CHAR(5) NOT NULL,
PRIMARY KEY (`studentid`));
  
SELECT * FROM `stud`;
  
INSERT INTO `stud` (`firstname`, `lastname`,`studentid`,`gpa`,`grade`) VALUES
('Brown','kale',10, 5,'C'),
('Smith','Rane',11, 6,'B'),
('Ram','Patil',12, 7,'A'),
('Shyam','Nale',13, 3,'D'),
('Tushar','Mane',14, 6,'B'),
('Praj','Lokhnade',15, 5,'C'),
('Jay','Pandey',16, 8,'A'),
('Gajanan','Varma',17, 7,'A'),
('Radha','Shinde',18, 3,'D'),
('Om','Sharma',19, 5,'C');