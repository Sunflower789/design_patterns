package buildSelf;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 产品类
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String door;
    private String window;
    private String avnt;

    @JsonIgnore
    public static CarBuild carBuild = new CarBuildImpl();
}
