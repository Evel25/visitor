package agh.softdev.visitor

import agh.softdev.visitor.adapters.DestinationsAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_distinations.*

class Distinations : AppCompatActivity() {

    var images:List<String> = ArrayList();
    var names:List<String> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distinations)

        initItems();
        initRecycler();
    }

    private fun initItems(){
        //images += "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg";
        //names += "Havasu Falls";

        images += "https://i.redd.it/qn7f9oqu7o501.jpg";
        names += "Malaga";

        images +="https://i.redd.it/j6myfqglup501.jpg";
        names += "Australia";


        images += "https://i.redd.it/0h2gm1ix6p501.jpg";
        names += "Morocco";

        images += "https://i.redd.it/tpsnoz5bzo501.jpg";
        names += "Africa";

        images += "https://i.redd.it/k98uzl68eh501.jpg";
        names += "China";

        images += "https://i.redd.it/glin0nwndo501.jpg";
        names += "White Sands Desert";

        images += "https://i.redd.it/obx4zydshg601.jpg";
        names += "Argentina";

        images += "https://i.imgur.com/ZcLLrkY.jpg";
        names += "Washington";
    }

    private fun initRecycler(){
        val adapter = DestinationsAdapter(this,images,names);
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL);
        distinationsList.layoutManager = staggeredGridLayoutManager;
        distinationsList.adapter = adapter;
    }
}
