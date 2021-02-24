package mcm.edu.ph.montero_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);

        int birthYear = 2002;
        int birthMonth = 9;
        int birthDay = 1;

        int currentYear = 2021;
        int currentMonth = 2;
        int currentDay = 24;

        int ageInYears, ageInMonths, ageInDays;

        if(birthMonth > currentMonth){
            currentMonth += 12;
            currentYear -= 1;
        }
        if(birthDay > currentDay){
            currentDay += 30;
            currentMonth -= 1;
        }

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My precise age is \n"+
                String.valueOf(ageInYears)+
                " Years \n"+
                String.valueOf(ageInMonths)+
                " Months \n"+
                String.valueOf(ageInDays)+
                " Days ");



    }
}