-- MySQL dump 10.13  Distrib 5.1.41, for debian-linux-gnu (i486)
--
-- Host: localhost    Database: mentalhealthliberia
-- ------------------------------------------------------
-- Server version	5.1.41-3ubuntu12.10

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
-- Table structure for table `patient_encounter_form`
--

DROP TABLE IF EXISTS `patient_encounter_form`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient_encounter_form` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `age` varchar(255) NOT NULL,
  `amitriptyline` bit(1) NOT NULL,
  `anxiety_disorder` varchar(255) NOT NULL,
  `cage` varchar(255) NOT NULL,
  `carbamazepine` bit(1) NOT NULL,
  `carbmazepine_antiepileptic` bit(1) NOT NULL,
  `chlorpromazine` bit(1) NOT NULL,
  `clinicianid` varchar(255) NOT NULL,
  `clinician_training_level` varchar(255) NOT NULL,
  `clomipramine` bit(1) NOT NULL,
  `clonazepam` bit(1) NOT NULL,
  `counseling` varchar(255) NOT NULL,
  `county_of_residence` varchar(255) NOT NULL,
  `date_of_birth` varchar(255) NOT NULL,
  `depakote` bit(1) NOT NULL,
  `depakote_antiepileptic` bit(1) NOT NULL,
  `diagnosis_primary` varchar(255) NOT NULL,
  `diazepam` bit(1) NOT NULL,
  `discharge_disposition` varchar(255) NOT NULL,
  `distance_traveled` varchar(255) NOT NULL,
  `education` varchar(255) NOT NULL,
  `employment_status` varchar(255) NOT NULL,
  `epilepsy` varchar(255) NOT NULL,
  `escitalopram` bit(1) NOT NULL,
  `family_psycho_education` varchar(255) NOT NULL,
  `fathers_name` varchar(255) NOT NULL,
  `fluoxetine` bit(1) NOT NULL,
  `fluphenazine` bit(1) NOT NULL,
  `fluphenazine_decanoate_injection` bit(1) NOT NULL,
  `follow_up_care_counseling` bit(1) NOT NULL,
  `follow_up_care_medication` bit(1) NOT NULL,
  `gaf` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `haloperidal` bit(1) NOT NULL,
  `haloperidal_decanoate_injection` bit(1) NOT NULL,
  `imipramine` bit(1) NOT NULL,
  `individual_counseling` varchar(255) NOT NULL,
  `lithium` bit(1) NOT NULL,
  `location_of_service` varchar(255) NOT NULL,
  `lorazepam` bit(1) NOT NULL,
  `marital_status` varchar(255) NOT NULL,
  `mood_disorder` varchar(255) NOT NULL,
  `other_anticholinergic` bit(1) NOT NULL,
  `other_antidepressant` bit(1) NOT NULL,
  `other_antiepileptic` bit(1) NOT NULL,
  `other_antipsychotic` bit(1) NOT NULL,
  `other_medical_condition` varchar(255) NOT NULL,
  `other_mood_stabilizer` bit(1) NOT NULL,
  `other_sedative` bit(1) NOT NULL,
  `patientid` varchar(255) NOT NULL,
  `phenobarbital` bit(1) NOT NULL,
  `phenytoin` bit(1) NOT NULL,
  `phq` varchar(255) NOT NULL,
  `place_of_birth` varchar(255) NOT NULL,
  `psychotic_disorder` varchar(255) NOT NULL,
  `reason_for_visit` varchar(255) NOT NULL,
  `referral_source` varchar(255) NOT NULL,
  `report_data` bit(1) NOT NULL,
  `risperidone` bit(1) NOT NULL,
  `risperidone_consta_injection` bit(1) NOT NULL,
  `secondary_diagnosis` varchar(255) NOT NULL,
  `sertraline` bit(1) NOT NULL,
  `somatoform_disorder` varchar(255) NOT NULL,
  `substance_abuse_disorder` varchar(255) NOT NULL,
  `substance_abuse_disorder2` varchar(255) NOT NULL,
  `trihexyphenidyl` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_encounter_form`
--

LOCK TABLES `patient_encounter_form` WRITE;
/*!40000 ALTER TABLE `patient_encounter_form` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_encounter_form` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiro_role`
--

DROP TABLE IF EXISTS `shiro_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiro_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiro_role`
--

LOCK TABLES `shiro_role` WRITE;
/*!40000 ALTER TABLE `shiro_role` DISABLE KEYS */;
INSERT INTO `shiro_role` VALUES (1,1,'Administrator'),(2,1,'Analyst'),(3,1,'Clinician');
/*!40000 ALTER TABLE `shiro_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiro_role_permissions`
--

DROP TABLE IF EXISTS `shiro_role_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiro_role_permissions` (
  `shiro_role_id` bigint(20) DEFAULT NULL,
  `permissions_string` varchar(255) DEFAULT NULL,
  KEY `FK389B46C98BA4B1D` (`shiro_role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiro_role_permissions`
--

LOCK TABLES `shiro_role_permissions` WRITE;
/*!40000 ALTER TABLE `shiro_role_permissions` DISABLE KEYS */;
INSERT INTO `shiro_role_permissions` VALUES (1,'admin'),(2,'analyst'),(3,'clinician');
/*!40000 ALTER TABLE `shiro_role_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiro_user`
--

DROP TABLE IF EXISTS `shiro_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiro_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `password_hash` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiro_user`
--

LOCK TABLES `shiro_user` WRITE;
/*!40000 ALTER TABLE `shiro_user` DISABLE KEYS */;
INSERT INTO `shiro_user` VALUES (1,0,'c7ad44cbad762a5da0a452f9e854fdc1e0e7a52a38015f23f3eab1d80b931dd472634dfac71cd34ebc35d16ab7fb8a90c81f975113d6c7538dc69dd8de9077ec','admin'),(2,0,'812df07b976b1bee5c2a2743fc6c230dafc379e37899c81194f4639c98c40878362576a551f4c5230c959d49e4647992bc95b20a7c86e8d8d80056e0b85d08c7','clinician');
/*!40000 ALTER TABLE `shiro_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiro_user_permissions`
--

DROP TABLE IF EXISTS `shiro_user_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiro_user_permissions` (
  `shiro_user_id` bigint(20) DEFAULT NULL,
  `permissions_string` varchar(255) DEFAULT NULL,
  KEY `FK34555A9EADE50EFD` (`shiro_user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiro_user_permissions`
--

LOCK TABLES `shiro_user_permissions` WRITE;
/*!40000 ALTER TABLE `shiro_user_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `shiro_user_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiro_user_roles`
--

DROP TABLE IF EXISTS `shiro_user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiro_user_roles` (
  `shiro_user_id` bigint(20) NOT NULL,
  `shiro_role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`shiro_user_id`,`shiro_role_id`),
  KEY `FKBA221057ADE50EFD` (`shiro_user_id`),
  KEY `FKBA2210578BA4B1D` (`shiro_role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiro_user_roles`
--

LOCK TABLES `shiro_user_roles` WRITE;
/*!40000 ALTER TABLE `shiro_user_roles` DISABLE KEYS */;
INSERT INTO `shiro_user_roles` VALUES (1,1),(2,3);
/*!40000 ALTER TABLE `shiro_user_roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2011-10-18 14:34:09
