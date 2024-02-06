package baseball;

public class BaseBallTeam {
//フィールドの作成
    private String name; //チーム名
    private int win;     //勝ち数
    private int lose;    //負け数
    private int draw;    //引き分け数

    //引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;

    }

    //勝率メソッドの作成
    public static double getRate(int win,int lose){
        double result = (double) win/( win + lose);
        return result;
    }

    //レポートのメソッド成績の詳細表示する
    public void report() {
    double result;
    result = getRate(win,lose);
    System.out.println (name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + result + "です。");
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }



}


