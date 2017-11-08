-- /src/main/resources/V003__create_table_reviews.sql
CREATE TABLE reviews
(
	id BIGINT(20) NOT NULL AUTO_INCREMENT,
	manuscript VARCHAR(255) NOT NULL,
	publishable BOOLEAN NOT NULL,
	PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 DEFAULT COLLATE utf8_general_ci;
