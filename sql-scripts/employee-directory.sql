CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Data for table `employee`
INSERT INTO `employee` (id, first_name, last_name, email) VALUES 
(1, 'Sofia', 'Martinez', 'sofia.martinez@example.com'),
(2, 'Liam', 'Johnson', 'liam.johnson@example.com'),
(3, 'Noah', 'Williams', 'noah.williams@example.com'),
(4, 'Olivia', 'Brown', 'olivia.brown@example.com'),
(5, 'Ava', 'Davis', 'ava.davis@example.com'),
(6, 'Isabella', 'Garcia', 'isabella.garcia@example.com'),
(7, 'Lucas', 'Miller', 'lucas.miller@example.com'),
(8, 'Mason', 'Martinez', 'mason.martinez@example.com'),
(9, 'Ethan', 'Rodriguez', 'ethan.rodriguez@example.com'),
(10, 'Mia', 'Hernandez', 'mia.hernandez@example.com');
