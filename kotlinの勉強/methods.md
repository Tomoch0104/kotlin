# Socket.getInputStream()
- このソケットの入力ストリームを返す．
- このソケットにチャンネルが関連づけられている場合，結果として得られる入力ストリームは，その操作のすべてをチャンネルに委譲する．そのチャンネルが非ブロックモードである場合，入力ストリームのread操作がiIIegalBlockingModelExceptionをスローする．
- 戻り値
  - このソケットからバイトを読み込むための入力ストリーム
```java
public InputStream getInputStream() throws IOException
```