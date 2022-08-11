package dio.aula.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "tab_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 20, nullable = false)
    private String userName;
    @Column(length = 100, nullable = false)
    private String password;
}
