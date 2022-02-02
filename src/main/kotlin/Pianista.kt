interface Musico{
    fun interpretar()
}

class Violinista(instrumento:Ins,unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)):Musico {
    private val Violin: Ins = instrumento
    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value

            Violin.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { Violin.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }
    override fun interpretar() = Violin.play()


}
class Pianista(piano:Ins,unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)):Musico {

    private val piano:Ins = piano
    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value

            piano.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { piano.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    override fun interpretar() = piano.play()

}