package com.example.QETask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QETaskApplication {

	private static final Logger logger = LoggerFactory.getLogger(QETaskApplication.class);

	public static void main(String[] args) {
		try {
			SpringApplication.run(QETaskApplication.class, args);
			logger.info("Приложение запущено успешно.");
		} catch (Exception exception) {
			logger.error("Ошибка при запуске приложения: {}", exception.getMessage(), exception);
			System.exit(1);
		}
	}
}