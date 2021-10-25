import classes.Animal
import classes.Cat
import classes.Dog

fun main(){
    var animal:Animal = Animal(false)
    var cat= Cat(true)
    var dog=Dog()
    //print whatever the animal is danger or not from the isWildFun outside the classes
    println("the animal is wild = ${isWild(animal)}")
    println("the cat is Wild= ${isWild(cat)}")
    println("the dog is Wild= ${isWild(dog)}")

    // this fun calls the super sound() then its one
    //cat.sound()

    var cat1:Animal=Cat(false)
    var dog1:Animal=Dog()
    var listOfAnimals= mutableListOf<Animal>()
    listOfAnimals.add(dog1)
    listOfAnimals.add(cat)
    listOfAnimals.add(dog)
    listOfAnimals.add(cat1)
    // couldn't call catName from Animal Ref  as it :- println(cat1.catName)
    if (isCat(cat1)) {
        var catShap = cat1 as Cat
    }

    println(cat.toString())


}
fun isCat(animal: Animal):Boolean{
    if (animal is Cat){
        return true
    }else {
        return false
    }
}

fun isWild(animal:Animal):Boolean{

    return animal.isDanger

}