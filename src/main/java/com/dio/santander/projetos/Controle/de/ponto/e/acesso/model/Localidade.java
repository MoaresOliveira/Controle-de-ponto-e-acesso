package com.dio.santander.projetos.Controle.de.ponto.e.acesso.model;

import lombok.*;

import javax.persistence.ManyToOne;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
