package br.com.peak.chegou


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentConfiguration : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance(): FragmentConfiguration = FragmentConfiguration()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_configuration, container, false)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.ivNewShelf,R.id.tvNewShelf -> {
                val newShelf = FragmentShelf.newInstance()
                openFragment(newShelf)
            }
            R.id.ivNewRecipient,R.id.tvNewRecipient -> {

            }
        }
    }

    fun openFragment(fragment: Fragment){
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
