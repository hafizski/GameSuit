package com.challenge.suit

object Main : Callback {
    @JvmStatic
    fun main(args: Array<String?>?) {

        do {
            println("==========================")
            println("GAME SUIT TERMINAL VERSION")
            println("==========================")
            println("Kita Akan Bermain Batu, Kertas, Gunting")
            println("1. Ayo Bermain")
            println("2. Keluar")
            print("Silahkan Pilih : ")
            val a: Int = readLine()!!.toInt()
            if (a == 1) {
                mariBermain()
            } else if (a != 1) {
                println("\nSampai Jumpa Lagi\n")
            }
        } while (a < 2 || a != 1)
    }

    fun mariBermain() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
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