package app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments

import app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments.commons.BaseFragment
import app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments.commons.BaseNavigationControllerActivity

class MainActivity : BaseNavigationControllerActivity() {
    override fun getInitialFragment(): BaseFragment {
        return TopFragment()
    }
}
