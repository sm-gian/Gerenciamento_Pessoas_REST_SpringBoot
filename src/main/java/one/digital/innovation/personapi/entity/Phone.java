package one.digital.innovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digital.innovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //geração de dados de forma incremental
    private Long id;

    @Enumerated(EnumType.STRING) //o dado é definido pelo nome no enum
    @Column(nullable = false) //tipo not null no banco de dados
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
