package kr.co.tjoeun.viewpager_20200818.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20200818.fragments.AddressFragment
import kr.co.tjoeun.viewpager_20200818.fragments.NameFragment
import kr.co.tjoeun.viewpager_20200818.fragments.PhoneNumFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if (position == 0) {
            return "이름"
        }
        else if (position == 1) {
            return "폰번"
        }
        else {
            return "거주지"
        }
    }

    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return NameFragment()
        }
        else if (position == 1) {
            return PhoneNumFragment()
        }
        else {
            return AddressFragment()
        }

    }

    override fun getCount(): Int {
        return 3
    }
}