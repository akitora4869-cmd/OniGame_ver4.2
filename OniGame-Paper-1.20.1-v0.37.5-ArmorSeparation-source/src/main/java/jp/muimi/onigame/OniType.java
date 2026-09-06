package jp.muimi.onigame;
public enum OniType {
    DAKKO("堕狐"), KISHIN("鬼神"), SHIKKI("疾鬼"), YUUKI("幽鬼"), JAKUTSUKI("蛇窟姫");
    public final String display;
    OniType(String display) { this.display = display; }
    public static OniType parse(String s) {
        if (s == null) return null;
        return switch (s.toLowerCase()) { case "dakko", "堕狐" -> DAKKO; case "kishin", "鬼神" -> KISHIN; case "shikki", "疾鬼", "しっき" -> SHIKKI; case "yuuki", "幽鬼", "ゆうき" -> YUUKI; case "jakutsuki", "蛇窟姫", "ジャクツキ" -> JAKUTSUKI; default -> null; };
    }
}
