class Song(val title: String, val artist: String) {
    init {
        // Code that you want to run when the object is initialized.
        // Each class can have multiple initializer blocks,
        // each one runs in order they appear in the class body.
        println("Song $title by $artist created!")
    }

    val upperCaseTitle: String
        get() = title.uppercase()

    var artistUpperCase = artist
        set(value) { field = value.uppercase() }

    fun play(): String = "Playing the song $title by $artist"
    fun stop() : String = "Stopped playing $title"
}

class NoConstructorClass {
    init {

    }
}

fun main(args: Array<String>) {
    var song1 = Song("song 1", "artist 1")
    println(song1.play())
    println(song1.stop())
}