package boushuu_dialect_translation;
//遷移処理：タイトル、エンド表示等のメソッドを入れておく。
//最初、遷移的な部分だけ入れていたが、テキスト表示はここにまとまった感ある。

public class Transition { //処理の時系列に沿って記述していく
	static Boolean ctrl;

	public static void title() {
		System.out.println("\t＿人人人人人人人人＿										＿人人人人人人人人＿");
		System.out.println("\t＞　 房州弁翻訳 　＜		出前迅速精度曖昧:ver.0.75		＞　 房州弁翻訳 　＜");
		System.out.println("\t￣ＹＹＹＹＹＹＹＹ￣										￣ＹＹＹＹＹＹＹＹ￣");
		System.out.println();
		System.out.println("『翻訳したい文章』『単語』などを、お気に召すまま入力してください！(◍•ᴗ•◍)");
		System.out.println("（注１：現状、改行には対応していないので...仕様ということでお願いします）");
		System.out.println("（注２：辞書作成の作りこみ次第なので、翻訳出来ない語も現状多いです。");
		System.out.println();
	}

	public static void input_src() {
		System.out.println();
		System.out.println("■入力ソース（・＿・\n\n" + "\t" + InputIF.src);  //入力ソースの表示
	}

	public static void rslt() {//翻訳結果表示
		System.out.println();
		System.out.println("★翻訳だっぺぇ(・∀・)\n\n" + "\t" + Translate.trans_txt + "\n");
	}
	public static void reEnter() {
		System.out.println();
		System.out.println("\t＿人人人人人人人人＿");
		System.out.println("\t＞　 房州弁翻訳 　＜	引き続き入力を受け付け中です！(◍•ᴗ•◍)");
		System.out.println("\t￣ＹＹＹＹＹＹＹＹ￣");
		System.out.println();
		System.out.println("\n");
	}
	public static void end() { ////デバッグ用のエンド確認
		System.out.println("\nおわり～(・∀・)！！\n");
	}
	public static boolean ctrl_true() { //trueを返すだけ
		return ctrl = true;
	}
	public static boolean ctrl_false() { //falseを返すだけ
		return ctrl = false;
	}

}
