set foreign_key_checks = 0;

delete from truck;

set foreign_key_checks = 1;

alter table truck auto_increment = 1;

INSERT INTO `canix`.`truck` (`id`, `description`, `plate`) VALUES ('1', 'Caminhão verde e branco', 'FAR7898');

INSERT INTO `canix`.`truck` (`id`, `description`, `plate`) VALUES ('2', 'Caminhão constelation', 'FAR2789');