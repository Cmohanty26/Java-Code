public class Builder {
    public static void main(String[] args) {
        StringBuilder pi=new StringBuilder("chadan");
        for (int i=0;i<pi.length()/2;i++){
            int front=i;
            int back=pi.length()-1-i;
            char frontChar=pi.charAt(front);
            char backChar=pi.charAt(back);
            pi.setCharAt(front,backChar);
            pi.setCharAt(back,frontChar);
        }
        System.out.println(pi);
      /*  System.out.println(pi);
        pi.insert(0,'p');
        System.out.println(pi);
        pi.delete(0,1);
        System.out.println(pi);
        // char at index o
        System.out.println(pi.charAt(0));
        //set char at index 0
        pi.setCharAt(0,'m');
        pi.setCharAt(1,'o');
        pi.setCharAt(2,'h');
        pi.setCharAt(3,'a');
        pi.setCharAt(4,'n');
        pi.setCharAt(5,'t');
        pi.setCharAt(6,'y');
        System.out.println(pi);*/
    }
}
