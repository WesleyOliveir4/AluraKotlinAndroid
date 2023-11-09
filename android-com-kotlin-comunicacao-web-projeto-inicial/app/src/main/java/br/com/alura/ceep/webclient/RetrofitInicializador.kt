package br.com.alura.ceep.webclient

import br.com.alura.ceep.webclient.services.NotaService
import retrofit2.Retrofit

class RetrofitInicializador {

    val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8080/")
        .build()

    val notasService =retrofit.create(NotaService::class.java)
}