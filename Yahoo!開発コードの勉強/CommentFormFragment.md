# import 
<h2>

> 【android】Bundleの使い方
</h2>

## Bundleとは
AndroidにはActivityのライフサイクルがある．<br>
別のActivityが全面に来るなどして，メモリが不足した場合にActivityが破棄されることがある．<br>
この時，メモリ上にだけ展開されたインスタンス変数などの値も破棄されてしまう．<br>
再度呼び出されるときは，もう一度Activityを生成し直すため，前回の状態は失われる．<br>
そこで，前回と同じ状態に復元できるようにするために，状態を保存，復元するクラスとしてAndroidが準備してくれているのがBundle．<br>
簡単にいうと，BundleはOSの判断で強制的に停止，終了するときに一時的にデータを格納するクラス．<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>




<h2>

> companion objectとは
</h2>

```kotlin
// CommentFormFragment.kt
companion object {
    const val REQUEST_CODE = 1
    private const val KEY_TOPICS_ID = "topicsId"
    private const val KEY_COMMENT_ID = "commentId"
    ...
}
```
<h2>

> @JavStaticとは
</h2>

