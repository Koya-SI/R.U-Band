public class Main{
        public static void main (String [] args){
                Bolt bolt = new Bolt(2);
                RBand rBand = new RBand(2);
                UBand uBand = new UBand(1);

                System.out.println(rBand.code);
                System.out.println(rBand.name);
                System.out.println(rBand.spec);
                System.out.println(rBand.qty);

                System.out.println(uBand.code);
                System.out.println(uBand.name);
                System.out.println(uBand.spec);
                System.out.println(uBand.qty);

                System.out.println(bolt.code);
                System.out.println(bolt.name);
                System.out.println(bolt.spec);
                System.out.println(bolt.qty);
        }
}