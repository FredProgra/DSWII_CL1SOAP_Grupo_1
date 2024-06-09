package pe.edu.DSWII_CL1SOAP_Grupo_1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.DSWII_CL1SOAP_Grupo_1.Model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Integer> {
}
