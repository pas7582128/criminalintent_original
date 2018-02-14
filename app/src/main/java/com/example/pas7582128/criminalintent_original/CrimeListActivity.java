package com.example.pas7582128.criminalintent_original;

import android.support.v4.app.Fragment;

/**
 * Created by pas7582128 on 4/1/18.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
