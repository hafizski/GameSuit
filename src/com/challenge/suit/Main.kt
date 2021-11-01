package com.challenge.suit

object Main : Callback {
    @JvmStatic
    fun main(args: Array<String?>?) {
        println("==========================" +
                "GAME SUIT TERMINAL VERSION" +
                "==========================")
        println("Pilih saja antara Batu, Kertas, Gunting")
        print("Masukkan pemain 1= ")
        val pemain1 = readLine()
        print("Masukkan pemain 2= ")
        val pemain2 = readLine()

        //controller
        if (pemain1 != null && pemain2 != null) {
            val controller = Controller(this)
            controller.cek(pemain1.toString(), pemain2.toString())
        } else {
            println("Mohon diisi")
        }
    }

    override fun hasil(hasil: String) {
        println(hasil)
    }
}