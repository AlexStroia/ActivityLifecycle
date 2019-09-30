package ro.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openGarageDoor()
        unlockCarAndGetIn()
        closeCarDoorAndPutOnSeatbelt()
        putKeyInIgnition()
    }

    override fun onStart() {
        super.onStart()
        startEngine()
        changeRadioStation()
        switchOnLightsIfNeeded()
        switchOnWipersIfNeeded()
    }

    override fun onResume() {
        super.onResume()
        applyFootBrake()
        releaseHandBrake()
        putCarInGear()
        drive()
    }

    override fun onPause() {
        super.onPause()
        putCarInNeutral()
        applyHandBrake()
    }

    override fun onStop() {
        super.onStop()
        switchEveryThingOff()
        removeSeatBeltAndGetOutOfCar()
        turnOffEngine()
        lockCar()
    }

    override fun onDestroy() {
        super.onDestroy()
        enterOfficeBuilding()
    }


    fun openGarageDoor() {
        println("Opening garage door..")
    }

    fun unlockCarAndGetIn() {
        println("Unlocking the car..")
    }

    fun closeCarDoorAndPutOnSeatbelt() {
        println("Clossing the door and putting the seatbelt..")
    }

    fun putKeyInIgnition() {
        println("Putting the key in ignition")
    }

    fun startEngine() {
        println("Starting the engine..")
    }

    fun changeRadioStation() {
        println("Changing the radioStation")
    }

    fun switchOnLightsIfNeeded() {
        println("Lightssssssssssss")
    }

    fun switchOnWipersIfNeeded() {
        println("Whipeeeeers")
    }

    fun applyFootBrake() {
        println("Applying foot brake..")
    }

    fun applyHandBrake() {
        println("Applying hand brake..")
    }

    fun releaseHandBrake() {
        println("Releasing the handbrake")
    }

    fun putCarInGear() {
        println("Putting the car in gear :)")
    }

    fun drive() {
        println("Lets drive!")
    }

    fun putCarInNeutral() {
        println("Car is in neutral")
    }

    fun switchEveryThingOff() {
        println("Switching off")
    }

    fun turnOffEngine() {
        println("Turning off the engine")
    }

    fun removeSeatBeltAndGetOutOfCar() {
        println("Getting out of the car..")
    }

    fun lockCar() {
        println("Lets lock the car!")
    }

    fun enterOfficeBuilding() {
        println("Yay, at the office :)")
    }
}
