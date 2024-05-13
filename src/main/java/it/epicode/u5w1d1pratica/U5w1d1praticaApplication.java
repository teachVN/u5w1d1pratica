package it.epicode.u5w1d1pratica;

import it.epicode.u5w1d1pratica.appConfig.AppConfig;
import it.epicode.u5w1d1pratica.bean.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5w1d1praticaApplication {

	public static void main(String[] args) {

		SpringApplication.run(U5w1d1praticaApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Menu menu = ctx.getBean(Menu.class);

		menu.stampaMenu();
	}

}
