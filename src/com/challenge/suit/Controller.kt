package com.challenge.suit

class Controller(private val callback: Callback) : Interface {
    override fun cek(pemain1: String, pemain2: String) {
        val x = arrayOf("Batu", "Kertas", "Gunting")
        return if (pemain1 == x[0] && pemain2 == x[0]) {
            callback.hasil("Draw")
        } else if (pemain1 == x[0] && pemain2 == x[1]) {
            callback.hasil("Pemain 2 Menang")
        } else if (pemain1 == x[0] && pemain2 == x[2]) {
            callback.hasil("Pemain 1 Menang")
        } else if (pemain1 == x[1] && pemain2 == x[1]) {
            callback.hasil("Draw")
        } else if (pemain1 == x[1] && pemain2 == x[0]) {
            callback.hasil("Pemain 1 Menang")
        } else if (pemain1 == x[1] && pemain2 == x[2]) {
            callback.hasil("Pemain 2 Menang")
        } else if (pemain1 == x[2] && pemain2 == x[2]) {
            callback.hasil("Draw")
        } else if (pemain1 == x[2] && pemain2 == x[0]) {
            callback.hasil("Pemain 2 Menang")
        } else if (pemain1 == x[2] && pemain2 == x[1]) {
            callback.hasil("Pemain 1 Menang")
        } else {
            callback.hasil("Pilih antara Batu, Kertas, Gunting")
        }
    }
}