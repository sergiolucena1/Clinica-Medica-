package com.br.clinica.clinica_v1.service;

import com.br.clinica.clinica_v1.entity.Exame;
import com.br.clinica.clinica_v1.repository.ExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public class ExameService {

    @Autowired
    DisciplinaRepository repository;

    public Disciplina create(Disciplina disciplina) {
        return repository.save(disciplina);
    }

    public List<Disciplina> getByProfessorId(Long professorId) {

        return repository.findByProfessorId(professorId);
}
