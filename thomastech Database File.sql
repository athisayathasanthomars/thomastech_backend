CREATE DATABASE  IF NOT EXISTS `thomastech` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `thomastech`;
-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: thomastech
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `checkout_entity`
--

DROP TABLE IF EXISTS `checkout_entity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `checkout_entity` (
  `id` bigint NOT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `price` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkout_entity`
--

LOCK TABLES `checkout_entity` WRITE;
/*!40000 ALTER TABLE `checkout_entity` DISABLE KEYS */;
/*!40000 ALTER TABLE `checkout_entity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `courseid` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `duration` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`courseid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1,'Java for Back-End Development','Learn Java from basics to spring boot framework.','Back-End Development',4500,'6 months','https://drive.google.com/file/d/1VGdcew?usp=sharing','Available'),(2,'Angular for Front-End Development','Angular course specially designed for front-end development from beginner to expert.','Front-End Development',4000,'4 months','https://drive.google.com/file/d/1dHrycEIDUaoHyoGozElDRtyyU_uJOjid/view?usp=sharing','Available'),(3,'MySQL for Database Development','mySQL course specially designed for database development for data storage in back-end process.','Data Management',3000,'3 months','https://drive.google.com/file/d/1_ii4WqlgQDPvAElwXoNJhhcPWRe2_Pzz/view?usp=sharing','Closed'),(4,'Git & GitHub','Git & Github course specially designed for code maintainance and colloboration on team coding','DevOps',3000,'3 months','https://drive.google.com/file/d/1_0rlFs89oMvGGqQYHVZlwuWsR0dsFJpa/view?usp=sharing','Available'),(5,'OpenCV for Image Processing','This course specially designed for students who have interest data science image processing for advanced projects.','Machine Learning',3500,'4 months','https://drive.google.com/file/d/1v7h5R_inpEWAmkDr9zVs-nPxe3c7_YLk/view?usp=sharing',NULL),(6,'Machine Leaning for Biginners','ML course specially designed for data science prediction projects where datasets, images and videos used.','Machine Learning',4000,'6 months','https://drive.google.com/file/d/1PSL-1NHQzdSbeKKuQidtgyJ8-m-SLKEL/view?usp=sharing',NULL),(7,'Kernas for Deep Learning','Kernas course specially designed for Image Processing and use with ML for predictions.','Deep Learning',4500,'3 months','https://drive.google.com/file/d/1jSx5m992naH0N3Gmu_20JyYdjqrwjz1Z/view?usp=sharing',NULL),(8,'TensorFlow for ML & DL','TensorFlow Framework course specially designed for ML & DL image, object prediction projects.','Machine Learning',3000,'3 months','https://drive.google.com/file/d/1iUU81EI1A26gwLkZHi5JawfbHHgKkbyG/view?usp=sharing',NULL);
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customerquery`
--

DROP TABLE IF EXISTS `customerquery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customerquery` (
  `queryid` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `message` varchar(500) NOT NULL,
  `phoneno` varchar(255) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`queryid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customerquery`
--

LOCK TABLES `customerquery` WRITE;
/*!40000 ALTER TABLE `customerquery` DISABLE KEYS */;
INSERT INTO `customerquery` VALUES (1,'abi@gmail.com','Jesuthasan','Abican','I like follow git and github course but i want to know some details','0775937309','New');
/*!40000 ALTER TABLE `customerquery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `studentid` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(100) NOT NULL,
  `education` varchar(50) NOT NULL,
  `email` varchar(255) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `phoneno` varchar(255) NOT NULL,
  `selectedcourse` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`studentid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Thavadi Road,Kokuvil','B.Eng in Software Engineering','esai@gmail.com','nithiyanantharaja','Esaipiriyan','0761164638','MySQL for Database Development','New'),(2,'Kalai Arasu Lane, Navaly South','B.Eng in Software Engineering,BA in IT(Hons)','thomarsthuvaa@gmail.com','Athisayathasan','Thuvarangan','0761164638','Git & Github','New');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-31 16:01:01
