package Quiz;

public class Quizmain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//配列作成
		int ans = 0,count = 0,pt = 0;
		int anser[] = new int[30];
		//問題
		System.out.println("-----■4拓クイズです。問題は30問あります。■------");

		//第1問
		System.out.println("第一問 アホウドリの名前の由来は何でしょう？");
		System.out.println("①アホーと鳴くから　　②人間にすぐ捕まるから　　③アホみたいな顔しているから　　④阿波踊りみたいに踊っているように飛ぶから");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[0] = ans;
		//答え合わせ
		if(ans == 2){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第2問
		System.out.println("第2問 日本の都道府県で温泉地の数が最も多いのは？");
		System.out.println("①兵庫県　　②大分県　　③北海道　　④青森県");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[1] = ans;
		//答え合わせ
		if(ans == 3){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第3問
		System.out.println("第3問 ワサビは何科の植物？");
		System.out.println("①アオイ科　　②アブラナ科　　③セリ科　　④ショウブ科");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[2] = ans;
		//答え合わせ
		if(ans == 2){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第4問
		System.out.println("ボーナス問題です。正解すると2pt入ります。");
		System.out.println("第4問 オーストラリアの一枚岩、エアーズロックの現地での呼び名は何？");
		System.out.println("①ウルル　　②サララ　　③キララ　　④クルル");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[3] = ans;
		//答え合わせ
		if(ans == 1){
			count += 1;
			pt += 2;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第5問
		System.out.println("第5問 国を表すドメインで『co』といえばどこの国？");
		System.out.println("①コスタリカ　　②コンゴ　　③コモロ　　④コロンビア");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[4] = ans;
		//答え合わせ
		if(ans == 4){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第6問
		System.out.println("第6問 日本で初めて高校に出店したコンビニは？");
		System.out.println("①ローソン　　②サークルＫサンクス　　③ファミリーマート　　④デイリーヤマザキ");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[5] = ans;
		//答え合わせ
		if(ans == 3){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第7問
		System.out.println("ボーナス問題です。正解すると2pt入ります。");
		System.out.println("第7問 通称『メグスリノキ』と呼ばれる学名アーケル・ニコエンセの『ニコ』とは何のこと？");
		System.out.println("①日光市　　②二個　　③ニコニコ　　④聖ニコラウス");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[6] = ans;
		//答え合わせ
		if(ans == 1){
			count += 1;
			pt += 2;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第8問
		System.out.println("第8問 淡水性単細胞緑藻類のクロレラの語源ともなったラテン語の『ella』の意味は？");
		System.out.println("①小さいもの　　②水　　③緑色の　　④生物");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[7] = ans;
		//答え合わせ
		if(ans == 1){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第9問
		System.out.println("第9問 昭和２年に東京に登場したタクシーの通称は？");
		System.out.println("①金タク　　②便タク　　③電タク　　④円タク");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[8] = ans;
		//答え合わせ
		if(ans == 4){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第10問
		System.out.println("第10問 1969年、アポロ11号が月に到達して着陸した場所は？");
		System.out.println("①雲の海　　②湿りの海　　③南の海　　④静かの海");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[9] = ans;
		//答え合わせ
		if(ans == 4){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第11問
		System.out.println("第11問 エジプトのツタンカーメン王の妃といわれる人物は？");
		System.out.println("①ネフェルティティ　　②アンケセナーメン　　③ムトノメジット　　④イムヘテプ");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[10] = ans;
		//答え合わせ
		if(ans == 2){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第12問
		System.out.println("第12問 ピエモンテ、アンダルシア、ボルドーといえば何の産地？");
		System.out.println("①ワイン　　②ウイスキー　　③ビール　　④ラム酒");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[11] = ans;
		//答え合わせ
		if(ans == 1){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第13問
		System.out.println("第13問 日本三奇橋に含まれないのは？");
		System.out.println("①葛橋　　②猿橋　　③瀬田唐橋　　④眼鏡橋");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[12] = ans;
		//答え合わせ
		if(ans == 3){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第14問
		System.out.println("第14問 トランプのマークで「ハート」が意味するものは？");
		System.out.println("①金　　②盃　　③棍棒　　④剣");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[13] = ans;
		//答え合わせ
		if(ans == 2){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第15問
		System.out.println("第15問 飼い猫の一種「コラット」の発生国は？");
		System.out.println("①中国　　②アメリカ　　③タイ　　④エジプト");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[14] = ans;
		//答え合わせ
		if(ans == 3){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第16問
		System.out.println("第16問 頭語の「拝復」の結語として正しいものは？");
		System.out.println("①拝啓　　②草々　　③敬具　　④謹言");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[15] = ans;
		//答え合わせ
		if(ans == 4){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第17問
		System.out.println("ボーナス問題です。正解すると2pt入ります。");
		System.out.println("第17問 検索エンジンGoogleの原型ともなった検索エンジンの名前は？");
		System.out.println("①BackRub　　②Mooter　　③Lycos　　④LookSmart");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[16] = ans;
		//答え合わせ
		if(ans == 1){
			count += 1;
			pt += 2;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第18問
		System.out.println("第18問 一般的な電話機で、６の下にあるボタンは？");
		System.out.println("①１　　②３　　③７　　④９");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[17] = ans;
		//答え合わせ
		if(ans == 4){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第19問
		System.out.println("第19問 現在発行されている500円玉に描かれている植物は？");
		System.out.println("①キリ　　②2ボタン　　③サクラ　　④キク");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[18] = ans;
		//答え合わせ
		if(ans == 1){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第20問
		System.out.println("第20問 コンデンスミルクの『コンデンス』の意味は？");
		System.out.println("①混合した　　②半固体状の　　③凝縮した　　④甘い");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[19] = ans;
		//答え合わせ
		if(ans == 3){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第21問
		System.out.println("第21問 チョコレート菓子『小枝』を製造しているメーカーは？");
		System.out.println("①ロッテ　　②明治製菓　　③森永製菓　　④ブルボン");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[20] = ans;
		//答え合わせ
		if(ans == 3){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第22問
		System.out.println("ボーナス問題です。正解すると2pt入ります。");
		System.out.println("第22問 日本一短い国道は国道何号線？");
		System.out.println("①398号線号線　　②216号線号線　　③339号線　　④174号線");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[21] = ans;
		//答え合わせ
		if(ans == 4){
			count += 1;
			pt += 2;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第23問
		System.out.println("第23問 数字の１を『unu』と表記するのは何語？");
		System.out.println("①スペイン語　　②ノルウェー語　　③ルーマニア語　　④リトアニア語");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[22] = ans;
		//答え合わせ
		if(ans == 3){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第24問
		System.out.println("第24問 タピオカの原料であるトウダイグサ科の食物は？");
		System.out.println("①キャッサバ　　②タロイモ　　③ヤムイモ　　④キヌア");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[23] = ans;
		//答え合わせ
		if(ans == 1){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第25問
		System.out.println("第25問 世界遺産に登録されている東大寺大仏殿に使われている瓦の数はおよそ何枚？");
		System.out.println("①2万3700枚　　②5万5200枚　　③8万1800枚　　④10万9400枚");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[24] = ans;
		//答え合わせ
		if(ans == 4){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第26問
		System.out.println("第26問 和風庭園に設置される竹の筒に水を流し入れてコーンという音を鳴らす小道具の名前は？");
		System.out.println("①鹿威し　　②獅子威し　　③虎威し　　④猪威し");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[25] = ans;
		//答え合わせ
		if(ans == 1){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第27問
		System.out.println("ボーナス問題です。正解すると2pt入ります。");
		System.out.println("第27問 次のうち、サンタクロースが乗るものは？");
		System.out.println("①艀　　②橇　　③輜　　④麁");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[26] = ans;
		//答え合わせ
		if(ans == 2){
			count += 1;
			pt += 2;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第28問
		System.out.println("第28問 江戸時代に大橋宗英が考案したとされる二人で行う将棋の一種は？");
		System.out.println("①安南将棋　　②槍将棋　　③地雷将棋　　④禽将棋");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[27] = ans;
		//答え合わせ
		if(ans == 4){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第29問
		System.out.println("第29問 次のレジャー施設のうち、静岡県にあるものは？");
		System.out.println("①ワールド牧場　　②合歓の郷　　③淡島マリンパーク　　④牧野植物園");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[28] = ans;
		//答え合わせ
		if(ans == 3){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//第30問
		System.out.println("第30問 次の食物のうち、アフリカ大陸原産のものは？");
		System.out.println("①スイカ　　②ピーマン　　③トマト　　④パイナップル");
		System.out.print("正解を入力＞");
		ans = new java.util.Scanner(System.in).nextInt();
		//答えを格納
		anser[29] = ans;
		if(ans == 1){
			count += 1;
			pt += 1;
			System.out.println("正解です。");
		}else{
			System.out.println("不正解です。");
		}
		System.out.println("");//空白
		//問題正解数、合計pt
		System.out.println("合計ptは" + pt + "です。");
		if(pt == 34){
			System.out.println("全問正解ですおめでとうございます。");
		}else{
			System.out.println("正解数は" + count + "です。");
		}
	}

}
