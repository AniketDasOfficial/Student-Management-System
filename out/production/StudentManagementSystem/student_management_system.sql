-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 28, 2021 at 12:59 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student management system`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlog`
--

CREATE TABLE `adminlog` (
  `adminName` varchar(20) NOT NULL,
  `adminPassword` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `adminlog`
--

INSERT INTO `adminlog` (`adminName`, `adminPassword`) VALUES
('Abhijit', 'abhijit'),
('ADMIN_1', 'admin1'),
('ADMIN_2', 'admin2'),
('ADMIN_3', 'admin3'),
('admin_4', 'admin4'),
('Aniket', 'aniket'),
('Anirban', 'anirban'),
('Hritick', 'hritick');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `DepartmentID` varchar(4) NOT NULL,
  `DepartmentName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DepartmentID`, `DepartmentName`) VALUES
('CE', 'Civil Engineering'),
('CSE', 'Computer Science Engineering'),
('EE', 'Electrical Engineering'),
('ECE', 'Electronics and Communications'),
('IT', 'Information Technology'),
('ME', 'Mechanical Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `examination`
--

CREATE TABLE `examination` (
  `DepartmentID` varchar(4) DEFAULT NULL,
  `DateOfExamination` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `examination`
--

INSERT INTO `examination` (`DepartmentID`, `DateOfExamination`) VALUES
('CSE', '12/12/2021'),
('EE', '16/12/2021'),
('CE', '12/12/2021'),
('ME', '14/12/2021'),
('ECE', '05/12/2021'),
('IT', '15/12/2021');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `StudentID` int(11) NOT NULL,
  `StudentName` varchar(50) NOT NULL,
  `StudentGender` varchar(7) NOT NULL,
  `BloodGrp` varchar(3) NOT NULL,
  `DepartmentID` varchar(30) NOT NULL,
  `StudyStandard` varchar(5) NOT NULL,
  `DOB` varchar(11) NOT NULL,
  `GuardianName` varchar(50) NOT NULL,
  `PhoneNumber` varchar(12) NOT NULL,
  `PostalAddress` varchar(100) NOT NULL,
  `EmailAddress` varchar(50) NOT NULL,
  `Religion` varchar(12) NOT NULL,
  `DateOfAdmission` varchar(11) NOT NULL,
  `YearOfPassOut` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`StudentID`, `StudentName`, `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`, `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`, `DateOfAdmission`, `YearOfPassOut`) VALUES
(1, 'Antonio Auditore', 'Male', 'AB-', 'IT', '4th', '14/Feb/1998', 'Ezio Auditore', '9705476155', '45A Barcalona, Catalonia-4000064', 'antonioauditore@gmail.com', 'Christianity', '19/Jun/2018', 2022),
(2, 'Zorbec la Haq', 'Male', 'B+', 'EE', '4th', '03/Mar/2000', 'Zerif Haq', '9007190822', '7/41, St. Patrick Street', 'zorbec2000@gmail.com', 'Islam', '05/Jun/2018', 2022),
(3, 'Hritesh Nayak', 'Male', 'B-', 'EE', '3rd', '02/Mar/1998', 'Pallab Nayak', '3456217895', '5/54, G.S Road', 'hritesh@gmail.com', 'Hinduism', '06/May/2017', 2021),
(4, 'Hrisha Paul', 'Female', 'AB+', 'ME', '4th', '04/Jan/1999', 'Rahul Paul', '6784328751', '2, Trikon Park', 'hrisha@gmail.com', 'Buddhism', '06/Jun/2018', 2022),
(5, 'Divijata Chandra', 'Female', 'AB+', 'CSE', '4th', '04/Jul/1999', 'Eshin Chandra', '1235674897', '65, S.N Bose Road', 'Divijata@gmail.com', 'Buddhism', '05/Jun/2020', 2024),
(6, 'Rihana Water', 'Others', 'O-', 'CE', '3rd', '02/Mar/1997', 'Aston Water', '1357846926', '23, S.K Martin Road', 'rihana@gmail.com', 'Others', '05/Jun/2016', 2020),
(7, 'Dhairya Sharma', 'Female', 'O+', 'CE', '4th', '04/Jun/1997', 'Dinesh Sharma', '4567329810', '45/2A, Gandhi Nagar', 'dhairya@gmail.com', 'Hinduism', '06/Jul/2017', 2022),
(8, 'Selina Iftikar', 'Female', 'AB+', 'CSE', '3rd', '26/Apr/2000', 'ikbal Iftikar', '1357247598', '5/78/8A, Block-V, R.S Appt', 'selina@gmail.com', 'Islam', '07/Jun/2018', 2022),
(9, 'Jotibrata Roy', 'Male', 'A-', 'ME', '1st', '04/May/2004', 'Rishav Roy', '9875662335', '12, Shibpur', 'jotibrata@gmail.com', 'Hinduism', '05/Aug/2021', 2025),
(10, 'Poulami Ghosh', 'Female', 'AB+', 'IT', '3rd', '13/Dec/1999', 'Rohit Ghosh', '9856459855', '2, Azadgarh', 'poulami@gmail.com', 'Hinduism', '01/Aug/2018', 2022),
(11, 'Aniket Das', 'Male', 'B+', 'EE', '4th', '03/Mar/2000', 'Jayanta Das', '994945454', '7/41, Bijoygarh', 'aniket@gmail.com', 'Hinduism', '05/Jun/2018', 2022);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminlog`
--
ALTER TABLE `adminlog`
  ADD PRIMARY KEY (`adminName`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DepartmentID`),
  ADD UNIQUE KEY `DepartmentName` (`DepartmentName`);

--
-- Indexes for table `examination`
--
ALTER TABLE `examination`
  ADD UNIQUE KEY `DepartmentID` (`DepartmentID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`StudentID`),
  ADD UNIQUE KEY `PhoneNumber` (`PhoneNumber`),
  ADD UNIQUE KEY `EmailAddress` (`EmailAddress`),
  ADD KEY `DepartmentID` (`DepartmentID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `examination`
--
ALTER TABLE `examination`
  ADD CONSTRAINT `examination_ibfk_1` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`);

--
-- Constraints for table `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_ibfk_1` FOREIGN KEY (`DepartmentID`) REFERENCES `department` (`DepartmentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
