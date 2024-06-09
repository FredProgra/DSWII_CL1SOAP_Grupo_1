//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 08:16:32 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para publicacionws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="publicacionws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idpublicacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="titpublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechpublicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idautor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicacionws", propOrder = {
    "idpublicacion",
    "titpublicacion",
    "respublicacion",
    "fechpublicacion",
    "idautor"
})
public class Publicacionws {

    protected int idpublicacion;
    @XmlElement(required = true)
    protected String titpublicacion;
    @XmlElement(required = true)
    protected String respublicacion;
    @XmlElement(required = true)
    protected String fechpublicacion;
    protected int idautor;

    /**
     * Obtiene el valor de la propiedad idpublicacion.
     * 
     */
    public int getIdpublicacion() {
        return idpublicacion;
    }

    /**
     * Define el valor de la propiedad idpublicacion.
     * 
     */
    public void setIdpublicacion(int value) {
        this.idpublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad titpublicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitpublicacion() {
        return titpublicacion;
    }

    /**
     * Define el valor de la propiedad titpublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitpublicacion(String value) {
        this.titpublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad respublicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespublicacion() {
        return respublicacion;
    }

    /**
     * Define el valor de la propiedad respublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespublicacion(String value) {
        this.respublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechpublicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechpublicacion() {
        return fechpublicacion;
    }

    /**
     * Define el valor de la propiedad fechpublicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechpublicacion(String value) {
        this.fechpublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idautor.
     * 
     */
    public int getIdautor() {
        return idautor;
    }

    /**
     * Define el valor de la propiedad idautor.
     * 
     */
    public void setIdautor(int value) {
        this.idautor = value;
    }

}
