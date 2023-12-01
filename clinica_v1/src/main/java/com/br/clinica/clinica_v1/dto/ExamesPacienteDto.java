package com.br.clinica.clinica_v1.dto;

import com.br.clinica.clinica_v1.entity.Consulta;
import com.br.clinica.clinica_v1.entity.RegistroConsulta;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class ExamesPacienteDto {
    private String nome;
    private Double nota1;
    private Double nota2;
    private Double media;
    private String status;

}
