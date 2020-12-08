package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
@Slf4j
public class BeerDtoTest extends BaseTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto=getDto();
        String jsonString=objectMapper.writeValueAsString(beerDto);
        log.info("JSON String :\t"+jsonString);
    }

    @Test
    void testDeSerialize() throws IOException {
        String jsonString="{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123456788,\"price\":\"12.99\",\"createdDate\":\"2020-12-08T22:05:51+0530\",\"lastUpdatedDate\":\"2020-12-08T22:05:51.6826572+05:30\",\"myLocalDate\":\"20201208\",\"beerId\":\"eae59835-6998-43c7-ad89-1b3d9c939d41\"}";
        BeerDto beerDto=objectMapper.readValue(jsonString,BeerDto.class);
        log.info("Beer DTO :\t"+beerDto);
    }
}
