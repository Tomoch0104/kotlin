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
> ## receivedMessageLiveData.postValue()
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