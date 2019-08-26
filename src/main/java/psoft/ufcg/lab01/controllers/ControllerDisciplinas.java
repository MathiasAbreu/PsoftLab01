package psoft.ufcg.lab01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psoft.ufcg.lab01.entities.Disciplina;
import psoft.ufcg.lab01.services.ServiceDisciplinas;

@RestController
public class ControllerDisciplinas {

    public static int idUnico = 100;

    @Autowired
    private ServiceDisciplinas serviceDisciplinas;

    @PostMapping("/v1/api/disciplinas")
    public ResponseEntity<Disciplina> addDisciplina(@RequestParam(value = "nome") String nome, @RequestParam(value = "nota") String nota) {

        System.out.println("Entrou no metodo");
        idUnico += 1;
        return new ResponseEntity<Disciplina>(serviceDisciplinas.addDisciplina(nome,idUnico,Double.parseDouble(nota)), HttpStatus.CREATED);
    }
}
