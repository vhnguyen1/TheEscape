package edu.orangecoastcollege.escapethecatcher;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class GameActivity extends Activity {

    private GestureDetector aGesture;

    //FLING THRESHOLD VELOCITY
    final int FLING_THRESHOLD = 500;

    //BOARD INFORMATION
    final int SQUARE = 150;
    final int OFFSET = 5;
    final int COLUMNS = 7;
    final int ROWS = 8;
    final int gameBoard[][] = {
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 2, 1, 2, 1, 1},
            {1, 2, 2, 2, 2, 2, 1},
            {1, 2, 1, 2, 2, 2, 1},
            {1, 2, 2, 2, 2, 1, 1},
            {1, 2, 2, 2, 2, 2, 3},
            {1, 2, 1, 2, 2, 2, 1},
            {1, 1, 1, 1, 1, 1, 1}
    };

    private Player player;
    private Zombie zombie;

    //LAYOUT AND INTERACTIVE INFORMATION
    private ArrayList<ImageView> visualObjects;
    private RelativeLayout activityGameRelativeLayout;
    private ImageView zombieImageView;
    private ImageView playerImageView;
    private ImageView obstacleImageView;
    private ImageView exitImageView;
    private int exitRow;
    private int exitCol;

    //  WINS AND LOSSES
    private int wins;
    private int losses;
    private TextView winsTextView;
    private TextView lossesTextView;

    private LayoutInflater layoutInflater;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        activityGameRelativeLayout = (RelativeLayout) findViewById(R.id.activity_game);
        winsTextView = (TextView) findViewById(R.id.winsTextView);
        lossesTextView = (TextView) findViewById(R.id.lossesTextView);

        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        resources = getResources();

        visualObjects = new ArrayList<ImageView>();

        wins = 0;
        losses = 0;
        winsTextView.setText(resources.getString(R.string.win) + wins);
        lossesTextView.setText(resources.getString(R.string.losses) + losses);

        startNewGame();
    }

    private void startNewGame() {
        //TASK 1:  CLEAR THE BOARD (ALL IMAGE VIEWS)
        for (int i = 0; i < visualObjects.size(); i++) {
            ImageView visualObj = visualObjects.get(i);
            activityGameRelativeLayout.removeView(visualObj);
        }
        visualObjects.clear();

        //TASK 2:  BUILD THE  BOARD
        buildGameBoard();

        //TASK 3:  ADD THE CHARACTERS
        createZombie();
        createPlayer();
    }

    private void buildGameBoard() {
        // TODO: Inflate the entire game board (obstacles and exit)
    }

    private void createZombie() {
        // TODO: Determine where to place the Zombie (at game start)
        // TODO: Then, inflate the zombie layout
    }

    private void createPlayer() {
        // TODO: Determine where to place the Player (at game start)
        // TODO: Then, inflate the player layout
    }



    private void movePlayer(float velocityX, float velocityY) {
        // TODO: This method gets called in the onFling event

        // TODO: Determine which absolute velocity is greater (x or y)
        // TODO: If x is negative, move player left.  Else if x is positive, move player right.
        // TODO: If y is negative, move player down.  Else if y is positive, move player up.

        // TODO: Then move the zombie, using the player's row and column position.
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}