package mn.form.urlencoded.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import reactor.core.publisher.Mono;

@Client("/echo")
public interface SampleClient {

    @Post(produces = MediaType.APPLICATION_FORM_URLENCODED, consumes = MediaType.APPLICATION_JSON)
    Mono<SampleDto> echo(@Body SampleDto sampleDto);

    @Introspected
    class SampleDto {

        @JsonProperty("some_attribute")
        private String someAttribute;

        public SampleDto() {
        }

        public SampleDto(String someAttribute) {
            this.someAttribute = someAttribute;
        }

        public String getSome_attribute() {
            return someAttribute;
        }

        public void setSomeAttribute(String someAttribute) {
            this.someAttribute = someAttribute;
        }
    }
}
