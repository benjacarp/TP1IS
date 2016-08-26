
package service.contracts.service.istp1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfButacaSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfUnidadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.Resultado;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.contracts.service.istp1 package. 
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

    private final static QName _ObtenerCiudadesCodigo_QNAME = new QName("http://ISTP1.Service.Contracts.Service", "codigo");
    private final static QName _ObtenerUnidadesResponseObtenerUnidadesResult_QNAME = new QName("http://ISTP1.Service.Contracts.Service", "ObtenerUnidadesResult");
    private final static QName _ObtenerButacasResponseObtenerButacasResult_QNAME = new QName("http://ISTP1.Service.Contracts.Service", "ObtenerButacasResult");
    private final static QName _ObtenerCiudadesResponseObtenerCiudadesResult_QNAME = new QName("http://ISTP1.Service.Contracts.Service", "ObtenerCiudadesResult");
    private final static QName _ReservarButacasResponseReservarButacasResult_QNAME = new QName("http://ISTP1.Service.Contracts.Service", "ReservarButacasResult");
    private final static QName _VincularUnidadResponseVincularUnidadResult_QNAME = new QName("http://ISTP1.Service.Contracts.Service", "VincularUnidadResult");
    private final static QName _ReservarButacasButacas_QNAME = new QName("http://ISTP1.Service.Contracts.Service", "butacas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.contracts.service.istp1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerCiudades }
     * 
     */
    public ObtenerCiudades createObtenerCiudades() {
        return new ObtenerCiudades();
    }

    /**
     * Create an instance of {@link ObtenerUnidadesResponse }
     * 
     */
    public ObtenerUnidadesResponse createObtenerUnidadesResponse() {
        return new ObtenerUnidadesResponse();
    }

    /**
     * Create an instance of {@link VincularUnidadResponse }
     * 
     */
    public VincularUnidadResponse createVincularUnidadResponse() {
        return new VincularUnidadResponse();
    }

    /**
     * Create an instance of {@link ObtenerButacas }
     * 
     */
    public ObtenerButacas createObtenerButacas() {
        return new ObtenerButacas();
    }

    /**
     * Create an instance of {@link ObtenerButacasResponse }
     * 
     */
    public ObtenerButacasResponse createObtenerButacasResponse() {
        return new ObtenerButacasResponse();
    }

    /**
     * Create an instance of {@link ReservarButacas }
     * 
     */
    public ReservarButacas createReservarButacas() {
        return new ReservarButacas();
    }

    /**
     * Create an instance of {@link ObtenerCiudadesResponse }
     * 
     */
    public ObtenerCiudadesResponse createObtenerCiudadesResponse() {
        return new ObtenerCiudadesResponse();
    }

    /**
     * Create an instance of {@link ReservarButacasResponse }
     * 
     */
    public ReservarButacasResponse createReservarButacasResponse() {
        return new ReservarButacasResponse();
    }

    /**
     * Create an instance of {@link ObtenerUnidades }
     * 
     */
    public ObtenerUnidades createObtenerUnidades() {
        return new ObtenerUnidades();
    }

    /**
     * Create an instance of {@link VincularUnidad }
     * 
     */
    public VincularUnidad createVincularUnidad() {
        return new VincularUnidad();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "codigo", scope = ObtenerCiudades.class)
    public JAXBElement<String> createObtenerCiudadesCodigo(String value) {
        return new JAXBElement<String>(_ObtenerCiudadesCodigo_QNAME, String.class, ObtenerCiudades.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnidadSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "ObtenerUnidadesResult", scope = ObtenerUnidadesResponse.class)
    public JAXBElement<ArrayOfUnidadSvc> createObtenerUnidadesResponseObtenerUnidadesResult(ArrayOfUnidadSvc value) {
        return new JAXBElement<ArrayOfUnidadSvc>(_ObtenerUnidadesResponseObtenerUnidadesResult_QNAME, ArrayOfUnidadSvc.class, ObtenerUnidadesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfButacaSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "ObtenerButacasResult", scope = ObtenerButacasResponse.class)
    public JAXBElement<ArrayOfButacaSvc> createObtenerButacasResponseObtenerButacasResult(ArrayOfButacaSvc value) {
        return new JAXBElement<ArrayOfButacaSvc>(_ObtenerButacasResponseObtenerButacasResult_QNAME, ArrayOfButacaSvc.class, ObtenerButacasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "codigo", scope = VincularUnidad.class)
    public JAXBElement<String> createVincularUnidadCodigo(String value) {
        return new JAXBElement<String>(_ObtenerCiudadesCodigo_QNAME, String.class, VincularUnidad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCiudadSvc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "ObtenerCiudadesResult", scope = ObtenerCiudadesResponse.class)
    public JAXBElement<ArrayOfCiudadSvc> createObtenerCiudadesResponseObtenerCiudadesResult(ArrayOfCiudadSvc value) {
        return new JAXBElement<ArrayOfCiudadSvc>(_ObtenerCiudadesResponseObtenerCiudadesResult_QNAME, ArrayOfCiudadSvc.class, ObtenerCiudadesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "ReservarButacasResult", scope = ReservarButacasResponse.class)
    public JAXBElement<Resultado> createReservarButacasResponseReservarButacasResult(Resultado value) {
        return new JAXBElement<Resultado>(_ReservarButacasResponseReservarButacasResult_QNAME, Resultado.class, ReservarButacasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "VincularUnidadResult", scope = VincularUnidadResponse.class)
    public JAXBElement<Resultado> createVincularUnidadResponseVincularUnidadResult(Resultado value) {
        return new JAXBElement<Resultado>(_VincularUnidadResponseVincularUnidadResult_QNAME, Resultado.class, VincularUnidadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "codigo", scope = ObtenerButacas.class)
    public JAXBElement<String> createObtenerButacasCodigo(String value) {
        return new JAXBElement<String>(_ObtenerCiudadesCodigo_QNAME, String.class, ObtenerButacas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "butacas", scope = ReservarButacas.class)
    public JAXBElement<ArrayOfint> createReservarButacasButacas(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ReservarButacasButacas_QNAME, ArrayOfint.class, ReservarButacas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "codigo", scope = ReservarButacas.class)
    public JAXBElement<String> createReservarButacasCodigo(String value) {
        return new JAXBElement<String>(_ObtenerCiudadesCodigo_QNAME, String.class, ReservarButacas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ISTP1.Service.Contracts.Service", name = "codigo", scope = ObtenerUnidades.class)
    public JAXBElement<String> createObtenerUnidadesCodigo(String value) {
        return new JAXBElement<String>(_ObtenerCiudadesCodigo_QNAME, String.class, ObtenerUnidades.class, value);
    }

}
