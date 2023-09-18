package hw7.l;

public abstract class TarifBase {
    public void incommingCall(){
        System.out.println("В тарифный план входят безлимитные входящие звонки");
    }
    public void outgoingCall(){
        System.out.println("В тарифный план входят безлимитные исходящие звонки");
    }

}
