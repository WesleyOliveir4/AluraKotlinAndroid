package br.com.alura.ceep.webclient

import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webclient.services.NotaService

class NotaWebClient {
    val notasService: NotaService = RetrofitInicializador().notasService
    suspend fun buscaTodas(): List<Nota>? {
        return try{
            val notaResposta = notasService.buscaTodas()

            notaResposta.map { notasResposta ->

                notasResposta.nota

            }
        }catch (e: Exception){
            null
        }

    }
}