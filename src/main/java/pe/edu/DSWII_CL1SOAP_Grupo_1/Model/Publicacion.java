package pe.edu.DSWII_CL1SOAP_Grupo_1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpublicacion;
    private String titupublicacion;
    private String respublicacion;
    private String fechpuclicacion;
    private Integer idautor;
}
