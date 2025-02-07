package pe.edu.cibertec.sw_rest_pinturas_t2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryid;
    //@Column(name = "")
    private String categoryname;
    private String description;
}