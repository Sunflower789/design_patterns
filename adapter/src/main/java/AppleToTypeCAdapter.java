/**
 * 适配器类
 * */
public class AppleToTypeCAdapter extends ApplePlug{

    private TypeCPlug typeCPlug;

    public AppleToTypeCAdapter(TypeCPlug typeCPlug) {
        this.typeCPlug = typeCPlug;
    }

    @Override
    public void charge() {
        System.out.println("use apple-interface Type-C but change to apple-interface");
        typeCPlug.charge();
    }
}
