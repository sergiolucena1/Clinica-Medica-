package com.br.clinica.clinica_v1.entity;

public class RegistroConsulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private MatriculaAluno paciente;

    @ManyToOne
    @JoinColumn(name="exame_id")
    private Disciplina exame;

    private String tipo;

    private Double resultado;

    private String status;
}
