package mn.form.urlencoded.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class SampleDto {

    @JsonProperty("some_attribute")
    private String someAttribute;

    public SampleDto() {
    }

    public SampleDto(String someAttribute) {
        this.someAttribute = someAttribute;
    }

    public String getSomeAttribute() {
        return someAttribute;
    }

    public void setSomeAttribute(String someAttribute) {
        this.someAttribute = someAttribute;
    }
}
