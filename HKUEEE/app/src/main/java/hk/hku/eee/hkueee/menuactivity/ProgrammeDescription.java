package hk.hku.eee.hkueee.menuactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import hk.hku.eee.hkueee.R;
import hk.hku.eee.hkueee.program.ExpandableListViewAdapter;


public class ProgrammeDescription extends AppCompatActivity {
    private ExpandableListView expandableListView;

    private ExpandableListViewAdapter expandableListViewAdapter;

    private List<String> listDataGroup;

    private HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programme_description);
        // initializing the views
        initViews();

        // initializing the listeners
        initListeners();

        // initializing the objects
        initObjects();

        // preparing list data
        initListData();

    }
    /**
     * method to initialize the views
     */
    private void initViews() {

        expandableListView = findViewById(R.id.expandableListView);

    }
    /**
     * method to initialize the listeners
     */
    private void initListeners() {

        // ExpandableListView on child click listener
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        listDataGroup.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataGroup.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });

        // ExpandableListView Group expanded listener
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataGroup.get(groupPosition) + " " + getString(R.string.text_expanded),
                        Toast.LENGTH_SHORT).show();
            }
        });

        // ExpandableListView Group collapsed listener
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataGroup.get(groupPosition) + " " + getString(R.string.text_collapsed),
                        Toast.LENGTH_SHORT).show();

            }
        });

    }

    /**
     * method to initialize the objects
     */
    private void initObjects() {

        // initializing the list of groups
        listDataGroup = new ArrayList<>();

        // initializing the list of child
        listDataChild = new HashMap<>();

        // initializing the adapter object
        expandableListViewAdapter = new ExpandableListViewAdapter(this, listDataGroup, listDataChild);

        // setting list adapter
        expandableListView.setAdapter(expandableListViewAdapter);

    }

    /*
     * Preparing the list data
     *
     * Dummy Items
     */
    private void initListData() {


        // Adding group data
        listDataGroup.add(getString(R.string.text_Definition_and_Terminology));
        listDataGroup.add(getString(R.string.text_Curriculum_Structure));
        listDataGroup.add(getString(R.string.text_Subject_Groups));
        listDataGroup.add(getString(R.string.text_Dissertation_Information));

        // array of strings
        String[] array;

        // list of alcohol
        List<String> Definition_and_Terminology_List = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_Definition_and_Terminology);
        for (String item : array) {
            Definition_and_Terminology_List.add(item);
        }

        // list of coffee
        List<String> Curriculum_Structure_List = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_Curriculum_Structure);
        for (String item : array) {
            Curriculum_Structure_List.add(item);
        }

        // list of pasta
        List<String> Subject_Groups_List = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_Subject_Groups);
        for (String item : array) {
            Subject_Groups_List.add(item);
        }

        // list of cold drinks
        List<String> Dissertation_Information_List = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_Dissertation_Information);
        for (String item : array) {
            Dissertation_Information_List.add(item);
        }

        // Adding child data
        listDataChild.put(listDataGroup.get(0), Definition_and_Terminology_List);
        listDataChild.put(listDataGroup.get(1), Curriculum_Structure_List);
        listDataChild.put(listDataGroup.get(2), Subject_Groups_List);
        listDataChild.put(listDataGroup.get(3), Dissertation_Information_List);

        // notify the adapter
        expandableListViewAdapter.notifyDataSetChanged();
    }


}
