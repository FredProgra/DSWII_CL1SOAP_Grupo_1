package pe.edu.DSWII_CL1SOAP_Grupo_1.Repository;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Estacionamiento;

import java.util.HashMap;
import java.util.Map;
@Component
public class EstacionamientoRepository {

    public EstacionamientoRepository(){
        Estacionamiento obj=new Estacionamiento();
        obj.setHora(5.5);
        obj.setTarifa(1500);

    }
    public double Monto(Estacionamiento c){
        return c.getHora()*c.getTarifa();
    }
}
