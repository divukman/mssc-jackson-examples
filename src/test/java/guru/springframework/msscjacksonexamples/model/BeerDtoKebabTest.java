package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testKebabCase() throws JsonProcessingException {
        final BeerDto beerDto = getDto();

        System.out.println(objectMapper.writeValueAsString(beerDto));
    }
}
