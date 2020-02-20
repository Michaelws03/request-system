package events.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long codigo;

    @NotBlank
    @Getter
    @Setter
    private String nome;

    @NotBlank
    @Getter
    @Setter
    private String produto;

    @NotBlank
    @Getter
    @Setter
    private String quantidade;

    @NotBlank
    @Getter
    @Setter
    private String endereco;

    @NotBlank
    @Getter
    @Setter
    private String data;

    @NotBlank
    @Getter
    @Setter
    private String horario;

    public Evento(@NotBlank String quantidade) {
        this.quantidade = quantidade;
    }


}
