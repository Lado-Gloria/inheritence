fun main() {
   var car = Car("Toyota","Toyota supra","brown",8,)
    car.carry(8)
    car.carry(6)
    car.identity()
    println( car.calculatePark(2))
var bus =Bus("minibus","deckerbus","Red",68)
    bus.maxTripe(20.5)
    bus.calculatePark(5)






}
 open class Car(var make: String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        if (people == capacity) {
            println("Carrying $people passenger")}
           else{
               var x:Int = capacity+people
               println("Over capacity by $people")

        }
    }
    fun identity(){
        println("I am a $color,$model")
    }
    open fun calculatePark(hour:Int):Int{
        var parkingFees = hour*20
        return parkingFees
    }
}
class Bus(make: String, model:String,color:String, capacity:Int,):Car(make,model,color,capacity){
    fun maxTripe(fare:Double):Double{
        return fare*capacity


    }
    override fun calculatePark(hour:Int):Int{
        return hour*capacity

    }

}

