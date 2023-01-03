package com.example.egaytacolod_cle_endterm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.egaytacolod_cle_endterm.Earrings;

public class ListAdapterEarrings extends ArrayAdapter<String> {

    private final Activity Context;
    private final String[] ListItemsName;
    private final Integer[] ImageName;

    public ListAdapterEarrings(Activity context, String[] content,
                       Integer[] ImageName) {

        super(context, R.layout.activity_earrings, content);
        // TODO Auto-generated constructor stub

        this.Context = context;
        this.ListItemsName = content;
        this.ImageName = ImageName;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = Context.getLayoutInflater();
        View ListViewSingle = inflater.inflate(R.layout.list_items_earrings, null, true);

        TextView ListViewItems = (TextView) ListViewSingle.findViewById(R.id.textViewEarrings);
        ImageView ListViewImage = (ImageView) ListViewSingle.findViewById(R.id.imageViewEarrings);

        ListViewItems.setText(ListItemsName[position]);
        ListViewImage.setImageResource(ImageName[position]);
        return ListViewSingle;

    };

}
