package psoft.ufcg.lab01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psoft.ufcg.lab01.entities.Disciplina;

import java.util.HashMap;

@Service
public class ServiceDisciplinas {

    @Autowired
    private HashMap<Integer, Disciplina> disciplinas;

    public Disciplina addDisciplina(String nome, int id, double nota) {

        Disciplina disciplina = new Disciplina(nome,id,nota);

        if(!disciplinas.containsKey(id))
            disciplinas.put(id,disciplina);

        return disciplina;
    }
}
