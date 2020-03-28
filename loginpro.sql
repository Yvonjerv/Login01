/*
Navicat MySQL Data Transfer

Source Server         : mysql_connect
Source Server Version : 50605
Source Host           : localhost:3306
Source Database       : loginpro

Target Server Type    : MYSQL
Target Server Version : 50605
File Encoding         : 65001

Date: 2020-03-28 09:15:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `login`
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('1', 'yvon', '1234');
INSERT INTO `login` VALUES ('2', 'yves', '1234');
INSERT INTO `login` VALUES ('3', 'jervs', '1234');

-- ----------------------------
-- Table structure for `wip_users`
-- ----------------------------
DROP TABLE IF EXISTS `wip_users`;
CREATE TABLE `wip_users` (
  `firstname` varchar(28) DEFAULT NULL,
  `lastname` varchar(28) DEFAULT NULL,
  `email` varchar(28) DEFAULT NULL,
  `gender` varchar(28) DEFAULT NULL,
  `dob` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wip_users
-- ----------------------------
INSERT INTO `wip_users` VALUES ('Evans', 'APEDO', 'evans@gmail.com', 'Male', '2015-09-10');
INSERT INTO `wip_users` VALUES ('New', 'New', 'new', 'Female', '2019-09-09');
INSERT INTO `wip_users` VALUES ('New', 'Home', 'something@gmail.com', 'Male', '2015-09-30');
INSERT INTO `wip_users` VALUES ('Abc', 'Cba', 'gmail@gmail.com', 'Male', '2019-09-16');
INSERT INTO `wip_users` VALUES ('yvin', 'yvin', 'hjghg', 'male', '2019-09-10');
