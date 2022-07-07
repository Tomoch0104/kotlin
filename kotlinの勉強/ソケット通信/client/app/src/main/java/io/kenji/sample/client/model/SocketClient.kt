package io.kenji.sample.client.model

import java.net.Socket


class SocketClient(
    private val ip: String,
    private val port: Int
    ) {

    private lateinit var socket: Socket
    private lateinit var reader: BufferedReader
}