package org.siemens.restservice;
import java.util.Arrays;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class DonorServiceClient {
	   private final String donorServiceHost;
	    private final int donorServicePort;

	    public DonorServiceClient(String donorServiceHost, int donorServicePort) {
	        this.donorServiceHost = donorServiceHost;
	        this.donorServicePort = donorServicePort;
	    }
	    public DonorReference requestDonor(String id){
	        RestTemplate restTemplate = new RestTemplate(Arrays.asList(new MappingJackson2HttpMessageConverter()));
	        DonorReference donorReference = restTemplate.getForObject("http://{host}:{port}/donors/{id}",
	                DonorReference.class, donorServiceHost, donorServicePort, id);
	        return donorReference;
	    }

}
