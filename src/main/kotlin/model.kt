data class Historia(val nombre: String, val imagen: String)
data class Sugerencia(val nombre: String, val imagen: String)
data class Publicacion(
    val autor: String,
    val texto: String,
    val imagenPerfil: String,
    val imagenContenido: String
)

val historias = listOf(
    Historia("imara", "imagenes/imara.jpg"),
    Historia("gil", "imagenes/gil.jpg"),
    Historia("simoni", "imagenes/simoni.jpg"),
    Historia("Golcoyo", "imagenes/Golcoyo.jpg"),
    Historia("Roman", "imagenes/Roman.jpg")
)

val sugerencias = listOf(
    Sugerencia("mimi", "imagenes/mimi.jpg"),
    Sugerencia("lulu", "imagenes/lulu.jpg")
)


val publicaciones = listOf(
    Publicacion(
        "gil",
        "Me gusta el Atletico y la cerveza",
        "imagenes/gil.jpg",
        "imagenes/atleti.jpg"
    ),
    Publicacion(
        "Golcoyo",
        "Soy amante de los vehiculos y me gusta tunear los coches",
        "imagenes/Golcoyo.jpg",
        "imagenes/coche.jpg"
    )
)
