-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 29, 2019 at 11:56 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop1`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `userID` varchar(10) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `ContactNumber` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`userID`, `Name`, `Email`, `Password`, `ContactNumber`) VALUES
('a0001', 'admin_1', 'admin_1@gmail.com', '13579', 1111111),
('a0002', 'admin_2', 'admin_2@gmail.com', '2468', 24682468);

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `empId` varchar(6) NOT NULL,
  `employeeName` varchar(30) NOT NULL,
  `designation` varchar(20) NOT NULL,
  `salary` double(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`empId`, `employeeName`, `designation`, `salary`) VALUES
('e00001', 'emp1', 'managers', 400000.00),
('e00002', 'Employee2', 'salesman', 220000.00),
('e00003', 'emp3', 'salesman', 10000.00),
('e00006', 'e6', 'cashier', 10000.00),
('e013', 'Employee13', 'manager', 5345.00),
('e08', 'Emp08', 'cashier', 12000.00),
('e11', 'mp1145', 'cashier', 10000.00),
('e12', 'E12', 'assdd', 1234.00),
('e15', 'Emp015', 'manager', 1234.00),
('e16', 'asdgg', 'cashier', 10000.00);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userId` varchar(8) NOT NULL,
  `password` varchar(10) NOT NULL,
  `status` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userId`, `password`, `status`) VALUES
('e00001', '1234', 0),
('e00002', '17404044', 1),
('e00003', '13695425', 1),
('e00006', '10415479', 1),
('e013', '14487762', 0),
('e08', '12121238', 1),
('e11', '10956941', 1),
('e12', '17588323', 1),
('e15', '15501192', 0),
('e16', '18587052', 1);

-- --------------------------------------------------------

--
-- Table structure for table `login2`
--

CREATE TABLE `login2` (
  `userID` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Status` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login2`
--

INSERT INTO `login2` (`userID`, `Password`, `Status`) VALUES
('a0001', '112233', 0),
('a0002', '112233', 0),
('s0001', '1234', 1),
('s0002', '1234', 1),
('s0003', '1234', 1),
('s0004', '1234', 1),
('s0005', '1234', 1),
('t0001', '5678', 2),
('t00017', '5678', 2),
('t0002', '5678', 2),
('t00020', '5678', 2),
('t0003', '5678', 2),
('t0004', '5678', 2),
('t0005', '5678', 2);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `userID` varchar(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `EducationalInstitution` varchar(30) NOT NULL,
  `Class` varchar(10) NOT NULL,
  `Medium` varchar(10) NOT NULL,
  `Location` varchar(40) NOT NULL,
  `ContactNumber` int(20) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`userID`, `Name`, `EducationalInstitution`, `Class`, `Medium`, `Location`, `ContactNumber`, `Email`, `Password`, `Gender`) VALUES
('s0001', 'student_1', 'AISB', '5', 'english', 'kuratoli', 45689, 'student_1@gmail.com', '1234', 'male'),
('s0003', 'student_3', 'EWS', '7', 'english', 'rampura', 123456798, 'student_3@gmail.com', '1234', 'male'),
('s0004', 'student_4', 'DCS', '8', 'bangla', 'mirpur', 234567891, 'student_4@gmail.com', '1234', 'female'),
('s0005', 'student_5', 'RAJUK', '9', 'bangla', 'uttara', 134567892, 'student_1@gmail.com', '1234', 'male');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `UserID` varchar(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `EducationalStatus` varchar(15) NOT NULL,
  `Medium` varchar(10) NOT NULL,
  `Experience` int(10) NOT NULL,
  `Location` varchar(30) NOT NULL,
  `ContactNumber` int(20) NOT NULL,
  `EducationalInstitution` varchar(15) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Salary` int(20) NOT NULL,
  `Subjects` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`UserID`, `Name`, `EducationalStatus`, `Medium`, `Experience`, `Location`, `ContactNumber`, `EducationalInstitution`, `Email`, `Password`, `Gender`, `Salary`, `Subjects`) VALUES
('t0001', 'teacher_1', 'hsc', 'english', 2, 'kuratoli', 158965, 'notreDame', 'teacher_1@gmail.com', '5678', 'male', 4000, 'bangla,physics '),
('t0002', 'teacher_2', 'undergraduate', 'english', 2, 'bashundhara', 158643, 'Buet', 'teacher_2@gmail.com', '5678', 'female', 5000, 'english,chemistry'),
('t0003', 'teacher_3', 'hsc', 'bangla', 2, 'rampura', 134568, 'Rajuk', 'teacher_3@gmail.com', '5678', 'male', 6000, 'physics,math'),
('t0004', 'teacher_4', 'undergraduate', 'bangla', 3, 'shamoli ', 135891, 'NSU', 'teacher_4@gmail.com', '5678', 'male', 7000, 'english,biology'),
('t0005', 'teacher_5', 'undergraduate', 'english', 2, 'ajompur', 121453, 'AIUB', 'teacher_5@gmail.com', '5678', 'female', 8000, 'chemistry,biology');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`empId`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userId`);

--
-- Indexes for table `login2`
--
ALTER TABLE `login2`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`UserID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
