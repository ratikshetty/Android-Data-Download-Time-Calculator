package ratik.edu.fullerton.cpsc411.miniapp4

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.transaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null){
//            val ft= supportFragmentManager.beginTransaction()
//            ft.replace(R.id.fragment_container,ConversionFragment())
//            ft.commit()

            supportFragmentManager.transaction(allowStateLoss = true) {
                replace(R.id.fragment_container,ConversionFragment())
            }
        }
    }
}
