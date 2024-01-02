package br.com.alura.ceep.webclient.services

import br.com.alura.ceep.model.NotaResposta
import br.com.alura.ceep.webclient.model.NotaRequisicao
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface NotaService {

//    @GET("notas")
//    fun buscaTodas(): Call<List<NotaResposta>>

    @GET("notas")
    suspend fun buscaTodas(): List<NotaResposta>

    @PUT("notas/{id}")
    suspend fun salva(
        @Path("id")id:String,
        @Body nota: NotaRequisicao
    ):Response<NotaResposta>
}