package app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments.commons

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    protected var navBarVisible = true
        set(value) {
            field = value
            navActivity?.navBarVisible = value
        }
    protected var navBarTitle = ""
        set(value) {
            field = value
            navActivity?.navBarTitle = value
        }
    protected var navBarBackButtonVisible = true
        set(value) {
            field = value
            navActivity?.navBarBackButtonVisible = value
        }

    protected val navActivity: BaseNavigationControllerActivity?
        get() = requireActivity() as? BaseNavigationControllerActivity

    override fun onStart() {
        super.onStart()
        navActivity?.updateNavBar()
    }

    protected fun nextFragment(fragment: BaseFragment) {
        navActivity?.nextFragment(fragment)
    }

    protected fun prevFragment() {
        navActivity?.prevFragment()
    }
}
