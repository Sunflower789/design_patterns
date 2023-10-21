package buildAnnotation;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Car {
    private String door;
    private String window;
    private String avnt;
}
