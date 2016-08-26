
package org.datacontract.schemas._2004._07.sge_service_contracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCiudadSvc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCiudadSvc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CiudadSvc" type="{http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data}CiudadSvc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCiudadSvc", propOrder = {
    "ciudadSvc"
})
public class ArrayOfCiudadSvc {

    @XmlElement(name = "CiudadSvc", nillable = true)
    protected List<CiudadSvc> ciudadSvc;

    /**
     * Gets the value of the ciudadSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciudadSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiudadSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiudadSvc }
     * 
     * 
     */
    public List<CiudadSvc> getCiudadSvc() {
        if (ciudadSvc == null) {
            ciudadSvc = new ArrayList<CiudadSvc>();
        }
        return this.ciudadSvc;
    }

}
