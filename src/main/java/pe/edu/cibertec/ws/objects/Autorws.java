//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 08:14:58 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para autorws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="autorws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idautor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomautor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apeautor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechnacautor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autorws", propOrder = {
    "idautor",
    "nomautor",
    "apeautor",
    "fechnacautor"
})
public class Autorws {

    protected int idautor;
    @XmlElement(required = true)
    protected String nomautor;
    @XmlElement(required = true)
    protected String apeautor;
    @XmlElement(required = true)
    protected String fechnacautor;

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

    /**
     * Obtiene el valor de la propiedad nomautor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomautor() {
        return nomautor;
    }

    /**
     * Define el valor de la propiedad nomautor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomautor(String value) {
        this.nomautor = value;
    }

    /**
     * Obtiene el valor de la propiedad apeautor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeautor() {
        return apeautor;
    }

    /**
     * Define el valor de la propiedad apeautor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeautor(String value) {
        this.apeautor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechnacautor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechnacautor() {
        return fechnacautor;
    }

    /**
     * Define el valor de la propiedad fechnacautor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechnacautor(String value) {
        this.fechnacautor = value;
    }

}
