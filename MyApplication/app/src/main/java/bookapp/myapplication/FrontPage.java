package bookapp.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class FrontPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_front_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Switches to activity_sell_a_book, called when Look for Books is pressed.
     * @param view required param I don't care about
     **/
    public void switchToSell(View view) {
        Intent intent = new Intent(this, SellABook.class);
        startActivity(intent);
    }

    /**
     * Switches to activity_my_information, called when Edit My Information is pressed.
     * @param view required param I don't care about
     **/
    public void switchToMyInformation(View view){
        Intent intent = new Intent(this, MyInformation.class);
        startActivity(intent);
    }

    /**
     * Switches to activity_my_listings, called when Edit My Listings is pressed.
     * @param view required param I don't care about
     **/
    public void switchToListing(View view){
        Intent intent = new Intent(this, MyListings.class);
        startActivity(intent);
    }

    /**
     * Switches to activity_book_search, called when Search for Books is pressed.
     * @param view required param I don't care about
     **/
    public void switchToSearch(View view){
        Intent intent = new Intent(this, BookSearch.class);
        startActivity(intent);
    }
}
