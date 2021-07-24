# Boushuu_Dialect_Translation
## 自作「Boushuu_Dialect_Translation - 日本語名：房州弁翻訳」  
<img src="https://github.com/kimihiro-abe/Boushuu_Dialect_Translation/blob/main/Boushuu_Dialect_Translation_01.png" width="50%">
<br>

### - 序文 -

5月後半の訓練課程でList/Set/Mapやpackageなどに引き続き、  
外部ファイルの読み込みについて学びました。  
「それらを組み合わせて何かを作れないか？」と考え、  
訓練課程の復習も兼ねて制作したプログラムです。  
<br>
『翻訳』とうたってはいますが、  
システム的には極めて原始的な仕掛けとなっています。  
<br>
ちなみに『房州弁』とは、    
私の出身地域である千葉県の安房郡で使われている方言のことです。  
館山市のマスコットキャラクターに「ダッペエ」というものがありますが、  
この『ダッペエ』という命名も房州弁が元になっています。
<br>
<hr>

### - このプログラムを作るにあたり考えたこと -

以下の３点を基本設計として進めることとした。

    １，外部ファイルとして別個に用意した辞書csvを使う。
    ２，Mapのkeyとvalueを使う。
    ３，機能別にクラス分けして、それらを使いわける。
<br>
どんなものが出力されるのか？  
参考として以下の画像をご参照ください。  
<img src="https://github.com/kimihiro-abe/Boushuu_Dialect_Translation/blob/main/Boushuu_Dialect_Translation_02.png" width="50%">
<br>

### - ファイルについて -
以下のパッケージの中に...  
package boushuu_dialect_translation;  
<br>
下記の5つのJavaファイル入れてあります。  
BDT_main.javaから実行してください。  

- BDT_main.java  
    メインとなるクラス。
- Dictionary.java  
    辞書ファイルからMapに辞書を読み込みます。  
- InputIF.java  
    入力処理だけをするクラス。  
- Transition.java  
    表示するテキスト(タイトル画面等)をまとめたクラス。 
- Translate.java  
    入力したテキストを翻訳するクラス。  

それと忘れてはならないのがBDT_dic.csv。  
これが辞書ファイルになります。併せてご利用ください。  

<br>

### - 翻訳システムの解説 -
以下の画像のようにMapのkeyに標準語、valueに房州弁を格納し、  
入力された文章・単語に対してkeyで全検索・置換処理をしています。  
 <img src="https://github.com/kimihiro-abe/Boushuu_Dialect_Translation/blob/main/Boushuu_Dialect_Translation_03.png" width="50%">

<hr>

### - 工夫したことなど -

1, 外部ファイルを読み込んで活用する。  
訓練校の訓練ではテキストファイルの読み込みと書き込みを行ったのみで、  
その機能をより活用したプログラムの作成には至っていませんでした。  
ですので、CSVで辞書ファイルを作り活用することに挑戦しました。  
<br>
2, メインクラスのメインメソッドには、なるべくメソッドだけを記述  
前回（https://github.com/kimihiro-abe/Reverse_Order_Generator ）同様ではありますが、  
プログラム的にシンプルな構造なので、今回も同様の方法を踏襲してみました。  
<br>
3, 実処理部分を別クラスにする。  
これについても前回で挑戦した部分ではありますが、  
幾つかのクラスで構成されたプログラムを組む方法に慣れたいので、  
クラスを小分けして組むことにしました。  
<br>

### - 苦労した点 -
今回、プログラム部分は自分でも驚くほどに順調に仕上がりました。  
そんな中で、実は一番苦労した点は辞書ファイルの作成です。  
<br>
プログラム部分が非常にシンプルなものとなっているので、  
なおさらに辞書ファイルの作り方・出来が大きく翻訳結果を左右します。  
<br>
文字表現を考慮した際、例えば「凄い」という語は  
「凄い」「スゴイ」「スゴい」「すごい」と入力される可能性があります。  
このことに、手を動かし始めてから気付きまして、  
内心「想定の１０倍以上大変では？」となりました。  
<br>
そういった事情もあり、  
現状のverの辞書ファイルでは完成度をつめきれておりません。  
これから時間をかけて少しづつ更新を行って行く方針です。　　
<br>

<hr>

### - 今回の挑戦で得られた物 -

1, 外部ファイルを読み込んで活用するプログラムを組むことができた。  
2, Mapを用いて簡易な翻訳システムを構築出来た。  
3, 世にある翻訳システムの凄さを再認識することになった。  
4, エラーが出なくなるまでトライ＆エラーしたこと。  
5, 仕様通りに動くまでのものに仕上げたきったこと。  

上記の5点が今回得られた物になります。  
<br>
ユーザーさんに何かしらを入力してもらい、  
それに対して変化を加えて出力してあげて、  
その変化をユーザーさんに楽しんで貰う。  
<br>
現状では本当にささやかではありますが、  
そういったサービスの制作に興味を持つきっかけとなりました。  
<br>
今回は、このへんで...