package pe.edu.DSWII_CL1SOAP_Grupo_1.convert;

import org.springframework.stereotype.Component;
import pe.edu.DSWII_CL1SOAP_Grupo_1.Model.Autor;
import pe.edu.cibertec.ws.objects.Autorws;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Component
public class AutorConvert {
    public Autor convertAutorwsToAutor(Autorws autorws){
        Autor autor = new Autor();
        autor.setIdautor(autorws.getIdautor());
        autor.setNomautor(autorws.getNomautor());
        autor.setApeautor(autorws.getApeautor());
        autor.setFechnaciautor(autorws.getFechnacautor());

        return autor;

    }

    public List<Autor> convertDomiciliowsToDomicilio(List<Autorws> autorws){
        List<Autor> autorList = new ArrayList<>();
        autorws.forEach(aut ->{
            autorList.add(convertAutorwsToAutor(aut));
        });
        return autorList;
    }
    public Autorws convertDomicilioToDomicilioWs(Autor autor){
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat();
        Autorws autorws = new Autorws();
        autorws.setIdautor(autor.getIdautor());
        autorws.setNomautor(autor.getNomautor());
        autorws.setApeautor(autor.getApeautor());
       autorws.setFechnacautor(autor.getFechnaciautor());
        return autorws;
    }
    public List<Autorws> convertAutorToAutorWs(List<Autor> autor){
        List<Autorws> autorList = new ArrayList<>();
        autor.forEach(aut ->{
            autorList.add(convertDomicilioToDomicilioWs(aut));
        });
        return autorList;
    }
}
