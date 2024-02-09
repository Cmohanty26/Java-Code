public class Methodoverloading {
    public static void main(String[] args) {
        String Name="Chandan";
        int Age=21;
        char Grade='A';
        double height=180;
        DisplayDetails(Name,Age,Grade,height);
        DisplayDetails(Name,Age,Grade);
        DisplayDetails(Name,Age);
        DisplayDetails(Name);
        DisplayDetails();
    }
    public static void DisplayDetails(String UserName,int UserAge,char Grade,double height){
        System.out.println("The Name is:" + UserName + "The Age is:"+ UserAge + "The grade is:"+ Grade + "The height is:"+ height);
    }
    public static void DisplayDetails(String UserName,int UserAge,char Grade){
        System.out.println("The Name is:"+ UserName + "The Age is:"+ UserAge + "The grade is:" + Grade);
    }
    public static void DisplayDetails(String UserName,int UserAge){
        System.out.println("The Name is:"+ UserName + "The Age is:"+ UserAge );
    }
    public static void DisplayDetails(String UserName){
        System.out.println("The Name is:"+ UserName  );
    }
    public static void DisplayDetails(){
        System.out.println("You can go now" );
    }


}
