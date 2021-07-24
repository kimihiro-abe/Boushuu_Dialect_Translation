package boushuu_dialect_translation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//辞書生成機能のみのクラスを用意。
public class Dictionary {

	static Map<String, String> dic = new HashMap<String, String>();; //辞書となるMapの変数を定義。
	static Set<String> dic_keys; //辞書dicからkeyだけを抽出して、dic_keysに代入するための準備。

	public static void dic_Gene() { //辞書作成。Gene = Generate

		//辞書ファイルの読み込み
		BufferedReader br_dic = null;
		String file_name = "BDT_dic.csv";
		int line_index = 0; //行数を数えるのに使用

		//辞書ファイルから行数（縦）を割り出すだけの部分
			try {
				File file = new File(file_name);
				br_dic = new BufferedReader(new FileReader(file));

				while ((br_dic.readLine()) != null) { //行が無くなるまで読み。行数を数える目的なのでシンプル。
					line_index++; //行の数を計測する部分。
					}
			}
			catch(FileNotFoundException e) {
				System.out.println("入力ファイルが見つかりません");
			}
			catch(IOException e){
				System.out.println("入出力エラーです。");
			}

		//辞書ファイルを配列に格納する部分
		int MAX_DATA_NUMS = line_index; //↑で出した行数を入れてあげる

		String[][] data = new String[MAX_DATA_NUMS][];
		int column = 0;
			try {
				File file = new File(file_name);
				br_dic = new BufferedReader(new FileReader(file));

				String line;

					while ((line = br_dic.readLine()) != null) {
						data[column] = line.split(",");
						column++;
					}
					br_dic.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("入力ファイルが見つかりません");
			}
			catch (IOException e) {
				System.out.println("入出力エラーです。");
			}

		//String型配列のdataを、Mapのkeyとvalueに流し込む
		for (int i = 0; i < MAX_DATA_NUMS; i++) {
			for (int  j = 0; j < data[i].length; j++) {
				dic.put(data[i][j],data[i][++j]); //[++j]の箇所、[j++]と設定すると上手くいかない
			}
		}
		//辞書dicからkeyだけを抽出して、dic_keysに代入する。
		//この辞書クラスでアレコレしたやつを翻訳クラスTranslateにて使います。
		dic_keys = dic.keySet();
	}
}
