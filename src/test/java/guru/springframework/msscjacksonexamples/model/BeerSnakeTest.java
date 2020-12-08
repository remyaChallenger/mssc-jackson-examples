package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
@Slf4j
public class BeerSnakeTest extends BaseTest {

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto dto=getDto();
        String json=objectMapper.writeValueAsString(dto);
        log.info(json);

    }
}
