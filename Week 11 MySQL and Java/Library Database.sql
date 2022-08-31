-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `ISBN` char(13) NOT NULL,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `stock` int NOT NULL,
  PRIMARY KEY (`ISBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES ('9780007447831','A Clash of Kings','George R.R. Martin',3),('9780007447848','A Storm of Swords: Steel and Snow','George R.R. Martin',3),('9780007447855','A Storm of Swords: Blood and Gold','George R.R. Martin',3),('9780007447862','A Feast for Crows','George R.R. Martin',3),('9780007448036','A Game of Thrones','George R.R. Martin',3),('9780007466061','A Dance With Dragons: Dreams and Dust','George R.R. Martin',3),('9780007466078','A Dance With Dragons: After the Feast','George R.R. Martin',3),('9780261103573','The Fellowship of the Ring','J. R. R. Tolkien',1),('9780261103580','The Two Towers','J. R. R. Tolkien',2),('9780261103597','The Return of the King','J. R. R. Tolkien',2),('9781398515697','The Seven Husbands of Evelyn Hugo','Taylor Jenkins Reid',3),('9781408855652','Harry Potter and the Philosopher\'s Stone','J. K. Rowling',2),('9781408855669','Harry Potter and the Chamber of Secrets','J. K. Rowling',2),('9781408855676','Harry Potter and the Prisoner of Azkaban','J. K. Rowling',2),('9781408855683','Harry Potter and the Goblet of Fire','J. K. Rowling',2),('9781408855690','Harry Potter and the Order of the Phoenix','J. K. Rowling',2),('9781408855706','Harry Potter and the Half-Blood Prince','J. K. Rowling',2),('9781408855713','Harry Potter and the Deathly Hallows','J. K. Rowling',2),('9781408891384','The Song of Achilles','Madeline Miller',1),('9781472154668','Where the Crawdads Sing','Delia Owens',2);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaned`
--

DROP TABLE IF EXISTS `loaned`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaned` (
  `user_id` int DEFAULT NULL,
  `ISBN` char(13) DEFAULT NULL,
  `date_lent` date NOT NULL,
  `due_date` date NOT NULL,
  KEY `user_id` (`user_id`),
  KEY `ISBN` (`ISBN`),
  CONSTRAINT `loaned_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `loaned_ibfk_2` FOREIGN KEY (`ISBN`) REFERENCES `books` (`ISBN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaned`
--

LOCK TABLES `loaned` WRITE;
/*!40000 ALTER TABLE `loaned` DISABLE KEYS */;
INSERT INTO `loaned` VALUES (1,'9781408855652','2022-08-02','2022-08-30'),(1,'9781408855669','2022-08-02','2022-08-30'),(1,'9781408855676','2022-08-02','2022-08-30'),(3,'9780261103573','2022-07-12','2022-08-09'),(6,'9781472154668','2022-08-15','2022-09-12'),(8,'9780007447848','2022-07-30','2022-08-27'),(8,'9780007447855','2022-07-30','2022-08-27');
/*!40000 ALTER TABLE `loaned` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `contact_number` varchar(12) NOT NULL,
  `address_1` varchar(40) NOT NULL,
  `address_2` varchar(40) DEFAULT NULL,
  `county` varchar(40) NOT NULL,
  `postcode` varchar(8) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Noah','Anderson','07735149756','34 The Crescent','London','Greater London','SW13 0NN'),(2,'David','Evans','07826880860','17 Charlton Park Rd','London','Greater London','SE7 8HY'),(3,'Rachel','Thompson','07752450180','38 St Margaret\'s Rd','London','Greater London','SE4 1YU'),(4,'Matthew','Turner','07874968333','19 Mercer St','London','Greater London','WC2H 9QR'),(5,'Dorothy','Clarke','07703346782','104 New Rd','London','Greater London','E4 9SY'),(6,'Catherine','Martin','07982669417','39 Richmond Rd','London','Greater London','E8 3AA'),(7,'Benjamin','Kelly','07803393367','70 Westleigh Ave','London','Greater London','SW15 6XF'),(8,'Rebecca','White','07013919850','27 Fairbridge Rd','London','Greater London','N19 3EW'),(9,'Michael','Baker','07804176231','1 Portree Cl','London','Greater London','N22 8HD'),(10,'Jennifer','Bennett','07038287864','105 Queens Cres','London','Greater London','NW5 4EY');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-30 20:12:34
