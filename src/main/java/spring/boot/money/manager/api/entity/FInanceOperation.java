package spring.boot.money.manager.api.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.pl.NIP;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.boot.money.manager.api.enums.TypeOperation;

@Entity
@Table(name = "finance_operations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FInanceOperation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idOperation;

    @Column
    @NotBlank
    private String descriptionOperation;

    @Column
    @NotNull
    private BigDecimal valueOperation;

    @Column
    private LocalDateTime dateOperation;

    @Column
    @Enumerated(value = EnumType.STRING)
    private TypeOperation typeOperation;



    


    
}
