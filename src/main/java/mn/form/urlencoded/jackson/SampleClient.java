package mn.form.urlencoded.jackson;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import reactor.core.publisher.Mono;

@Client("/echo")
public interface SampleClient {

    @Post(produces = MediaType.APPLICATION_FORM_URLENCODED, consumes = MediaType.APPLICATION_JSON)
    Mono<SampleDto> echo(@Body SampleDto sampleDto);
}
