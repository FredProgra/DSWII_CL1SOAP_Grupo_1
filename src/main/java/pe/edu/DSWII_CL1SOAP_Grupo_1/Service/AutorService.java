package pe.edu.DSWII_CL1SOAP_Grupo_1.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.DSWII_CL1SOAP_Grupo_1.Model.Autor;
import pe.edu.DSWII_CL1SOAP_Grupo_1.Repository.AutorRepository;
import pe.edu.DSWII_CL1SOAP_Grupo_1.convert.AutorConvert;
import pe.edu.cibertec.ws.objects.Autorws;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class AutorService implements IAutorService{
    private AutorRepository autorRepository;
    private AutorConvert autorconvert;

    @Override
    public List<Autorws> listarAutores() {
        return autorconvert.convertAutorToAutorWs(
                autorRepository.findAll());
    }

    @Override
    public Autorws obtenerAutoresxId(int id) {
        Optional<Autor> autor = autorRepository.findById(id);
        if(autor.isEmpty()){return null;}
        return (Autorws) autorconvert.convertAutorToAutorWs((List<Autor>) autor.get());
    }

    @Override
    public Autorws registrarActualizarAutor(Autorws autorws) {
        Autor nuevoautor = autorRepository.save(
                autorconvert.convertAutorwsToAutor(autorws));
        if(nuevoautor == null)
            return  null;
        return autorconvert.convertDomicilioToDomicilioWs(nuevoautor);
    }
    }

