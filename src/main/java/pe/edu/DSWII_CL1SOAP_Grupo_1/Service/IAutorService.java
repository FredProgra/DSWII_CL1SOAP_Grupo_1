package pe.edu.DSWII_CL1SOAP_Grupo_1.Service;

import pe.edu.cibertec.ws.objects.Autorws;

import java.util.List;

public interface IAutorService {
    List<Autorws> listarAutores();

    Autorws obtenerAutoresxId(int id);

    Autorws registrarActualizarAutor(Autorws autor);
}
