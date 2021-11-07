package com.kim.landapp_kim.data

class Room(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) {

    fun getFormattedFloor() : String{

    if(this.floor >= 1){

        return "${this.floor}층"
    }

    else if(this.floor == 0){

        return "반지하"
    }

        else{

            return "지하 ${-this.floor}층"}

    }

}