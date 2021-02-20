package app.ikd9684.android.study.message_bubble_with_triangletail.activities_fragments.commons

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import app.ikd9684.android.study.message_bubble_with_triangletail.R
import app.ikd9684.android.study.message_bubble_with_triangletail.databinding.ActivityBaseNavigationControllerBinding

abstract class BaseNavigationControllerActivity : BaseActivity() {

    private lateinit var binding: ActivityBaseNavigationControllerBinding

    var navBarVisible = true
        set(value) {
            field = value
            updateNavBar()
        }
    var navBarTitle = ""
        set(value) {
            field = value
            updateNavBar()
        }
    var navBarBackButtonVisible = true
        set(value) {
            field = value
            updateNavBar()
        }

    abstract fun getInitialFragment(): BaseFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_base_navigation_controller
        )

        binding.buttonNavBack.setOnClickListener {
            prevFragment()
        }

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navContainer, getInitialFragment())
        fragmentTransaction.commit()
    }

    fun updateNavBar() {
        Handler(Looper.getMainLooper()).post {
            binding.navBar.isVisible = navBarVisible
            binding.textNavTitle.text = navBarTitle

            if (supportFragmentManager.backStackEntryCount == 0) {
                binding.buttonNavBack.isVisible = false
            } else {
                binding.buttonNavBack.isVisible = navBarBackButtonVisible
            }
        }
    }

    fun nextFragment(fragment: BaseFragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.replace(R.id.navContainer, fragment)
        fragmentTransaction.commit()
    }

    fun prevFragment() {
        supportFragmentManager.popBackStack()
    }
}
