package br.com.peak.chegou


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*

class FragmentHome : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance(): FragmentHome = FragmentHome()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onResume() {
        super.onResume()
        tvNewPackage.setOnClickListener(this)
        ivNewPackage.setOnClickListener(this)
        tvListPackages.setOnClickListener(this)
        ivListPackages.setOnClickListener(this)
        ivReports.setOnClickListener(this)
        tvReports.setOnClickListener(this)
        ivConfiguration.setOnClickListener(this)
        tvConfiguration.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.ivNewPackage,R.id.tvNewPackage -> {
                val newPackage = FragmentNewPackage.newInstance()
                openFragment(newPackage)
            }
            R.id.ivListPackages,R.id.tvListPackages -> {
                val newListPackage = FragmentPackages.newInstance()
                openFragment(newListPackage)
            }
            R.id.ivReports,R.id.tvReports -> {
                val reports = FragmentReports.newInstance()
                openFragment(reports)
            }
            R.id.ivConfiguration,R.id.tvConfiguration -> {
                val configuration = FragmentConfiguration.newInstance()
                openFragment(configuration)
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
