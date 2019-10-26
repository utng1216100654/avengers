package mx.utng.aservin.avengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

    } // fin de OnCreate

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: Int = 1

        when (item.itemId){
            R.id.itmIronMan-> msg=1
            R.id.itmSpiderman-> msg=2
            R.id.itmCapitan->msg=3
            R.id.itmSalir->msg=4
        }

        when(msg){

            1 ->  startActivity(Intent(this,IronManActivity::class.java))
            2->startActivity(Intent(this,SpidermanActivity::class.java))
            3-> startActivity(Intent(this,CapitanActivity::class.java))
            else -> System.exit(0)

        }
        //Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}