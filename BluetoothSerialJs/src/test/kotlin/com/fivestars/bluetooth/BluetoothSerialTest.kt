package com.fivestars.bluetooth

import com.fivestars.cordovaalternativepattern.model.Action
import com.fivestars.cordovaalternativepattern.model.message.JavascriptMessage
import kotlin.test.Test
import kotlin.test.assertEquals

class BluetoothSerialTest {

    @Test
    fun testListenSendsListenAction() {
        var message: JavascriptMessage? = null
        BluetoothSerial.messageHandler = object :MessageHandler {
            override fun sendMessageToNative(javascriptMessage: JavascriptMessage) {
                message = javascriptMessage
            }
        }
        BluetoothSerial.listen({}, {})
        assertEquals(Action.LISTEN, message!!.action)
    }

    @Test
    fun testGetAddressSendGetAddressAction() {
        var message: JavascriptMessage? = null
        BluetoothSerial.messageHandler = object :MessageHandler {
            override fun sendMessageToNative(javascriptMessage: JavascriptMessage) {
                message = javascriptMessage
            }
        }
        BluetoothSerial.getAddress({}, {})
        assertEquals(Action.GET_ADDRESS, message!!.action)
    }
}