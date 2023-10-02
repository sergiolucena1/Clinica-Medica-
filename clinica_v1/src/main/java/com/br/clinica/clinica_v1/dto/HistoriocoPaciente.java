package com.br.clinica.clinica_v1.dto;

import com.br.clinica.clinica_v1.entity.Consulta;

import lombok.Data;

import java.util.List;

@Data
public class HistoriocoPaciente {
    private String nomeAluno;
    private Consulta consulta;
    private List<PacienteConsulta> pacienteConsultaList;
}
