package com.fivestars.bluetooth

import kotlinx.html.dom.append
import kotlinx.html.js.button
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import kotlinx.html.js.p
import kotlin.browser.document

fun main() {

    BluetoothSerial.configureChannel();

    val root = document.getElementById("root")

    root?.append {

        div {
            button {
                text("Connect to Device")
                onClickFunction = {
                    BluetoothSerial.connect("18:21:95:5A:A3:80", {
                        console.log("Success function in connect");
                    }, {
                        console.log("Not success");
                    })
                }
            }
        }

        p {  }

        div {
            button {
                text("Listen")
                onClickFunction = {
                    BluetoothSerial.listen({
                        console.log("Success function in connect");
                    }, {
                        console.log("Not success");
                    })
                }
            }
        }

        p {  }

        div {
            button {
                text("Register callbacks")
                onClickFunction = {
                    BluetoothSerial.registerOnCloseCallback {
                        console.log("Registers on close")
                    }
                    BluetoothSerial.registerOnDataCallback {
                        console.log("on data registered")
                    }
                    BluetoothSerial.registerOnConnectCallback {
                        console.log("on connect registered")
                    }
                }
            }
        }
    }
}