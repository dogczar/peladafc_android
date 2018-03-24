package br.com.renan2junior.peladafc.constants

/**
 * Created by renanjunior on 23/03/18.
 */
class DataContants {

    object TABLE {
        object PLAYER {
            var USER_ID = "userId"
            val NAME = "name"
            val EMAIL = "email"
            val CELULAR = "celular"
            val IS_ADM = "isAdm"
            val TIPO = "tipo"
            val PASSWORD = "password"
        }

        object EXPENSE {
            val DESPESA_ID = "despesaId"
            val USER_ID = "userId"
            val TIPO = "tipo"
            val DATA_DESPESA = "dataDespesa"
            val VALOR = "valor"
            val MES = "mes"
        }

        object PAY {
            val USER_ID = "userId"
            val DATA_PAGAMENTO = "dataPagamento"
            val MES = "mes"
            val VALOR = "valor"
        }

        object PLACE {
            val CAMPO_ID = "campoId"
            val NOME = "nome"
            val ENDERECO = "endereco"
            val CEP = "cep"
            val TELEFONE = "telefone"
            val CONTATO = "contato"
            val DADOS_BANCARIOS = "dadosBancarios"
        }

        object TYPE_EXPENSE {
            val TIPO_DESPESA_ID = "tipoDespesaId"
            val DESCRICAO = "descricao"
        }
    }

}