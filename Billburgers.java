public class Billburgers {
    public static void main(String[] args) {
        int VegBurgerCost=4*45;
        int VegMcpuffCost=3*25;
        int total=VegBurgerCost+VegMcpuffCost;
        int amt=total-50;
        System.out.println("4 vegetable Burgers @45="+VegBurgerCost);
        System.out.println("3 vegetable Mcpuff @25="+VegMcpuffCost);
        System.out.println("Total="+total);
        System.out.println("Discount=50");
        System.out.println("Final bill ="+ amt);
    }
}
