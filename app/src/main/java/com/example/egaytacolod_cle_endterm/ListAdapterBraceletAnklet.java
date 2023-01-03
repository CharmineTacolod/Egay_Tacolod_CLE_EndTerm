package com.example.egaytacolod_cle_endterm;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.egaytacolod_cle_endterm.BraceletAndAnklet;

public class ListAdapterBraceletAnklet extends ArrayAdapter<String> {

    private final Activity Context;
    private final String[] ListItemsName;
    private final Integer[] ImageName;

    public ListAdapterBraceletAnklet(Activity context, String[] content,
                               Integer[] ImageName) {

        super(context, R.layout.activity_bracelet_and_anklet, content);
        // TODO Auto-generated constructor stub

        this.Context = context;
        this.ListItemsName = content;
        this.ImageName = ImageName;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = Context.getLayoutInflater();
        View ListViewSingle = inflater.inflate(R.layout.list_item_bracelet_anklet, null, true);

        TextView ListViewItems = (TextView) ListViewSingle.findViewById(R.id.textViewBraceletAnklet);
        ImageView ListViewImage = (ImageView) ListViewSingle.findViewById(R.id.imageViewBraceletAnklet);

        ListViewItems.setText(ListItemsName[position]);
        ListViewImage.setImageResource(ImageName[position]);
        return ListViewSingle;

    };

}
