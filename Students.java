public class Students {
    String FirstName;
    String LastName;
    int marks;
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
    public void setMarks(int marks){
        if (marks<0 || marks>100)
            this.marks=0;
        else
            this.marks=marks;
    }
    public boolean isPass(){
        if (marks>35 && marks<=100)
            return true;
        else
            return false;
    }
    public String getFullName(){
        String first=getFirstName();
        String last=getLastName();
        if (first.isEmpty() && last.isEmpty())
            return " ";
        else if (last.isEmpty())
            return first;
        else if (first.isEmpty())
            return last;
        else
            return first+" "+last;

    }

    public static void main(String[] args) {
        Students s1=new Students();
        s1.setFirstName(" ");
        s1.setLastName(" ");
        s1.setMarks(10);
        System.out.println("fullName="+s1.getFullName());
        System.out.println("pass="+s1.isPass());
        s1.setFirstName("Chandan");
        s1.setMarks(80);
        System.out.println("fullName="+s1.getFullName());
        System.out.println("pass="+s1.isPass());
        s1.setLastName("Mohanty");
        System.out.println("fullName="+s1.getFullName());
    }
}
