package com.dio.santander.projetos.Controle.de.ponto.e.acesso.model;

import lombok.*;

import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    private long id;
    @OneToMany
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime data;
}
