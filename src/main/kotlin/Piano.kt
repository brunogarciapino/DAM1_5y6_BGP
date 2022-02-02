/**
 * Esta es la superclase que va a hacer que herede al resto de instrumentos
 * es del tipo de la interfaz para evitar la independencia ya que es de tipo especialización esta herencia.
 * @property play Imprime la cancion
 * @property reset te limpia la melodia
 */
abstract class Instrumento:Ins {
    override fun play() {}
    override fun reset() {}
    override fun incorporaNota(nota: Nota) {}
}

class Violin(): Instrumento() {
    private var melodia = mutableListOf<Nota>()
    override fun play() {
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

    override fun reset() = melodia.clear()

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }
}
//Un piano es un instrumento que interpreta las notas con un timbre muy característico
class Piano() : Instrumento() {

   //tabla que almacena las notas a interpretar
    private var melodia = mutableListOf<Nota>()

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }


    override fun reset() = melodia.clear()


    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    override fun play() {
        println("===> Tocando piano")
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
