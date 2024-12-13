package ma.ensa.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
public class CountryClient extends WebServiceGatewaySupport {
    public GetCountryResponse getCountry(GetCountryRequest request) {
        GetCountryResponse response = (GetCountryResponse)
                getWebServiceTemplate()
                        .marshalSendAndReceive(request);
        return response; }
}
