package com.challenge.suit

class Controller(private val callback: Callback): Interface{
    override fun cek(pemain1: String, pemain2: String) {

        return if (pemain1 == "Batu" && pemain2 == "Batu") {
            callback.hasil("Draw")
        } else if (pemain1 == "Batu" && pemain2 == "Kertas") {
            callback.hasil("Pemain 2 Menang")
        } else if (pemain1 == "Batu" && pemain2 == "Gunting") {
            callback.hasil("Pemain 1 Menang")
        } else if (pemain1 == "Kertas" && pemain2 == "Kertas") {
            callback.hasil("Draw")
        } else if (pemain1 == "Kertas" && pemain2 == "Batu") {
            callback.hasil("Pemain 1 Menang")
        } else if (pemain1 == "Kertas" && pemain2 == "Gunting") {
            callback.hasil("Pemain 2 Menang")
        } else if (pemain1 == "Gunting" && pemain2 == "Gunting") {
            callback.hasil("Draw")
        } else if (pemain1 == "Gunting" && pemain2 == "Batu") {
            callback.hasil("Pemain 2 Menang")
        } else if (pemain1 == "Gunting" && pemain2 == "Kertas") {
            callback.hasil("Pemain 1 Menang")
        } else {
            callback.hasil("Pilih antara Batu, Kertas, Gunting")
        }
    }
}