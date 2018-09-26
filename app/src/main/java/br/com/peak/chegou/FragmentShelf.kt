package br.com.peak.chegou


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

const val FRAGMENT_IDENTIFIER: String = "FragmentShelf"

class FragmentShelf : Fragment() {

    companion object {
        fun newInstance(): FragmentShelf = FragmentShelf()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_shelf, container, false)
    }
}
