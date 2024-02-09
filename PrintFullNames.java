public class PrintFullNames
{
    String FirstName;
    String LastName;
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String firstName){
        this.FirstName=firstName;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String lastName){
        this.LastName=lastName;
    }
    public String getName(){
        return getFirstName()+" "+ getLastName();
    }

    public static void main(String[] args) {
        PrintFullNames obj=new PrintFullNames();
        obj.setFirstName("Chandan");
        obj.setLastName("Mohanty");
        String name= obj.getName();
        System.out.println("Your name is:"+name);
    }

}

