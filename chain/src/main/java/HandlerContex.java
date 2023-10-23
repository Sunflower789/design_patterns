import java.util.ArrayList;
import java.util.List;

public class HandlerContex {
    private List<Handler> handlers = new ArrayList<Handler>();

    public void addHandler(Handler handler){
        handlers.add(handler);
    }

    public void process(){
        for (Handler handler : handlers) {
            handler.processHandler();
        }
    }
}
