package ratik.edu.fullerton.cpsc411.miniapp4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Exception
import java.text.DecimalFormat

class ConversionViewModel: ViewModel() {


    val downloadSize = MutableLiveData<String>()
    var conversion = MutableLiveData<String>()
    val networkSpeed = MutableLiveData<String>()




    fun onNewValue(speed:String?,size:String?){

        try{
            downloadSize.value=size
            networkSpeed.value=speed
            if (networkSpeed.value == "" || downloadSize.value== "" || networkSpeed.value == "." || downloadSize.value == "." || networkSpeed.value == null || downloadSize.value == null) {


                conversion.value= ""

                } else {

                convert(java.lang.Float.parseFloat(networkSpeed.value), java.lang.Float.parseFloat(downloadSize.value))

            }
        } catch (e: Exception){
        }
    }

    fun convert(networkSpeed: Float, downloadSize: Float) {
        var Speed = networkSpeed
        var Size = downloadSize
        val conversionTemp: Float

        Size = downloadSize * 1024
        Speed = networkSpeed * 1000


        if (Size.toString().equals("0.0") && Speed.toString().equals("0.0")) {



            conversion.value= ""

        } else {
            conversionTemp = Size!! * 8 / Speed!!
            val value = DecimalFormat("#.#")


            conversion.value= "Download Time: " + value.format(conversionTemp.toDouble()).toString() + " sec."

        }
    }




}