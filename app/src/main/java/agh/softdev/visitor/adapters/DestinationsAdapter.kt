package agh.softdev.visitor.adapters

import agh.softdev.visitor.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.destination_recycler_item.view.*

class DestinationsAdapter(context: Context,images:List<String>,names:List<String>):RecyclerView.Adapter<DestinationsAdapter.DestinationsViewHolder>(){
    var names:List<String>;
    var images: List<String>;
    var context:Context;
    init {
        this.names = names;
        this.images = images;
        this.context = context;
    }

    class DestinationsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val destImage:ImageView = itemView.destImage;
        val destName:TextView = itemView.txtdestname;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.destination_recycler_item,parent,false);
        return DestinationsViewHolder(view);
    }

    override fun onBindViewHolder(holder: DestinationsViewHolder, position: Int) {
        val req = RequestOptions().placeholder(R.drawable.ic_launcher_background);
        Glide.with(context)
            .load(images[position])
            .apply(req)
            .into(holder.destImage);

        holder.destName.text = names[position];
    }

    override fun getItemCount(): Int {
        return names.size;
    }
}