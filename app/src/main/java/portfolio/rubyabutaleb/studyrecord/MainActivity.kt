package portfolio.rubyabutaleb.studyrecord

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.support.constraint.solver.widgets.WidgetContainer
import android.support.design.widget.FloatingActionButton
import android.widget.Button

class MainActivity : AppCompatActivity() {


    var isFragmentHomeLoaded = true
    val manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toAboutUs = findViewById<Button>(R.id.btn_change)
        ShowFragmentHome()
        toAboutUs.setOnClickListener{
            if(isFragmentHomeLoaded)
                ShowFragmentRecord()
            else
                ShowFragmentHome()
        }

        val toPopup = findViewById<FloatingActionButton>(R.id.fab)
        ShowFragmentHome()
        toPopup.setOnClickListener{
            if(isFragmentHomeLoaded)
                ShowFragmentPopup()
            else
                ShowFragmentHome()
        }

        val playMusic = findViewById<FloatingActionButton>(R.id.fab)
        playMusic.setOnClickListener{
            val intent = Intent(MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH)
            intent.data = Uri.parse("spotify:album:4xnq1L6P551Qcb9gBXNMK7")
            intent.putExtra(
                Intent.EXTRA_REFERRER,
                Uri.parse("android-app://" + "edu.fullerton.cpsc411.spotifyapp")
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }



    }

    fun ShowFragmentHome(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentHome()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentHomeLoaded = true
    }

    fun ShowFragmentRecord(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentRecord()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentHomeLoaded = false
    }

    fun ShowFragmentPopup(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentPopup()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentHomeLoaded = false
    }

}
