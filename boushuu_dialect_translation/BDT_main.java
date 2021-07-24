package boushuu_dialect_translation;

public class BDT_main { //BDTとはBoushuu_Dialect_Translation（日本語名：房州弁翻訳）の略称である。

	public static void main(String[] args) {
		//今回、メインメソッドにはメソッドのみを記述する設計で進めることにしました。

		//準備部分
		Dictionary.dic_Gene(); //辞書作成
		Transition.title(); //タイトル表示

		//メイン部分、以下をループ処理させる
		while(Transition.ctrl_true()) { //whileの条件記述部にもメソッド入れる
			InputIF.Input(); //入力装置始動。
			Transition.input_src(); //入力された元文章の表示
			Translate.Translate_main(); //翻訳機構始動
			Transition.rslt(); //翻訳結果表示
			Transition.continu(); //継続処理
		}

		//デバッグ用のエンド確認
		Transition.end();
	}
}

//↓テスト用文章

//近所を歩いている途中、飛び出てきたカエルに大変驚き転んでしまい。痛い思いをしたのですよ。
//とんでもない目にあったので、なにもかもどうでもよくなりました。で、あれですよね。
//わたしは、重たいものを持つことに疲れ、思わずそれを捨てることにした...
