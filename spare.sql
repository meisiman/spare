/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.20 : Database - spare
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`spare` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `spare`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`user_id`,`username`,`password`) values (1,'admin','admin');

/*Table structure for table `cus_inform` */

DROP TABLE IF EXISTS `cus_inform`;

CREATE TABLE `cus_inform` (
  `cus_id` int NOT NULL COMMENT '顾客号',
  `spare_id` int NOT NULL COMMENT '零件号',
  `require` int DEFAULT NULL COMMENT '需求量',
  PRIMARY KEY (`cus_id`,`spare_id`),
  KEY `spare_id` (`spare_id`),
  CONSTRAINT `cus_inform_ibfk_1` FOREIGN KEY (`cus_id`) REFERENCES `customer` (`cus_id`),
  CONSTRAINT `cus_inform_ibfk_2` FOREIGN KEY (`spare_id`) REFERENCES `spare` (`spare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cus_inform` */

insert  into `cus_inform`(`cus_id`,`spare_id`,`require`) values (2,1,20),(2,2,100),(3,1,20),(4,9,10),(5,10,66),(6,3,99),(6,4,480),(6,6,33);

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cus_id` int NOT NULL AUTO_INCREMENT COMMENT '顾客号',
  `cus_name` varchar(10) DEFAULT NULL COMMENT '顾客名',
  `cus_address` varchar(50) DEFAULT NULL COMMENT '顾客地址',
  `cus_phone` varchar(10) DEFAULT NULL COMMENT '顾客电话',
  PRIMARY KEY (`cus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`cus_id`,`cus_name`,`cus_address`,`cus_phone`) values (2,'蓝佳宁','中南民族大学182号','110'),(3,'梅斯曼','中南民族大学182号','120'),(4,'李建刚','重庆','62456247'),(5,'王建军','湖南','54156789'),(6,'陈秀花','新疆','25252546'),(7,'王美丽','内蒙古','2534667'),(8,'孙牡丹','黑龙江','2627586786'),(9,'秦雪花','甘肃','26557688'),(10,'彩玉','吉林','223456767'),(11,'张大美','南京','134524111');

/*Table structure for table `spare` */

DROP TABLE IF EXISTS `spare`;

CREATE TABLE `spare` (
  `spare_id` int NOT NULL AUTO_INCREMENT,
  `spare_name` varchar(10) DEFAULT NULL,
  `spare_weight` varchar(10) DEFAULT NULL,
  `spare_color` varchar(10) DEFAULT NULL,
  `spare_intro` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`spare_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `spare` */

insert  into `spare`(`spare_id`,`spare_name`,`spare_weight`,`spare_color`,`spare_intro`) values (1,'螺丝钉','20g','黑色','炒鸡nice'),(2,'螺母','100g','红色','无'),(3,'螺栓','120g','灰色','无'),(4,'螺丝刀','200g','黄色','工具'),(5,'杠杆','1kg','绿色','无'),(6,'滑轮','50g','紫色','无'),(7,'轮轴','60g','黑色','无'),(8,'心轴','100g','黑色','无'),(9,'风扇叶','200g','baise','有点大'),(10,'链条','500g','黑色','超有用');

/*Table structure for table `sup_inform` */

DROP TABLE IF EXISTS `sup_inform`;

CREATE TABLE `sup_inform` (
  `sup_id` int NOT NULL COMMENT '供应商号',
  `spare_id` int NOT NULL COMMENT '零件号',
  `offer` int DEFAULT NULL COMMENT '供应量',
  PRIMARY KEY (`sup_id`,`spare_id`),
  KEY `spare_id` (`spare_id`),
  CONSTRAINT `sup_inform_ibfk_1` FOREIGN KEY (`sup_id`) REFERENCES `supply` (`sup_id`),
  CONSTRAINT `sup_inform_ibfk_2` FOREIGN KEY (`spare_id`) REFERENCES `spare` (`spare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sup_inform` */

insert  into `sup_inform`(`sup_id`,`spare_id`,`offer`) values (1,1,1),(1,4,400),(1,7,30),(5,4,190),(6,4,20),(6,9,50),(9,4,60);

/*Table structure for table `supply` */

DROP TABLE IF EXISTS `supply`;

CREATE TABLE `supply` (
  `sup_id` int NOT NULL AUTO_INCREMENT COMMENT '供应商号',
  `sup_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '供应商名',
  `sup_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '供应商地址',
  `sup_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '供应商电话',
  `sup_intro` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '供应商简介',
  PRIMARY KEY (`sup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `supply` */

insert  into `supply`(`sup_id`,`sup_name`,`sup_address`,`sup_phone`,`sup_intro`) values (1,'张三','武汉','123456','提供所有零件'),(2,'李四','北京','111111','张三的合伙人'),(4,'王五','北京','123456789','无'),(5,'狗蛋','河南','123457','aaaa'),(6,'翠花','小渔村','5235135','太远了什么都不供应'),(7,'富贵','缅甸','4154516','无'),(8,'旺财','泰国','2526656','无'),(9,'铁柱','俄罗斯','46236457','无'),(11,'刘冠军','上海','6456367','无'),(12,'李建国','成都','24262476','无'),(14,'赵六','武汉','123456','无');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
