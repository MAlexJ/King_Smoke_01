package com.example.alex.king_smoke_01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import service.Selector_01;


public class HomeScreen extends Activity {

    private Selector_01 selector = new Selector_01();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        ImageView image1 = (ImageView) findViewById(R.id.img_01);
        ImageView image2 = (ImageView) findViewById(R.id.img_01);
        ImageView image3 = (ImageView) findViewById(R.id.img_01);
        ImageView image4 = (ImageView) findViewById(R.id.img_01);
        Button button1 = (Button) findViewById(R.id.button_1);
        Button button2 = (Button) findViewById(R.id.button_1);
        Button button3 = (Button) findViewById(R.id.button_1);
        Button button4 = (Button) findViewById(R.id.button_1);

//        ProductCatalog productCatalog = selector.getProductCatalog();
//        List<Catalog> catalogList = productCatalog.getCatalogList();


//        button1.setText(catalogList.get(0).getName());
//        button2.setText(catalogList.get(1).getName());
//        button3.setText(catalogList.get(2).getName());
//        button4.setText(catalogList.get(3).getName());


    }
}
