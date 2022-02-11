class Song(val title: String, val artist: String){
    fun play(){
        println("")
        println("Playing the song $title by $artist")
    }
    fun stop(){
        println("")
        println("Stopped playing $title")
    }
}
fun main(args: Array<String>){
    val songOne = Song("The Mesopotamians", "They Might By Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songOne.play()
    songOne.stop()
    songThree.play()
    songThree.stop()
    songTwo.play()

}
