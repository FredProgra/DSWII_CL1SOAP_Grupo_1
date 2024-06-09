//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 08:40:54 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estacionamiento" type="{http://www.cibertec.edu.pe/ws/objects}estacionamiento"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "estacionamiento"
})
@XmlRootElement(name = "getEstacionamientoResponse")
public class GetEstacionamientoResponse {

    @XmlElement(required = true)
    protected Estacionamiento estacionamiento;

    /**
     * Obtiene el valor de la propiedad estacionamiento.
     * 
     * @return
     *     possible object is
     *     {@link Estacionamiento }
     *     
     */
    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    /**
     * Define el valor de la propiedad estacionamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Estacionamiento }
     *     
     */
    public void setEstacionamiento(Estacionamiento value) {
        this.estacionamiento = value;
    }

}
