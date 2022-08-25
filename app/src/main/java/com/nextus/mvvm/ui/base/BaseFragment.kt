package com.nextus.mvvm.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<B: ViewDataBinding>(
    @LayoutRes var layoutResId: Int
) : Fragment(layoutResId) {

    private var _binding: B? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate<B>(inflater, layoutResId, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


/*

/**
 * To be implemented by components that host top-level navigation destinations.
 */
interface NavigationHost {

    /** Called by MainNavigationFragment to setup it's toolbar with the navigation controller. */
    fun registerToolbarWithNavigation(toolbar: Toolbar)
}

/**
 * To be implemented by main navigation destinations shown by a [NavigationHost].
 */
interface NavigationDestination {

    /** Called by the host when the user interacts with it. */
    fun onUserInteraction() {}
}


abstract class BaseFragment<B: ViewDataBinding>(
    @LayoutRes var layoutResId: Int
) : Fragment(layoutResId), NavigationDestination {

    @Inject
    lateinit var analyticsHelper: AnalyticsHelper

    private var mViewDataBinding: B? = null
    protected var navigationHost: NavigationHost? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is NavigationHost) {
            navigationHost = context
        }
    }

    override fun onDetach() {
        navigationHost = null
        mViewDataBinding = null
        hideSystemKeyboard()
        super.onDetach()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mViewDataBinding = DataBindingUtil.inflate(inflater, layoutResId, container, false)
        return mViewDataBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // If we have a toolbar and we are attached to a proper navigation host, set up the toolbar
        // navigation icon.
        val host = navigationHost ?: return
        val mainToolbar: Toolbar = view.findViewById(R.id.toolbar) ?: return
        mainToolbar.apply {
            host.registerToolbarWithNavigation(this)
        }
    }

    fun initBinding(viewModel: ViewModel) {
        analyticsHelper.sendScreenView(javaClass.simpleName, requireActivity())
        mViewDataBinding?.run {
            setVariable(BR.viewModel, viewModel)
            lifecycleOwner = viewLifecycleOwner
            executePendingBindings()
        }
    }

    fun showSystemKeyboard(view: View) {
        view.requestFocus()
        (requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).showSoftInput(view, 0)
    }

    fun hideSystemKeyboard() {
        mViewDataBinding?.let {
            (requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(
                getBinding()?.root?.windowToken, 0)
        }
    }

    fun getBinding(): B? = mViewDataBinding

    override fun onOptionsItemSelected(menuItem: MenuItem): Boolean {
        return when (menuItem.itemId) {
            android.R.id.home -> {
                hideSystemKeyboard()
                return false
            }
            else -> {
                super.onOptionsItemSelected(menuItem)
            }
        }
    }
}

 */