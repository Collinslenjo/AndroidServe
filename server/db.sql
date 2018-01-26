/*
 * SQL File
*/

CREATE TABLE IF NOT EXISTS 'users' (
	'id' int(11)  NOT NULL AUTO_INCREMENT,
	'username' VARCHAR(255) COLLATE utf8mb4_unicode_ci NOT NULL,
	'email' VARCHAR(255) COLLATE utf8mb4_unicode_ci NOT NULL,
	'phonenumber' VARCHAR(255) COLLATE utf8mb4_unicode_ci NOT NULL,
	'password' VARCHAR(255) COLLATE utf8mb4_unicode_ci NOT NULL,
	`created_at` timestamp NULL DEFAULT NULL,
	`updated_at` timestamp NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;