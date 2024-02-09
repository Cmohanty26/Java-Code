
    abstract class Telephone{
        abstract void ring();
        abstract void lift();
        abstract void disconnect();
    }
    class SmartPhone extends Telephone{
        @Override
        void ring() {
            System.out.println("Ringing...");
        }

        @Override
        void lift() {
            System.out.println("picking up the call ");
        }

        @Override
        void disconnect() {

            System.out.println("Disconnecting the call...");
        }
        void openGps(){

            System.out.println("Opening the MAPS..");
        }
    }
    public class practice86 {
        public static void main(String[] args) {
            Telephone t= new SmartPhone();
            //t.openGps();//--> this will throw an error cz telephone doesn't have openGps() method.
            t.lift();

        }
    }



