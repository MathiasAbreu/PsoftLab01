package psoft.ufcg.lab01.services;

import org.springframework.stereotype.Service;
import psoft.ufcg.lab01.entities.Disciplina;

import java.util.HashMap;

@Service
public class ServiceDisciplinas {

    private HashMap<Integer, Disciplina> disciplinas = new HashMap<>();

    public Disciplina addDisciplina(String nome, int id, double nota) {

        Disciplina disciplina = new Disciplina(id,nome,nota);

        if(!disciplinas.containsKey(id))
            disciplinas.put(id,disciplina);

        return disciplina;
    }

    public boolean containsDisciplina(int id) {

        return disciplinas.containsKey(id);
    }

    public Disciplina buscarDisciplina(int id) {

        if(disciplinas.containsKey(id))
            return disciplinas.get(id);
        else
            return new Disciplina(0,null,0);
    }
}
