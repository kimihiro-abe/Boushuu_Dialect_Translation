package boushuu_dialect_translation;

public class Translate { //翻訳機能のみを収録したクラス

	public static String trans_txt; //翻訳語テキストを格納する変数

	public static void Translate_main() { //辞書機能と翻訳機能を分割した。
		String src =InputIF.src; //InputOutクラスのクラス変数srcを、このクラスで使用する変数に代入。

		//翻訳セクション
		for (String word : Dictionary.dic_keys) { //キーを１つ取り出してwordに代入。
			src = src.replace(word, Dictionary.dic.get(word));	//置換処理部。
									//↑辞書のkeyに対応する語をvalue
		}
		trans_txt = src; //翻訳結果を、このクラスのクラス変数trans_txtに代入。
	}
}
