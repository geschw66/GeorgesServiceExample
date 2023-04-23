package geschwend.example.GeorgesServiceExample.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * @author George C. Geschwend
 * @date 4/18/2023 9:03 PM
 * @project GeorgesServiceExample
 *
 * Country entity. with country information.
 */
@Entity
//@Getter                     //Replace these with the @Data annotation
//@Setter
//@RequiredArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Table(name = "COUNTRY", schema = "GEORGE")
public class Country {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    //...
}