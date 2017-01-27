package com.souka.digitaltvapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.view.ViewGroup;

import com.souka.digitaltvapp.activity.DigitalTvActivity;
import com.souka.digitaltvapp.fragment.*;


//public class DigitalTvFragmentPagerAdapter extends FragmentPagerAdapter {
//        // TODO: Rename parameter arguments, choose names that match
//        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//        private final int PAGER_COUNT=4;
//        private ATSCFragment astcFragment=null;
//        private DTMBFragment dtmbFragment=null;
//        private DVBFragment dvbFragment=null;
//        private ISDBFragment isdbFragment=null;
//
//        public DigitalTvFragmentPagerAdapter(FragmentManager fm)
//        {
//            super(fm);
//            astcFragment = new ATSCFragment();
//            dtmbFragment = new DTMBFragment();
//            dvbFragment =new DVBFragment();
//            isdbFragment = new ISDBFragment();
//        }
//
//        public int getCount(){
//            return PAGER_COUNT;
//        }
//
//        @Override
//        public Object instantiateItem(ViewGroup vg, int position) {
//            return super.instantiateItem(vg, position);
//        }
//
//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//            System.out.println("position Destory" + position);
//            super.destroyItem(container, position, object);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            Fragment fragment = null;
//            switch (position) {
//                case DigitalTvActivity.PAGE_ONE:
//                    fragment = astcFragment;
//                    break;
//                case DigitalTvActivity.PAGE_TWO:
//                    fragment = dvbFragment;
//                    break;
//                case DigitalTvActivity.PAGE_THREE:
//                    fragment = isdbFragment;
//                    break;
//                case DigitalTvActivity.PAGE_FOUR:
//                    fragment = dtmbFragment;
//                    break;
//            }
//            return fragment;
//        }

//}
