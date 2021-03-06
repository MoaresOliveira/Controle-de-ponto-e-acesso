package com.dio.santander.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Empresa {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairo;
    private String cidade;
    private String estado;
    private String telefone;
}
