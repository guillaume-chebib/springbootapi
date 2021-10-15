package fr.poly.mtp.ig5.iwa.springbootapi.userTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // launch test on random server port
public class UnitTestUser {

    @LocalServerPort
    private int port; //get test port number

    @Autowired
    private TestRestTemplate testRestTemplate;

    /**
     * Test if the following text is returned from the host
     */
    @Test
    public void testHelloWorld(){
        assertEquals("Hello World",testRestTemplate.getForObject("http://localhost:"+port+"/", String.class));
    }


}
