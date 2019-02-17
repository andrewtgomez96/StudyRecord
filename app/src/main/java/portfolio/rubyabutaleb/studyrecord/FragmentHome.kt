package portfolio.rubyabutaleb.studyrecord

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class FragmentHome : Fragment(){

    val TAG = "FragmentHome"


    override fun onAttach(context: Context?) {
        Log.d(TAG, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?){
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView")
        return inflater!!.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG, "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG, "onDetach")
        super.onDetach()
    }
}
