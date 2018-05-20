package listviewtest.example.com.listviewtest;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        Fruit fruit = getItem(position);    //get current fruit object
//        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
//
//        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
//        TextView fruitName = (TextView)view.findViewById(R.id.fruit_name);
//        fruitImage.setImageResource(fruit.getImageId());
//        fruitName.setText(fruit.getName());
//        return view;


//        Fruit fruit = getItem(position);    //get current fruit object
//        View view ;
//        if(convertView==null){
//            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
//        }else{
//            view = convertView;
//        }
//
//
//        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
//        TextView fruitName = (TextView)view.findViewById(R.id.fruit_name);
//        fruitImage.setImageResource(fruit.getImageId());
//        fruitName.setText(fruit.getName());
//        return view;

        Fruit fruit = getItem(position);    //get current fruit object
        View view ;
        ViewHolder viewHolder;
        if(convertView==null){

            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder); // put viewHolder object into Tag.
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }
}
