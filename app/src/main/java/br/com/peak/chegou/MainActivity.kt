package br.com.peak.chegou

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: ActionBar

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                toolbar.title = "Novo Pacote"
                val homeFragment = FragmentHome.newInstance()
                openFragment(homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_packages -> {
                toolbar.title = "Pacotes"
                val packagesFragment = FragmentPackages.newInstance()
                openFragment(packagesFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_reports -> {
                toolbar.title = "Relatórios"
                val reportsFragment = FragmentReports.newInstance()
                openFragment(reportsFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = supportActionBar!!

        initializeFragment()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun initializeFragment(){
        navigation.selectedItemId = R.id.navigation_packages
        toolbar.title = "Pacotes"
        val packagesFragment = FragmentPackages.newInstance()
        openFragment(packagesFragment)
    }
}
