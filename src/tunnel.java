import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liohp = 60;
        int galohp = 80;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int sum = 30;
        int rgalo = 0;
        int rlio = 0;
        int galoattack = 0;
        int lioattack = 0;
        int[] hands = { 1, 3, 5, 8, 2, 6, 4, 7, 9, 10, 11, 12, 13,};
        Random r = new Random();
        Random random1 = new Random();
        Random ralo1 = new Random();
        for (int x = 0; x < sum; x++) {
            int hand = hands[r.nextInt(13)];
            int randomValue = random1.nextInt(50);
            System.out.println("ガロ「どの方向へ進もうか。。」");
            System.out.println("右へ進む：1 、まっすぐ進む：2、左へ進む：3");
            System.out.print("方向を数字で入力→ ");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("ガロ「ん？何か見えるぞ？」");
                    if (hand >= 3) {
                        System.out.println("リオ「おい何か来るぞ。気を付けろ！」");
                        System.out.println("リオ「モンスターだ！」");
                        int monsterhp = randomValue;
                            boolean flag = true;
                            while (flag) {
                                System.out.println("ガロのHP：" + galohp);
                                System.out.println("リオのHP：" + liohp);
                                System.out.println("");
                                System.out.println("モンスターのHP：" + monsterhp);
                                System.out.println("\nどうする？ 1：たたかう 2：にげる");
                                System.out.print("コマンドを数字で入力→ ");
                                c = scanner.nextInt();
                                switch (c) {
                                    case 1:
                                        if (galohp > 0) {
                                            System.out.println("ガロのこうげき！");
                                            rgalo = ralo1.nextInt(20);
                                            galoattack = rgalo;
                                            System.out.println("モンスターへ" + galoattack + "のダメージ！");
                                        }
                                        if (liohp > 0) {
                                            monsterhp -= galoattack;
                                            System.out.println("リオのこうげき！");
                                            rlio = ralo1.nextInt(20);
                                            lioattack = rlio;
                                            System.out.println("モンスターへ" + lioattack + "のダメージ！");
                                            monsterhp -= lioattack;
                                        }
                                        if (monsterhp <= 0) {
                                            System.out.println("\nガロ達はモンスターをやっつけた！");
                                            d = hand / 2;
                                            sum -= (d + hand);
                                            flag = false;
                                            break;
                                        }
                                            System.out.println("\n\n\nモンスターのこうげき！");
                                            galohp -= 5;
                                            liohp -= 5;
                                            System.out.println("\nガロとリオは５のダメージを受けた");
                                            if (galohp <= 0 && liohp <= 0) {
                                                System.out.println("\nパーティーはぜんめつした…。");
                                                flag = false;
                                            }
                                            break;
                                    case 2: {
                                             System.out.println("\nガロ達はにげだした！");
                                             sum += hand;
                                             flag = false;
                                             break;}
                                    default:
                                            System.out.print("リオ「おい、なにボサっとしているんだ。操縦はお前の担当だろ。」→ ");
                                }
                            }
                    } else {
                        System.out.println("ガロ「ラッキー！宝箱だ！」");
                        System.out.println("ガロ「隊長の。。グラサン？」");
                        sum  -= hand;
                    }
                    break;
                case 2:
                    if (hand >= 4) {
                        System.out.println("リオ「おい何か来るぞ。気を付けろ！」");
                        System.out.println("リオ「モンスターだ！」");
                        int monsterhp = randomValue;
                        boolean flag = true;
                        while (flag) {
                            System.out.println("ガロのHP：" + galohp);
                            System.out.println("リオのHP：" + liohp);
                            System.out.println("");
                            System.out.println("モンスターのHP：" + monsterhp);
                            System.out.println("\nどうする？ 1：たたかう 2：にげる");
                            System.out.print("コマンドを数字で入力→ ");
                            c = scanner.nextInt();
                            switch (c) {
                                case 1:
                                    if (galohp > 0) {
                                        System.out.println("ガロのこうげき！");
                                        rgalo = ralo1.nextInt(20);
                                        galoattack = rgalo;
                                        System.out.println("モンスターへ" + galoattack + "のダメージ！");
                                    }
                                    if (liohp > 0) {
                                        monsterhp -= galoattack;
                                        System.out.println("リオのこうげき！");
                                        rlio = ralo1.nextInt(20);
                                        lioattack = rlio;
                                        System.out.println("モンスターへ" + lioattack + "のダメージ！");
                                        monsterhp -= lioattack;
                                    }
                                    if (monsterhp <= 0) {
                                        System.out.println("\nガロ達はモンスターをやっつけた！");
                                        d = hand / 2;
                                        sum -= (d + hand);
                                        flag = false;
                                        break;
                                    }
                                    System.out.println("\n\n\nモンスターのこうげき！");
                                    galohp -= 6;
                                    liohp -= 6;
                                    System.out.println("\nガロとリオは５のダメージを受けた");
                                    if (galohp <= 0 && liohp <= 0) {
                                        System.out.println("\nパーティーはぜんめつした…。");
                                        flag = false;
                                    }
                                    break;
                                case 2: {
                                    System.out.println("\nガロ達はにげだした！");
                                    sum += hand;
                                    flag = false;
                                    break;}
                                default:
                                    System.out.print("リオ「おい、なにボサっとしているんだ。操縦はお前の担当だろ。」→ ");
                            }
                        }
                    } else {
                        System.out.println("ガロ「ラッキー！宝箱だ！」");
                        System.out.println("ガロ「ん？アイナとエリス博士の写真だ。」");
                        sum  -= hand;
                    }

                    break;
                case 3:
                    if (hand < 13) {
                        System.out.println("リオ「おい何か来るぞ。気を付けろ！」");
                        System.out.println("リオ「モンスターだ！」");
                        int monsterhp = randomValue;
                        boolean flag = true;
                        while (flag) {
                            System.out.println("ガロのHP：" + galohp);
                            System.out.println("リオのHP：" + liohp);
                            System.out.println("");
                            System.out.println("モンスターのHP：" + monsterhp);
                            System.out.println("\nどうする？ 1：たたかう 2：にげる");
                            System.out.print("コマンドを数字で入力→ ");
                            c = scanner.nextInt();
                            switch (c) {
                                case 1:
                                    if (galohp > 0) {
                                        System.out.println("ガロのこうげき！");
                                        rgalo = ralo1.nextInt(20);
                                        galoattack = rgalo;
                                        System.out.println("モンスターへ" + galoattack + "のダメージ！");
                                    }
                                    if (liohp > 0) {
                                        monsterhp -= galoattack;
                                        System.out.println("リオのこうげき！");
                                        rlio = ralo1.nextInt(20);
                                        lioattack = rlio;
                                        System.out.println("モンスターへ" + lioattack + "のダメージ！");
                                        monsterhp -= lioattack;
                                    }
                                    if (monsterhp <= 0) {
                                        System.out.println("\nガロ達はモンスターをやっつけた！");
                                        d = hand / 2;
                                        sum -= (d + hand);
                                        flag = false;
                                        break;
                                    }
                                    System.out.println("\n\n\nモンスターのこうげき！");
                                    galohp -= 6;
                                    liohp -= 6;
                                    System.out.println("\nガロとリオは５のダメージを受けた");
                                    if (galohp <= 0 && liohp <= 0) {
                                        System.out.println("\nパーティーはぜんめつした…。");
                                        flag = false;
                                    }
                                    break;
                                case 2: {
                                    System.out.println("\nガロ達はにげだした！");
                                    sum += hand;
                                    flag = false;
                                    break;}
                                default:
                                    System.out.print("リオ「おい、なにボサっとしているんだ。操縦はお前の担当だろ。」→ ");
                            }
                        }
                    } else {
                        System.out.println("ガロ「ラッキー！宝箱だ！」");
                        System.out.println("ガロ「これ、レミーの私物のプレイボーイじゃねーか。…ちょっとだけ読んでみるか。」");
                        galohp += 20;
                        liohp += 20;
                        System.out.println("ガロとリオの体力が" + 20 + "ポイント回復した！");
                        sum  -= hand;
                    }
                    break;
                default:
                    System.out.println("リオ「おい、ガロ。来た道に戻ったみたいだぞ。」");
            }
        }
        System.out.println("リオ「あ、出口だ。ようやく出られたみたいだな。」");
        System.out.println("GAME CLEAR!!");
        // put your code here
    }
}