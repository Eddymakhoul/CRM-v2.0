# CRM-v2.0
CREATE TABLE `tbladherents` (
  `adhId` int(11) NOT NULL AUTO_INCREMENT,
  `adhFirstName` varchar(45) NOT NULL,
  `adhLastName` varchar(45) NOT NULL,
  PRIMARY KEY (`adhId`)
) ENGINE=InnoDB AUTO_INCREMENT=2001 DEFAULT CHARSET=utf8;
CREATE TABLE `adhcomplaint` (
  `adhComplaint` longtext NOT NULL,
  `adhResolution` longtext NOT NULL,
  `adhId` int(11) NOT NULL,
  `complaintId` int(11) NOT NULL AUTO_INCREMENT,
  `adhsatisfaction` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`complaintId`),
  KEY `adhId_FK_idx` (`adhId`),
  CONSTRAINT `adhId_FK` FOREIGN KEY (`adhId`) REFERENCES `tbladherents` (`adhId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
