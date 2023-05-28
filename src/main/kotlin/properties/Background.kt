package properties

import constants.Constant

data class Background (
    val color: Constant
){
    fun getColor():Constant{
        return color
    }

}