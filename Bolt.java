public class Bolt {
    public String code = "NSBNZ3832";
    public String name = "AWS";
    public String spec = "S/W";
    public int qty;

    Bolt(int uBand) {
        this.qty = uBand * 2;
    }
}