package com.fivestars.bluetooth

import com.fivestars.cordovaalternativepattern.model.message.JavascriptMessage

interface MessageHandler {
    fun sendMessageToNative(javascriptMessage: JavascriptMessage)
}