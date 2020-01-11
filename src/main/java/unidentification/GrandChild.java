package unidentification;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 손자
 */
@Entity
@Getter @Setter
public class GrandChild {

    @Id @GeneratedValue
    @Column(name = "GRANDCHILD_ID")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "CHILD_ID")
    private Child child;
}
