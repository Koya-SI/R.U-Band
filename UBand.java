public class UBand {
    public String code = "NSUB3605";
    public String name = "Uバンド3ミリ";
    public String spec = "3X40Xφ60.5";
    public Bolt bolt;
    public int qty;

    // TODO colorSign 未実装
    // colorSignの値が1だった場合の正式品名は「Uバンド3ミリ塗装(茶色)」、品目コードは「NSUB3605T」とする
    UBand(int uBand) {
        this.qty = uBand;
        bolt(1);
    }

    private Bolt bolt(int qty){
        return bolt;
    }
}