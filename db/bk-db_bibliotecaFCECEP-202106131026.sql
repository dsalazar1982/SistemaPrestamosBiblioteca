-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: 10.0.0.51    Database: db_bibliotecaFCECEP
-- ------------------------------------------------------
-- Server version	5.5.5-10.3.27-MariaDB-0+deb10u1-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `db_bibliotecaFCECEP`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `db_bibliotecaFCECEP` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish2_ci */;

USE `db_bibliotecaFCECEP`;

--
-- Table structure for table `t_detalles_prestamos`
--

DROP TABLE IF EXISTS `t_detalles_prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_detalles_prestamos` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `id_prestamo` int(11) NOT NULL,
  `isbn` int(11) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_detalles_prestamos`
--

LOCK TABLES `t_detalles_prestamos` WRITE;
/*!40000 ALTER TABLE `t_detalles_prestamos` DISABLE KEYS */;
INSERT INTO `t_detalles_prestamos` VALUES (1,1,2021001),(2,1,2021004),(3,1,2021001),(4,1,2021002),(5,2,2021001),(6,2,2010001),(7,2,2021001),(8,2,2021003),(9,3,2021000),(10,3,2021003),(11,3,2021000),(12,4,2021001),(13,4,2021001),(14,4,2021000),(16,5,2021000),(17,5,2021001),(18,6,2021000),(19,6,2021003),(20,6,2021001),(21,6,1),(22,17,2021001),(23,15,2021004),(24,15,2021003),(25,15,2021002),(26,15,2021001);
/*!40000 ALTER TABLE `t_detalles_prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_estudiantes`
--

DROP TABLE IF EXISTS `t_estudiantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_estudiantes` (
  `codigo_est` int(11) NOT NULL,
  `nombres_est` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `apellidos_est` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `telefono_est` varchar(100) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`codigo_est`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_estudiantes`
--

LOCK TABLES `t_estudiantes` WRITE;
/*!40000 ALTER TABLE `t_estudiantes` DISABLE KEYS */;
INSERT INTO `t_estudiantes` VALUES (2021031000,'DIANA','SABOGAL','3212100'),(2021031001,'PEPITO','PEREZ','3212100'),(2021031002,'MARIA','LARRAONDO','895541789'),(2021061001,'BENITO','CAMELAS','5788475'),(2021061002,'MANUELA','BELTRAN SAS','5552255'),(2021061003,'BOB','ESPONJA','552255'),(2021061004,'ALEJANDRO','LERNER','8882245'),(2021061005,'SIMON','BOLIVAR','8987844');
/*!40000 ALTER TABLE `t_estudiantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_libros`
--

DROP TABLE IF EXISTS `t_libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_libros` (
  `isbn` int(11) NOT NULL,
  `titulo_lib` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `editorial_lib` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `ano_publicacion` date NOT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_libros`
--

LOCK TABLES `t_libros` WRITE;
/*!40000 ALTER TABLE `t_libros` DISABLE KEYS */;
INSERT INTO `t_libros` VALUES (2021001,'PROGRAMACION','RAMA','2021-06-10'),(2021002,'BASE DE DATOS','PERSON','2012-01-06'),(2021003,'LARAVEL','USERS','2010-06-12'),(2021004,'SQL','TURPIAL','2015-06-02'),(2021005,'ANGULAR','PIRAMIDE','2017-12-12');
/*!40000 ALTER TABLE `t_libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_prestamos`
--

DROP TABLE IF EXISTS `t_prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_prestamos` (
  `id_prestamo` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `codigo_est` int(11) NOT NULL,
  PRIMARY KEY (`id_prestamo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_prestamos`
--

LOCK TABLES `t_prestamos` WRITE;
/*!40000 ALTER TABLE `t_prestamos` DISABLE KEYS */;
INSERT INTO `t_prestamos` VALUES (1,'2005-07-23',2021031001),(2,'2005-07-23',2021061002),(3,'2021-06-12',2021031000),(4,'2021-06-12',2021031002),(5,'2017-03-17',2021031000),(7,'2000-01-31',2021061004),(9,'2021-06-13',2021031000),(10,'2021-06-13',2021031000),(11,'2021-06-13',2021031001),(12,'2021-06-13',2021031001),(13,'2021-06-13',2021031000);
/*!40000 ALTER TABLE `t_prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'db_bibliotecaFCECEP'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-13 10:26:52
