package br.com.peak.chegou


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_success.*

const val TEXT_TO_SHOW:String = "MessageToShow"
const val BACK_FRAGMENT:String = "OriginFragment"

class FragmentSuccess : Fragment(),View.OnClickListener  {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_success, container, false)
    }

    override fun onResume() {
        super.onResume()
        val text:String? = arguments?.getString(TEXT_TO_SHOW)
        tvSuccessInfo.text = text
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.btSucessOk -> {
                val text:String? = arguments?.getString(BACK_FRAGMENT)
                fragmentManager!!.popBackStack(text, FragmentManager.POP_BACK_STACK_INCLUSIVE)
            }
        }
    }
}
