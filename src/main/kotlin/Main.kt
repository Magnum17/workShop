fun main(args: Array<String>) {

    /**
     *  Atividade de Kotlin
     *
     *
     *  Objetivo da atividade: Fazer um código que consiga analisar o email e senha do usuário,
     *  para que ele possa logar em sua conta. Porém, ele precisa ter um número limites de tentativas,
     *   neste caso, 3 tentativas. Caso todas suas tentativas acabem, a mensagem "acesso negado" deve
     *   ser mostrada ao usuário, e caso contrário, ele conseguirá entrar em sua conta.
     *
     *   Regras:
     *
     *      - O Código só pode parar de rodar em duas situações.
     *      1° -> Caso o usuário fique sem tentativas para acessar a conta
     *      2° -> Caso o usuário consiga acessar sua conta. Nesse caso, o laço deve ser quebrado,
     *       a mensagem "acesso liberado" deve aparecer para o usuário e código é encerrado.
     *
     *      - As tentativas de utilizar o email e senha para acessar a conta, devem ser Inputs
     *      de usuário. Portanto, utilize a biblioteca "Scanner" ou a função "readline" para
     *      realizar essa tarefa.
     *
     *   OBS: Você precisa manter o uso do laço "do while" para resolver essa atividade, mas fora isso,
     *   você pode modificar outras partes do código e claro, implementar novas coisas.
     *
     */


    // Valores de criação de email e senha, ou seja, dados que o usuário inseriu na criação de sua conta
    // Para que o usuário consiga logar em sua conta, é necessário que ele coloque dados correspondentes a esses
    val emailC = "roberto.seuimovel@gmail.com"
    val senhaC = 3434.34

    do
    {
        // Dados que ele vai inserir para tentar o acesso à sua conta
        val emailE = readln().toInt()
        val senhaE = readln().toInt()

        if (emailC == senhaC && emailC == emailC)
        {
            println("Acesso liberado")
        }
        else
        {
            println("Acesso negado")
        }

    }


}