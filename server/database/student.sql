-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 17, 2024 at 08:11 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student`
--

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE `info` (
  `regno` bigint(8) NOT NULL,
  `stud_fname` varchar(20) NOT NULL,
  `stud_mname` varchar(20) DEFAULT NULL,
  `stud_lname` varchar(20) DEFAULT NULL,
  `gender` varchar(6) NOT NULL,
  `dob` date NOT NULL,
  `location` varchar(100) NOT NULL,
  `city` varchar(30) NOT NULL,
  `disctrict` varchar(30) NOT NULL,
  `state` varchar(30) NOT NULL,
  `country` varchar(30) NOT NULL,
  `zipcode` bigint(20) NOT NULL,
  `father_fname` varchar(20) DEFAULT NULL,
  `father_mname` varchar(20) DEFAULT NULL,
  `father_lname` varchar(20) DEFAULT NULL,
  `mother_fname` varchar(20) DEFAULT NULL,
  `mother_mname` varchar(20) DEFAULT NULL,
  `mother_lname` varchar(20) DEFAULT NULL,
  `phno` bigint(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `info`
--
ALTER TABLE `info`
  ADD PRIMARY KEY (`regno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
