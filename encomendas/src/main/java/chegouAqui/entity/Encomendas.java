package chegouAqui.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "encomendas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Encomendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private LocalDateTime data_recebimento;
    private LocalDateTime data_entrega;
    private String pin;
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "fk_id_morador")
    private Morador morador;

    @ManyToOne
    @JoinColumn(name = "fk_id_porteiro")
    private Porteiro porteiro;
}
