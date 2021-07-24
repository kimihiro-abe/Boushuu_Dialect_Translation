package boushuu_dialect_translation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputIF {
	public static String src; //入力された素の文章。クラス変数扱いにして他のクラスからも使えるようにする

	public static void Input() {
		//入力部分
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		src = null;
			try {
				src = br.readLine();

				//ここでbr.close()したらエラー出てが今回はこのまま行く。

			}
			catch (IOException e) {
				e.printStackTrace();
			}
	}
}
