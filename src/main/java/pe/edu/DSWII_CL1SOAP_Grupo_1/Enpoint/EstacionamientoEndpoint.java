package pe.edu.DSWII_CL1SOAP_Grupo_1.Enpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.DSWII_CL1SOAP_Grupo_1.Repository.EstacionamientoRepository;
import pe.edu.DSWII_CL1SOAP_Grupo_1.Service.AutorService;
import pe.edu.cibertec.ws.objects.GetAutoresRequest;
import pe.edu.cibertec.ws.objects.GetAutoresResponse;
import pe.edu.cibertec.ws.objects.GetEstacionamientoMontoRequest;
import pe.edu.cibertec.ws.objects.GetEstacionamientoResponse;

@Endpoint
@AllArgsConstructor
public class EstacionamientoEndpoint {
    private EstacionamientoRepository estacionamientoRepository;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "GetEstacionamientoResponse")
    @ResponsePayload
    public GetEstacionamientoMontoRequest getMonto(@RequestPayload
                                         GetEstacionamientoResponse response){
        GetEstacionamientoMontoRequest request=new GetEstacionamientoMontoRequest();
        request.setMonto(estacionamientoRepository.Monto(response.getEstacionamiento()));
        return request;
    }
}
