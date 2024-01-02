package br.com.alura.ceep.webclient

import android.util.Log
import br.com.alura.ceep.model.Nota
import br.com.alura.ceep.webclient.model.NotaRequisicao
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

    suspend fun salva(nota: Nota) {
        try {
            val response = notasService.salva(
                nota.id,
                NotaRequisicao(
                    titulo = nota.titulo,
                    descricao = nota.descricao,
                    imagem = nota.imagem
                )
            )
            if (response.isSuccessful){
                Log.e("sucesso ao salvar","Sucesso")
            }else{
                Log.e("erro ao salvar","Erro")
            }
        }catch (e: Exception){
            Log.e("erro ao salvar","Erro: $e")
        }
    }
}