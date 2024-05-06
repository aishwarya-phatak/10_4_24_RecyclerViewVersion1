package in.bitcode.a10_4_24_recyclerviewversion1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView productsRecyclerView;
    ProductAdapter productAdapter;
    ArrayList<String> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initProducts();
        initViews();
    }

    private void initViews(){
        productsRecyclerView = findViewById(R.id.productRecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                true);
        productsRecyclerView.setLayoutManager(linearLayoutManager);
        productAdapter = new ProductAdapter(products);
        productsRecyclerView.setAdapter(productAdapter);

    }

    private void initProducts(){
        products = new ArrayList<String>();
        for(int i = 0;i < 5; i++){
            products.add("T-Shirt" + i);
            products.add("Mixer" + i);
            products.add("Laptop" + i);
            products.add("Charger" + i);
            products.add("Remote" + i);
        }
    }
}