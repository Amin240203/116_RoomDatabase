package com.example.pertemuan10

import android.app.Application
import com.example.pertemuan10.repositori.ContainerApp
import com.example.pertemuan10.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
    AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}