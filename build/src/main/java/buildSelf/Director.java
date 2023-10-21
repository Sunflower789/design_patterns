package buildSelf;

import com.sun.deploy.util.StringUtils;

/**
 * 指挥者  可要可不要
 * */
public class Director {
    private CarBuild carBuild;

    public Director(CarBuild carBuild) {
        this.carBuild = carBuild;
    }

    public Car createCar(String door,String window,String avnt){
        if(door != null && !"".equals(door)){
            carBuild.door(door);
        }
        if(window != null && !"".equals(window)){
            carBuild.window(window);
        }
        if(avnt != null && !"".equals(avnt)){
            carBuild.avnt(avnt);
        }
        return carBuild.build();
    }
}
