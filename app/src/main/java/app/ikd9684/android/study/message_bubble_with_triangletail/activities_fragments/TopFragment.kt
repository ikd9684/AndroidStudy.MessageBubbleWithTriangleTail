package app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments.commons.BaseFragment
import app.ikd9684.android.study.message_bubble_with_triangletail.databinding.FragmentTopBinding

class TopFragment : BaseFragment() {

    private lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        navBarTitle = "メニュー"

        binding = FragmentTopBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            nextFragment(BubbleTailSampleFragment())
        }
    }
}
