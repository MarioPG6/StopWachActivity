package co.edu.unipiloto.stopwatchactivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.app.Activity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class StopwatchActivity extends Activity {
    private int seconds = 0;
    private boolean running;
    private ArrayList<Integer> tiempoVueltas = new ArrayList<>();
    private static final int MAX_LAPS = 5;
    private TextView lapView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        lapView=findViewById(R.id.vueltas_view);

        if (savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            updateVueltasView();
        }
        runTimer();
    }
    public void onClickStart(View view){
        running = true;
    }
    public void onClickStop(View view){
        running = false;
    }
    public void onClickReset(View view){
        running = false;
        seconds = 0;
        tiempoVueltas.clear();
        updateVueltasView();
    }
    public void onClickLap(View view){
        if (tiempoVueltas.size()<MAX_LAPS) {
            tiempoVueltas.add(seconds);
            updateVueltasView();
        }
            if (tiempoVueltas.size()==MAX_LAPS){
                running=false;
            }

    }
    private void runTimer(){
        final TextView timeView = findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
    private void updateVueltasView(){
        StringBuilder lapText = new StringBuilder("Laps:\n");
        for (int i = 0; i < tiempoVueltas.size(); i++) {
            int vuelta = tiempoVueltas.get(i);
            int minutos = (vuelta%3600)/60;
            int seg =vuelta%60;
            lapText.append(String.format(Locale.getDefault(), "Lap %d: %02d:%02d\n", i + 1, minutos, seg));
        }
        lapView.setText(lapText.toString());
    }
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putIntegerArrayList("lapTimes", tiempoVueltas);
    }
}