/*
package utils.RestActions;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.HttpUrl;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import domain.Pojos.DonorReference;
import org.junit.jupiter.api.Assertions;


import java.io.IOException;
import static org.assertj.core.api.Assertions.assertThat;

public class DonorReferenceServiceClientTest {

    private MockWebServer donorService;
    private DonorServiceClient donorClient;

    @Before
    public void init() throws IOException {
        donorService = new MockWebServer();
        donorService.start(); //search for an available port
        HttpUrl baseUrl = donorService.url("/donors/");
        donorClient = new DonorServiceClient(baseUrl.host(), baseUrl.port());
    }

    @Test
    public void requestDonor() throws JsonProcessingException {
        DonorReference expectedDonorRef = new DonorReference().setId("123").setHref("http://donors.lifenethealth.org/123");
        String json = new ObjectMapper().writeValueAsString(expectedDonorRef);
        donorService.enqueue(new MockResponse()
                .addHeader("Content-Type", "application/json")
                .setBody(json));

        DonorReference retrievedDonorRef = donorClient.requestDonor("123");

        Assertions.assertThat(retrievedDonorRef.getId()).isEqualTo(expectedDonorRef.getId());
        Assertions.assertThat(retrievedDonorRef.getHref()).isEqualTo(expectedDonorRef.getHref());
        
        System.out.println(json);
    }
}

*/
