interface TvRemote{
    void remote();
}
interface SmartTvRemote extends TvRemote{
    void smartremote();
}
class TV implements TvRemote {
    public void remote(){
        System.out.println("Remote...");
    }
}

public class practice90 {
    public static void main(String[] args) {
        TV t1=new TV();
        t1.remote();
    }
}
