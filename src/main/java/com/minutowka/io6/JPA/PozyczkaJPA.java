package com.minutowka.io6.JPA;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pozyczka")
public class PozyczkaJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private LocalDateTime version;

    @Column
    private Long kwota;

    @Column
    private Double rrso;

    @Column
    private Long rata;

    @Column
    private LocalDateTime data_pobrania;

    @Column
    private LocalDateTime data_konca;

    @Column
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "id_u")
    private UzytkownikJPA uzytkownik;
}
