package ratik.edu.fullerton.cpsc411.miniapp4

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import ratik.edu.fullerton.cpsc411.miniapp4.databinding.FragmentConversionBinding



class ConversionFragment : androidx.fragment.app.Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        val binding = DataBindingUtil.inflate<FragmentConversionBinding>(inflater,R.layout.fragment_conversion,container,false)
        binding.conversionViewModel= ViewModelProviders.of(this).get(ConversionViewModel::class.java)
        binding.setLifecycleOwner(this)

        return binding.root

        //return LayoutInflater.from(container?.context).inflate(R.layout.fragment_conversion,container,false )
    }
}
