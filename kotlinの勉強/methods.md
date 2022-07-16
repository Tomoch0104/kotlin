# Socket.getInputStream()
- このソケットの入力ストリームを返す．
- このソケットにチャンネルが関連づけられている場合，結果として得られる入力ストリームは，その操作のすべてをチャンネルに委譲する．そのチャンネルが非ブロックモードである場合，入力ストリームのread操作がiIIegalBlockingModelExceptionをスローする．
- 戻り値
  - このソケットからバイトを読み込むための入力ストリーム
```java
public InputStream getInputStream() throws IOException
```

> ## Fragment(フラグメント)
- コンテンツとライフサイクルを持ったビュー
- **ライフサイクル**
  - インスタンスが作成されてから，それが捨てられるまでの一連の流れ
- Androidでは，Activity（アクティビティ）だとインスタンスが生成される際にonCreateメソッドが呼ばれ，破棄される際にonDestroyメソッドが呼ばれ，他にも画面の状態によって，onResume・onStart・onPause・onStopなどのメソッドが呼ばれる．
- ライフサイクルに応じて呼び出されるメソッドを持っている場合にライフサイクルをを持っていると表現する．
- Fragmentもアクティビティに非常に近いライフサイクルを持っている
### ActivityとFragmentの違い
- Fragmentは親子関係をもてる
  - FragmentはFragmentのなかにFragmentを持つことができる

> ## MutableLiveData
双方向バインディングをする際に
> ## receivedMessageLiveData.postValue()
setValueはUIスレッドで呼び出さないといけない（postValuse）を使う．

### observavleFieldとLiveDataの違い
- ObservableFieldは，値が**変更された時**に通知を行う
- LiveDataは，値が**変更されていなくても設定されれば**通知を行う

```kotlin
val observableFld = ObservableField<Int>()
observableFld.set(5)
observableFld.set(5)
observableFld.set(5) // 最初の1回しか通知されない(=onChangedは呼ばれない)

val liveData = MutableLiveData<Int>()
liveData.postValue(5)
liveData.postValue(5)
liveData.postValue(5) // 3回とも通知される(=onChangedが呼ばれる)
```
このことを知っておかないと，以下のようなリスクがある

- ムダな画面の更新が発生する
- TwoWayバインディングを何も考えずに作ると無限ループで死ぬ



> ## socketClient.receivedData
### observeForever
### removeObserver

> ## SocketClient
> ## ViewModelProvider
### NewInstanceFactory

> ## viewModelScope
### launch
### runCatching
### withContext
### Dispatchers.IO

> ### @Suppress
> ### companion object
