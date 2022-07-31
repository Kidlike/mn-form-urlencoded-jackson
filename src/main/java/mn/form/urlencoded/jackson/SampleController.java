package mn.form.urlencoded.jackson;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import mn.form.urlencoded.jackson.SampleClient.SampleDto;
import reactor.core.publisher.Mono;

@Controller("echo")
public class SampleController {

    @Post(consumes = MediaType.APPLICATION_FORM_URLENCODED)
    public Mono<SampleDto> echo(@Body SampleDto sampleDto) {
        return Mono.just(sampleDto);
    }
}
