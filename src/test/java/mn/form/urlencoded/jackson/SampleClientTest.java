package mn.form.urlencoded.jackson;

import static org.assertj.core.api.Assertions.assertThat;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class SampleClientTest {

    @Inject
    SampleClient sampleClient;

    /**
     * This test fails, because the body gets serialized as:
     * <pre>
     *     someAttribute=hello+world
     * </pre>
     *
     * The intention is that the client should serialize the body as:
     * <pre>
     *     some_attribute=hello+world
     * </pre>
     */
    @Test
    void echoTest_dtoRequestBody() {
        SampleDto sampleDto = sampleClient.echo(new SampleDto("hello world")).block();

        // ideally we should assert just the serialization part of the client here...
        assertThat(sampleDto).hasFieldOrPropertyWithValue("someAttribute", "hello world");
    }
}
