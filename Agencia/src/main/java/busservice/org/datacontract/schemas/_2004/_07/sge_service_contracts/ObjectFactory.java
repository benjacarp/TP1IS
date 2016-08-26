
package org.datacontract.schemas._2004._07.sge_service_contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.sge_service_contracts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CiudadSvc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "CiudadSvc");
    private final static QName _ArrayOfButacaSvc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "ArrayOfButacaSvc");
    private final static QName _UnidadSvc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "UnidadSvc");
    private final static QName _ArrayOfUnidadSvc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "ArrayOfUnidadSvc");
    private final static QName _Resultado_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "Resultado");
    private final static QName _BusServiceFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Faults", "BusServiceFault");
    private final static QName _ArrayOfCiudadSvc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "ArrayOfCiudadSvc");
    private final static QName _ButacaSvc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "ButacaSvc");
    private final static QName _UnidadSvcDominio_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "Dominio");
    private final static QName _UnidadSvcTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "Tipo");
    private final static QName _UnidadSvcMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "Marca");
    private final static QName _ResultadoError_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "Error");
    private final static QName _BusServiceFaultErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Faults", "ErrorMessage");
    private final static QName _CiudadSvcDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", "Descripcion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.sge_service_contracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfUnidadSvc }
     * 
     */
    public ArrayOfUnidadSvc createArrayOfUnidadSvc() {
        return new ArrayOfUnidadSvc();
    }

    /**
     * Create an instance of {@link Resultado }
     * 
     */
    public Resultado createResultado() {
        return new Resultado();
    }

    /**
     * Create an instance of {@link ArrayOfButacaSvc }
     * 
     */
    public ArrayOfButacaSvc createArrayOfButacaSvc() {
        return new ArrayOfButacaSvc();
    }

    /**
     * Create an instance of {@link ArrayOfCiudadSvc }
     * 
     */
    public ArrayOfCiudadSvc createArrayOfCiudadSvc() {
        return new ArrayOfCiudadSvc();
    }

    /**
     * Create an instance of {@link ButacaSvc }
     * 
     */
    public ButacaSvc createButacaSvc() {
        return new ButacaSvc();
    }

    /**
     * Create an instance of {@link UnidadSvc }
     * 
     */
    public UnidadSvc createUnidadSvc() {
        return new UnidadSvc();
    }

    /**
     * Create an instance of {@link CiudadSvc }
     * 
     */
    public CiudadSvc createCiudadSvc() {
        return new CiudadSvc();
    }

    /**
     * Create an instance of {@link BusServiceFault }
     * 
     */
    public BusServiceFault createBusServiceFault() {
        return new BusServiceFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CiudadSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "CiudadSvc")
    public JAXBElement<CiudadSvc> createCiudadSvc(CiudadSvc value) {
        return new JAXBElement<CiudadSvc>(_CiudadSvc_QNAME, CiudadSvc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfButacaSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "ArrayOfButacaSvc")
    public JAXBElement<ArrayOfButacaSvc> createArrayOfButacaSvc(ArrayOfButacaSvc value) {
        return new JAXBElement<ArrayOfButacaSvc>(_ArrayOfButacaSvc_QNAME, ArrayOfButacaSvc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "UnidadSvc")
    public JAXBElement<UnidadSvc> createUnidadSvc(UnidadSvc value) {
        return new JAXBElement<UnidadSvc>(_UnidadSvc_QNAME, UnidadSvc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnidadSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "ArrayOfUnidadSvc")
    public JAXBElement<ArrayOfUnidadSvc> createArrayOfUnidadSvc(ArrayOfUnidadSvc value) {
        return new JAXBElement<ArrayOfUnidadSvc>(_ArrayOfUnidadSvc_QNAME, ArrayOfUnidadSvc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "Resultado")
    public JAXBElement<Resultado> createResultado(Resultado value) {
        return new JAXBElement<Resultado>(_Resultado_QNAME, Resultado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Faults", name = "BusServiceFault")
    public JAXBElement<BusServiceFault> createBusServiceFault(BusServiceFault value) {
        return new JAXBElement<BusServiceFault>(_BusServiceFault_QNAME, BusServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCiudadSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "ArrayOfCiudadSvc")
    public JAXBElement<ArrayOfCiudadSvc> createArrayOfCiudadSvc(ArrayOfCiudadSvc value) {
        return new JAXBElement<ArrayOfCiudadSvc>(_ArrayOfCiudadSvc_QNAME, ArrayOfCiudadSvc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ButacaSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "ButacaSvc")
    public JAXBElement<ButacaSvc> createButacaSvc(ButacaSvc value) {
        return new JAXBElement<ButacaSvc>(_ButacaSvc_QNAME, ButacaSvc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "Dominio", scope = UnidadSvc.class)
    public JAXBElement<String> createUnidadSvcDominio(String value) {
        return new JAXBElement<String>(_UnidadSvcDominio_QNAME, String.class, UnidadSvc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "Tipo", scope = UnidadSvc.class)
    public JAXBElement<String> createUnidadSvcTipo(String value) {
        return new JAXBElement<String>(_UnidadSvcTipo_QNAME, String.class, UnidadSvc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "Marca", scope = UnidadSvc.class)
    public JAXBElement<String> createUnidadSvcMarca(String value) {
        return new JAXBElement<String>(_UnidadSvcMarca_QNAME, String.class, UnidadSvc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "Error", scope = Resultado.class)
    public JAXBElement<String> createResultadoError(String value) {
        return new JAXBElement<String>(_ResultadoError_QNAME, String.class, Resultado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Faults", name = "ErrorMessage", scope = BusServiceFault.class)
    public JAXBElement<String> createBusServiceFaultErrorMessage(String value) {
        return new JAXBElement<String>(_BusServiceFaultErrorMessage_QNAME, String.class, BusServiceFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data", name = "Descripcion", scope = CiudadSvc.class)
    public JAXBElement<String> createCiudadSvcDescripcion(String value) {
        return new JAXBElement<String>(_CiudadSvcDescripcion_QNAME, String.class, CiudadSvc.class, value);
    }

}
