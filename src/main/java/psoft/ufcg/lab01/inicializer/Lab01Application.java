package psoft.ufcg.lab01.inicializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import psoft.ufcg.lab01.controllers.ControllerDisciplinas;

@SpringBootApplication
public class Lab01Application {

	public static void main(String[] args) {

		ControllerDisciplinas controle = new ControllerDisciplinas();

		SpringApplication.run(Lab01Application.class, args);
	}

}
