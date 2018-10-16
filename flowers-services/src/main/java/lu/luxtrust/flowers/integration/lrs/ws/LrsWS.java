package lu.luxtrust.flowers.integration.lrs.ws;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-24T14:19:34.972+02:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://ws.lrs.luxtrust.lu/", name = "LrsWS")
@XmlSeeAlso({ObjectFactory.class})
public interface LrsWS {

    @WebMethod(operationName = "sendCodes")
    @RequestWrapper(localName = "sendCodes", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.SendCodes")
    @ResponseWrapper(localName = "sendCodesResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.SendCodesResponse")
    public Response<lu.luxtrust.flowers.integration.lrs.ws.SendCodesResponse> sendCodesAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order
    );

    @WebMethod(operationName = "sendCodes")
    @ResponseWrapper(localName = "sendCodesResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.SendCodesResponse")
    @RequestWrapper(localName = "sendCodes", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.SendCodes")
    public Future<?> sendCodesAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<lu.luxtrust.flowers.integration.lrs.ws.SendCodesResponse> asyncHandler
    );

    @WebMethod
    @Action(input = "http://ws.lrs.luxtrust.lu/LrsWS/sendCodesRequest", output = "http://ws.lrs.luxtrust.lu/LrsWS/sendCodesResponse")
    @RequestWrapper(localName = "sendCodes", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.SendCodes")
    @ResponseWrapper(localName = "sendCodesResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.SendCodesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public lu.luxtrust.flowers.integration.lrs.ws.LrsWSCodesResult sendCodes(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order
    );

    @WebMethod(operationName = "getOrder")
    @RequestWrapper(localName = "getOrder", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetOrder")
    @ResponseWrapper(localName = "getOrderResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetOrderResponse")
    public Response<lu.luxtrust.flowers.integration.lrs.ws.GetOrderResponse> getOrderAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "ssn", targetNamespace = "")
        java.lang.String ssn
    );

    @WebMethod(operationName = "getOrder")
    @ResponseWrapper(localName = "getOrderResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetOrderResponse")
    @RequestWrapper(localName = "getOrder", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetOrder")
    public Future<?> getOrderAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "ssn", targetNamespace = "")
        java.lang.String ssn,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<lu.luxtrust.flowers.integration.lrs.ws.GetOrderResponse> asyncHandler
    );

    @WebMethod
    @Action(input = "http://ws.lrs.luxtrust.lu/LrsWS/getOrderRequest", output = "http://ws.lrs.luxtrust.lu/LrsWS/getOrderResponse")
    @RequestWrapper(localName = "getOrder", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetOrder")
    @ResponseWrapper(localName = "getOrderResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetOrderResponse")
    @WebResult(name = "return", targetNamespace = "")
    public lu.luxtrust.flowers.integration.lrs.ws.LrsWSOrderResult getOrder(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "ssn", targetNamespace = "")
        java.lang.String ssn
    );

    @WebMethod(operationName = "cancel")
    @RequestWrapper(localName = "cancel", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.Cancel")
    @ResponseWrapper(localName = "cancelResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.CancelResponse")
    public Response<lu.luxtrust.flowers.integration.lrs.ws.CancelResponse> cancelAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order,
        @WebParam(name = "rao", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSSignature rao,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.String version
    );

    @WebMethod(operationName = "cancel")
    @ResponseWrapper(localName = "cancelResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.CancelResponse")
    @RequestWrapper(localName = "cancel", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.Cancel")
    public Future<?> cancelAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order,
        @WebParam(name = "rao", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSSignature rao,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.String version,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<lu.luxtrust.flowers.integration.lrs.ws.CancelResponse> asyncHandler
    );

    @WebMethod
    @Action(input = "http://ws.lrs.luxtrust.lu/LrsWS/cancelRequest", output = "http://ws.lrs.luxtrust.lu/LrsWS/cancelResponse")
    @RequestWrapper(localName = "cancel", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.Cancel")
    @ResponseWrapper(localName = "cancelResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.CancelResponse")
    @WebResult(name = "return", targetNamespace = "")
    public lu.luxtrust.flowers.integration.lrs.ws.LrsWSCancelResult cancel(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order,
        @WebParam(name = "rao", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSSignature rao,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.String version
    );

    @WebMethod(operationName = "getVersion")
    @RequestWrapper(localName = "getVersion", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetVersion")
    @ResponseWrapper(localName = "getVersionResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetVersionResponse")
    public Response<lu.luxtrust.flowers.integration.lrs.ws.GetVersionResponse> getVersionAsync();

    @WebMethod(operationName = "getVersion")
    @ResponseWrapper(localName = "getVersionResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetVersionResponse")
    @RequestWrapper(localName = "getVersion", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetVersion")
    public Future<?> getVersionAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<lu.luxtrust.flowers.integration.lrs.ws.GetVersionResponse> asyncHandler
    );

    @WebMethod
    @Action(input = "http://ws.lrs.luxtrust.lu/LrsWS/getVersionRequest", output = "http://ws.lrs.luxtrust.lu/LrsWS/getVersionResponse")
    @RequestWrapper(localName = "getVersion", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetVersion")
    @ResponseWrapper(localName = "getVersionResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetVersionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getVersion();

    @WebMethod(operationName = "getProduct")
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetProductResponse")
    public Response<lu.luxtrust.flowers.integration.lrs.ws.GetProductResponse> getProductAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order
    );

    @WebMethod(operationName = "getProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetProductResponse")
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetProduct")
    public Future<?> getProductAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<lu.luxtrust.flowers.integration.lrs.ws.GetProductResponse> asyncHandler
    );

    @WebMethod
    @Action(input = "http://ws.lrs.luxtrust.lu/LrsWS/getProductRequest", output = "http://ws.lrs.luxtrust.lu/LrsWS/getProductResponse")
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetProductResponse")
    @WebResult(name = "return", targetNamespace = "")
    public lu.luxtrust.flowers.integration.lrs.ws.LrsWSProductResult getProduct(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order
    );

    @WebMethod(operationName = "getStatus")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetStatus")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetStatusResponse")
    public Response<lu.luxtrust.flowers.integration.lrs.ws.GetStatusResponse> getStatusAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order
    );

    @WebMethod(operationName = "getStatus")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetStatusResponse")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetStatus")
    public Future<?> getStatusAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<lu.luxtrust.flowers.integration.lrs.ws.GetStatusResponse> asyncHandler
    );

    @WebMethod
    @Action(input = "http://ws.lrs.luxtrust.lu/LrsWS/getStatusRequest", output = "http://ws.lrs.luxtrust.lu/LrsWS/getStatusResponse")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetStatus")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.GetStatusResponse")
    @WebResult(name = "return", targetNamespace = "")
    public lu.luxtrust.flowers.integration.lrs.ws.LrsWSStatusResult getStatus(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        java.lang.String order
    );

    @WebMethod(operationName = "register")
    @RequestWrapper(localName = "register", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.RegisterResponse")
    public Response<lu.luxtrust.flowers.integration.lrs.ws.RegisterResponse> registerAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSOrder order,
        @WebParam(name = "rao", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSSignature rao,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.String version
    );

    @WebMethod(operationName = "register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.RegisterResponse")
    @RequestWrapper(localName = "register", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.Register")
    public Future<?> registerAsync(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSOrder order,
        @WebParam(name = "rao", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSSignature rao,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.String version,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<lu.luxtrust.flowers.integration.lrs.ws.RegisterResponse> asyncHandler
    );

    @WebMethod
    @Action(input = "http://ws.lrs.luxtrust.lu/LrsWS/registerRequest", output = "http://ws.lrs.luxtrust.lu/LrsWS/registerResponse")
    @RequestWrapper(localName = "register", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://ws.lrs.luxtrust.lu/", className = "lu.luxtrust.flowers.integration.lrs.ws.RegisterResponse")
    @WebResult(name = "return", targetNamespace = "")
    public lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegisterResult register(
        @WebParam(name = "ra", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSRegistrationAuthority ra,
        @WebParam(name = "order", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSOrder order,
        @WebParam(name = "rao", targetNamespace = "")
        lu.luxtrust.flowers.integration.lrs.ws.LrsWSSignature rao,
        @WebParam(name = "version", targetNamespace = "")
        java.lang.String version
    );
}