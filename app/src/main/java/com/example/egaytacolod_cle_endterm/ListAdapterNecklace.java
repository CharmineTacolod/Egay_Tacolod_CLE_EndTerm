package com.example.egaytacolod_cle_endterm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.egaytacolod_cle_endterm.Necklace;

public class ListAdapterNecklace extends ArrayAdapter<String> {

    private final Activity Context;
    private final String[] ListItemsName;
    private final Integer[] ImageName;

    public ListAdapterNecklace(Activity context, String[] content,
                               Integer[] ImageName) {

        super(context, R.layout.activity_necklace, content);
        // TODO Auto-generated constructor stub

        this.Context = context;
        this.ListItemsName = content;
        this.ImageName = ImageName;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = Context.getLayoutInflater();
        View ListViewSingle = inflater.inflate(R.layout.list_items_necklace, null, true);

        TextView ListViewItems = (TextView) ListViewSingle.findViewById(R.id.textViewNecklace);
        ImageView ListViewImage = (ImageView) ListViewSingle.findViewById(R.id.imageViewNecklace);

        ListViewItems.setText(ListItemsName[position]);
        ListViewImage.setImageResource(ImageName[position]);
        return ListViewSingle;

    };

}
