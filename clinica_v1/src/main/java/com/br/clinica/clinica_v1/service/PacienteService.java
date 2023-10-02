package com.br.clinica.clinica_v1.service;


import com.br.clinica.clinica_v1.entity.Paciente;
import com.br.clinica.clinica_v1.repository.PacienteReprository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    PacienteReprository repository;

    public Paciente create(Paciente paciente){
        return null;
    }

    public Optional<Paciente> findById(Long id){
        return null;
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Paciente> listaPorNome(String nome) {
        return null;
    }

    public List<Paciente> listaTodos() {
        return null;
    }

    public List<Paciente> listarPacienteConsulta(Long idDiciplina) {
        return null;
    }
}