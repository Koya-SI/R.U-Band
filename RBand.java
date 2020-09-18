public class RBand {
    public String code = "NSRB605";
    public String name = "Rバンド(信号(R)ﾘﾌﾞ用)";
    public String spec = "φ60.5";
    public Bolt bolt;
    public int qty;

    // TODO colorSign 未実装
    // colorSignの値が1だった場合の正式品名は「Rバンド塗装(茶色)(信号(R)ﾘﾌﾞ用)」、品目コードは「NSRB605T」とする
    RBand(int rBand) {
        this.qty = rBand;
        bolt(1);
    }

    private Bolt bolt(int qty){
        return bolt;
    }
}