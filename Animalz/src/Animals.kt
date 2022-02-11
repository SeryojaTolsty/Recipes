open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = ""

    open fun makeNoise() {
        println("The animal is making noise")
    }

    open fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    open fun sleep() {
        println("The animal is sleeping")
    }
}
class Hippo: Animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}
open class Canine: Animal(){
   override fun roam(){
       println("The Canine is roaming")
   }
}
class Wolf: Canine() {
    override val image = "wolf.jmg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise(){
        println("Hooooooowl!")
    }
    override fun eat(){
        println("The Wolf is eating $food")
    }
}
class Fox: Canine(){
    override val image = "fox.jmg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise(){
        println("Woof-woof-woof!")
    }
    override fun eat(){
        println("The Fox is eating $food")
    }
}

open class Feline: Animal(){
    override fun roam(){
        println("The Cat is roaming")
    }
}
class Cheetah: Feline(){
    override val image = "cheetah.jmg"
    override val food = "meat"
    override val habitat = "savanna"
    override fun makeNoise(){
        println("Rryawwwrr!")
    }
    override fun eat(){
        println("The Cheetah is eating $food")
    }


}

class Lion: Feline(){
    override val image = "lion.jmg"
    override val food = "meat"
    override val habitat = "savanna"
    override fun makeNoise(){
        println("Rawwr!")
    }
    override fun eat(){
        println("The Lion is eating $food")
    }
}
class Lynx: Feline(){
    override val image = "lynx.jmg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise(){
        println("MEOW!")
    }
    override fun eat(){
        println("The Lynx is eating $food")
    }
}


class Vet{
    fun giveShot(animal: Animal){
        //Code to do something medical
        animal.makeNoise()
    }
}
fun main(args: Array<String>){
    var animals = arrayOf(Hippo(), Wolf(), Fox(), Lion(), Lynx(), Cheetah())
    var canine = arrayOf(Wolf(), Fox())
    var feline = arrayOf(Lion(), Lynx(), Cheetah())
    for(item in animals) {
        item.roam()
        item.eat()
    }
    for(item in canine){
        item.eat()
    }

    for(item in feline){
        item.eat()
        item.sleep()
    }
    val vet = Vet()
    val wolf =Wolf()
    val fox = Fox()
    val hippo = Hippo()
    val lynx = Lynx()
    val lion = Lion()
    val cheetah = Cheetah()


    vet.giveShot(wolf)
    vet.giveShot(fox)
    vet.giveShot(hippo)
    vet.giveShot(lynx)
    vet.giveShot(lion)
    vet.giveShot(cheetah)
}