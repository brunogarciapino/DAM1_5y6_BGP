
abstract class Intrumento{
    private var melodia = mutableListOf<Nota>()
    open fun reset() = melodia.clear()


}
class Violin(override val nota: Nota) :Ins{

    private var melodia = mutableListOf<Nota>()
    override fun play() {
        melodia.add(nota)
    }

    override fun reset() = melodia.clear()

    override fun incorporaNota(nota: Nota) {
        println("===> Tocando violin")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("doggg ")
                Nota.RE -> print("reee ")
                Nota.MI -> print("miggg ")
                Nota.FA -> print("faggg ")
                Nota.SOL -> print("soool ")
                Nota.LA -> print("laaa ")
                Nota.SI -> print("siiii ")
            }
        }
        println("")
    }
    }
//Un piano es un instrumento que interpreta las notas con un timbre muy característico
class Piano(override val nota: Nota) :Ins{

   //tabla que almacena las notas a interpretar
    private var melodia = mutableListOf<Nota>()

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }


    override fun reset() = melodia.clear()


    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    override fun play() {
        println("Tocando piano")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dooo ")
                Nota.RE -> print("reee ")
                Nota.MI -> print("miiii ")
                Nota.FA -> print("faaa ")
                Nota.SOL -> print("soool ")
                Nota.LA -> print("laaa ")
                Nota.SI -> print("siiii ")
            }
        }
        println("")
    }
}
