public class AdapterExample {
    public static void main(String[] args) {
        ApplePhone applePhone = new ApplePhone();
        TypeCPlug typeCPlug = new TypeCPlug();
        AppleToTypeCAdapter appleToTypeCAdapter = new AppleToTypeCAdapter(typeCPlug);
        // 使用苹果适配器 就可以在typeC接口上充电了
        appleToTypeCAdapter.charge();
    }
}
