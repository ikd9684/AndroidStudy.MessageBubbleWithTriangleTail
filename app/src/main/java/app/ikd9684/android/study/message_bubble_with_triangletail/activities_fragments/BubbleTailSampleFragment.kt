package app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments.commons.BaseFragment
import app.ikd9684.android.study.message_bubble_with_triangletail.databinding.FragmentBubbleTailSampleBinding

class BubbleTailSampleFragment : BaseFragment() {

    private lateinit var binding: FragmentBubbleTailSampleBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        navBarTitle = "サンプル"

        binding = FragmentBubbleTailSampleBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }
}
