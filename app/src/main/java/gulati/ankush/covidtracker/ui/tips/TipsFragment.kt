package gulati.ankush.covidtracker.ui.tips

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import gulati.ankush.covidtracker.R

class TipsFragment : Fragment() {

    private lateinit var tipsViewModel: TipsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        tipsViewModel =
                ViewModelProviders.of(this).get(TipsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tips, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        tipsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
