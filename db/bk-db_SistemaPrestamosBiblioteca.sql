-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: 10.0.0.51    Database: db_SistemaPrestamosBiblioteca
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
-- Current Database: `db_SistemaPrestamosBiblioteca`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `db_SistemaPrestamosBiblioteca` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish2_ci */;

USE `db_SistemaPrestamosBiblioteca`;

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
  PRIMARY KEY (`id_detalle`),
  KEY `t_detalles_prestamos_FK` (`isbn`),
  KEY `t_detalles_prestamos_FK_1` (`id_prestamo`),
  CONSTRAINT `t_detalles_prestamos_FK` FOREIGN KEY (`isbn`) REFERENCES `t_libros` (`ISBN`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `t_detalles_prestamos_FK_1` FOREIGN KEY (`id_prestamo`) REFERENCES `t_prestamos` (`id_prestamo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_detalles_prestamos`
--

LOCK TABLES `t_detalles_prestamos` WRITE;
/*!40000 ALTER TABLE `t_detalles_prestamos` DISABLE KEYS */;
INSERT INTO `t_detalles_prestamos` VALUES (45,5,2021061301),(46,5,2021061303),(47,5,2021061305),(48,6,2021010104),(49,6,2021061301),(50,6,2021061302),(51,7,2021010104),(52,8,2021010104),(53,8,2021061302);
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
INSERT INTO `t_estudiantes` VALUES (1001,'DIANA MARIA','GALINDO SUAREZ','3212100'),(1002,'ANGEL JOSE','MURCIA ESCOBAR','3212100'),(1003,'DANIEL MANUEL','PEREZ IPIA','3212100'),(1005,'CRISTIAN EDUARDO','CORTES PALENCIA','3212100'),(2001,'INES JANETH','CALDAS GOMEZ','3212100'),(2002,'JUAN SEBASTIAN','CAMPO SANCHEZ','3212100'),(2003,'JORGE ANDRES','MORALES TRUJILLO','3212100'),(2004,'LUIS EDUARDO','SANCHEZ JIMENEZ','3212100');
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
INSERT INTO `t_libros` VALUES (2021010101,'COMO DISEÑAR CON EXITO','DINERS','2010-04-17'),(2021010103,'PHP8','PHP','2021-06-13'),(2021010104,'BONAY, ARTE MILENARIO','FENSHUI','2000-08-23'),(2021061301,'LA BIBLIA DEL SOFTWARE LIBRE','PERSON','2001-01-31'),(2021061302,'TODO SOBRE SQL','RA-MA','2021-06-13'),(2021061303,'LINUX A FONDO','McGRADO','2015-06-06'),(2021061304,'PROGRAMADOR FULL STACK','USERS','2020-12-24'),(2021061305,'DIETA SALUDABLE','HEALD','2021-05-13');
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
  PRIMARY KEY (`id_prestamo`),
  KEY `t_prestamos_FK` (`codigo_est`),
  CONSTRAINT `t_prestamos_FK` FOREIGN KEY (`codigo_est`) REFERENCES `t_estudiantes` (`codigo_est`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_prestamos`
--

LOCK TABLES `t_prestamos` WRITE;
/*!40000 ALTER TABLE `t_prestamos` DISABLE KEYS */;
INSERT INTO `t_prestamos` VALUES (5,'2021-06-14',2002),(6,'2021-06-14',2002),(7,'2021-06-14',1002),(8,'2021-06-15',1001);
/*!40000 ALTER TABLE `t_prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'db_SistemaPrestamosBiblioteca'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-15  8:10:56
