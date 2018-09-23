package br.com.peak.chegou


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentPackages : Fragment() {

    companion object {
        fun newInstance(): FragmentPackages = FragmentPackages()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_packages, container, false)
    }


}
