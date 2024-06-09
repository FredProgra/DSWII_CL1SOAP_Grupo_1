package pe.edu.DSWII_CL1SOAP_Grupo_1.Enpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.DSWII_CL1SOAP_Grupo_1.Exception.NotFoundException;
import pe.edu.DSWII_CL1SOAP_Grupo_1.Service.AutorService;
import pe.edu.cibertec.ws.objects.*;

@Endpoint
@AllArgsConstructor
public class AutorEndpoint {
    private AutorService autorservice;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getAutoresRequest")
    @ResponsePayload
    public GetAutoresResponse getAutores(@RequestPayload
                                         GetAutoresRequest request){
        GetAutoresResponse response = new GetAutoresResponse();
        response.getAutor().addAll(autorservice.listarAutores());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getAutorRequest")
    @ResponsePayload
    public GetAutorResponse getAutor(@RequestPayload
                                     GetAutorRequest request){
        GetAutorResponse response = new GetAutorResponse();
        Autorws autorws = autorservice.obtenerAutoresxId(request.getId());
        if(autorws == null)
            throw new NotFoundException("El autor con el ID " + request.getId()+" no existe!");
        response.setAutor(autorws);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postAutorRequest")
    @ResponsePayload
    public PostAutorResponse saveAutor(@RequestPayload
                                               PostAutorRequest request){
        PostAutorResponse response = new PostAutorResponse();
        response.setAutor(autorservice.registrarActualizarAutor(
                request.getAutor()));
        return response;
    }
}
