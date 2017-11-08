-- MySQL dump 10.13  Distrib 5.7.20, for linux-glibc2.12 (x86_64)
--
-- Host: localhost    Database: usuarios
-- ------------------------------------------------------
-- Server version	5.7.20

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
-- Table structure for table `Usuario`
--

DROP TABLE IF EXISTS `Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `Nickname` varchar(16) NOT NULL,
  `Nombre` varchar(128) NOT NULL,
  `Paterno` varchar(64) NOT NULL,
  `Materno` varchar(64) DEFAULT NULL,
  `Email` varchar(64) NOT NULL,
  `Telefono` varchar(32) DEFAULT NULL,
  `Password` varchar(64) NOT NULL,
  `TipoUsuario` int(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fk_Usuario_Tipo_Usuario_idx` (`TipoUsuario`),
  CONSTRAINT `fk_Usuario_Tipo_Usuario` FOREIGN KEY (`TipoUsuario`) REFERENCES `cTipoUsuario` (`idTipoUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
INSERT INTO `Usuario` VALUES (1,'ilichh1','Ilich','Arredondo',NULL,'ilichh1@hotmail.com',NULL,'Ilichh123',1),(2,'ilichh2','Francisco','Gonzalez','Arredondo','3333','ilichh2@hotmail.com','',2),(3,'ilichh2','Francisco','Gonzalez','Arredondo','3333','ilichh2@hotmail.com','',2),(4,'ilichh2','Francisco','Gonzalez','Arredondo','3333','ilichh2@hotmail.com','',2),(5,'ilichh2','Francisco','Gonzalez','Arredondo','3333','ilichh2@hotmail.com','',2),(6,'ilichh2','Francisco','Gonzalez','Arredondo','3333','ilichh2@hotmail.com','',2),(7,'citlali123','Citlali','Hernande','Esconedo','33333','citlali@generation.org','123456',2),(8,'citlali123','Citlali','Hernande','Esconedo','33333','citlali@generation.org','1234',2),(9,'citlali123','Citlali','Hernande','Esconedo','33333','citlali@generation.org','',2),(10,'citlali123','Citlali','Hernande','Esconedo','33333','citlali@generation.org','',2),(11,'citlali123','Citlali','Hernande','Esconedo','33333','citlali@generation.org','1234',2),(12,'ilichh1','Ilichh123','Arredondo','Gonzalez','3333','ilichh1@hotmail.com','Ilichh123',2);
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cTipoUsuario`
--

DROP TABLE IF EXISTS `cTipoUsuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cTipoUsuario` (
  `idTipoUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `TipoUsuario` varchar(32) NOT NULL,
  PRIMARY KEY (`idTipoUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cTipoUsuario`
--

LOCK TABLES `cTipoUsuario` WRITE;
/*!40000 ALTER TABLE `cTipoUsuario` DISABLE KEYS */;
INSERT INTO `cTipoUsuario` VALUES (1,'Administrador'),(2,'Auditor');
/*!40000 ALTER TABLE `cTipoUsuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-07 18:48:03
