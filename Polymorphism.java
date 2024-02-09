class Cricket{
    public String FormatName;

    public Cricket(String formatName) {
        FormatName = formatName;
    }
    public String rule(){
        return "cricket is an outdoor sports played between 11th two teams of 11 players each";
    }
}
class testMatch extends Cricket{
    public testMatch(){
        super("Test Match");
    }
    public String rule(){
        return "played for 5 days,no fixed number over for a team";
    }
}
class oneDay extends Cricket{
    public oneDay(){
        super("One Day International");
    }
    @Override
    public String rule(){
        return "played for 1 day, 50 over per a team";
    }
}
class T20 extends Cricket{
    public T20(){
        super("Twenty Twenty");
    }
    @Override
    public String rule(){
        return "Played for 1 day,20 over per a team";
    }
}
class IPL extends Cricket {
    public IPL() {
        super("Indian Premier League");
    }

    @Override
    public String rule() {
        return "Played for 1 day,20 over per a team,but count in international match";
    }
}
class Gully extends Cricket {
    public Gully() {
        super("Gully");
    }


}



public class Polymorphism {
    public static void main(String[] args) {
for (int i=1;i<=10;i++){
    Cricket cricket=randomMatch();
    System.out.println("Format type" + i +" is: "+ cricket.FormatName +"The Rule is:"+cricket.rule());
}
    }
    public static Cricket randomMatch(){
        int randomNumber=(int) (Math.random()*5)+1;
        System.out.println("The random number is:"+randomNumber);
        switch (randomNumber){
            case 1:
                return new testMatch();
            case 2:
                return new oneDay();
            case 3:
                return new T20();
            case 4:
                return new IPL();
            case 5:
                return new Gully();
            default:
                return null;
        }
    }
}
