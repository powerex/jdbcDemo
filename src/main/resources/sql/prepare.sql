CREATE SCHEMA `jdbc_db` DEFAULT CHARACTER SET utf8;

USE `jdbc_db`;

CREATE TABLE `jdbc_db`.`students` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `age` INT NULL,
  PRIMARY KEY (`id`));


INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Klara', '22');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Bob', '23');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Sten', '35');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Paul', '38');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Jessica', '19');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Olivia', '28');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Samantha', '31');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Robert', '47');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Jack', '18');
INSERT INTO `jdbc_db`.`students` (`name`, `age`) VALUES ('Molly', '9');

