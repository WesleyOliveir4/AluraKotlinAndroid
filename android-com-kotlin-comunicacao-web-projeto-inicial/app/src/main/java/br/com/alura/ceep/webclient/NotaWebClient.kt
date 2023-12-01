package br.com.alura.ceep.webclient

import br.com.alura.ceep.model.Nota

class NotaWebClient {

    suspend fun buscaTodas(): List<Nota> {
        val notasResposta = RetrofitInicializador().notasService.buscaTodas()
        return  notasResposta.map { notasResposta ->

            notasResposta.nota

        }
    }
}