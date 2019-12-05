package devsbox.com.jihanislam007.productrecommendation.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import devsbox.com.jihanislam007.productrecommendation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VisualSearchFragment extends Fragment {


    public VisualSearchFragment() {
        // Required empty public constructor
    }
    LinearLayout productLL,barcodeLL,visualSearchLL,homeLL;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView  =   inflater.inflate(R.layout.fragment_visual_search, container, false);

        homeLL = rootView.findViewById(R.id.homeLL);
        visualSearchLL = rootView.findViewById(R.id.visualSearchLL);
        barcodeLL = rootView.findViewById(R.id.barcodeLL);
        productLL = rootView.findViewById(R.id.productLL);


        navButton();


        return rootView;
    }

    public void navButton(){

        homeLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment = new HomeFragment();
                //recipeListFragment.setArguments(bundle);
                //   Toast.makeText(mcontext, "Image :"+String.valueOf(bundle), Toast.LENGTH_SHORT).show();
                FragmentTransaction fragTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragTransaction.replace(R.id.nav_host_fragment,homeFragment );
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });

        visualSearchLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VisualSearchFragment visualSearchFragment = new VisualSearchFragment();
                //recipeListFragment.setArguments(bundle);
                //   Toast.makeText(mcontext, "Image :"+String.valueOf(bundle), Toast.LENGTH_SHORT).show();
                FragmentTransaction fragTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragTransaction.replace(R.id.nav_host_fragment,visualSearchFragment );
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });

        barcodeLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ScanBarcodeFragment scanBarcodeFragment = new ScanBarcodeFragment();
                //recipeListFragment.setArguments(bundle);
                //   Toast.makeText(mcontext, "Image :"+String.valueOf(bundle), Toast.LENGTH_SHORT).show();
                FragmentTransaction fragTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragTransaction.replace(R.id.nav_host_fragment,scanBarcodeFragment );
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });

        productLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ResultFragment resultFragment = new ResultFragment();
                //recipeListFragment.setArguments(bundle);
                //   Toast.makeText(mcontext, "Image :"+String.valueOf(bundle), Toast.LENGTH_SHORT).show();
                FragmentTransaction fragTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragTransaction.replace(R.id.nav_host_fragment,resultFragment );
                fragTransaction.addToBackStack(null);
                fragTransaction.commit();

            }
        });



    }

}
