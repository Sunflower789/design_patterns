/**
 * 代理类
 * */
public class AgentSeller implements Seller{

    RealSeller realSeller = new RealSeller();

    public void sell() {
        realSeller.sell();
        System.out.println("and provide other services");
    }
}
