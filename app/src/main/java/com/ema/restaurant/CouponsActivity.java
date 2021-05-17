package com.ema.restaurant;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CouponsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupons);
    }

    public void activateFirstCoupon(View view) {
        Toast.makeText(getApplicationContext(), "Coupon with 20% off is available and has been activated!", Toast.LENGTH_LONG).show();
        TextView firstCoupon = (TextView) findViewById (R.id.firstCoupon);
        firstCoupon.setText("Coupons available : 0");
        firstCoupon.setTextColor(Color.RED);
    }

    public void activateSecondCoupon(View view) {
        Toast.makeText(getApplicationContext(), "Coupon with 30% off is not available and cannot be activated!", Toast.LENGTH_LONG).show();
    }

    public void activateThirdCoupon(View view) {
        Toast.makeText(getApplicationContext(), "Coupon with 50% off is not available and cannot be activated!", Toast.LENGTH_LONG).show();
    }

    public void activateFourthCoupon(View view) {
        Toast.makeText(getApplicationContext(), "Coupon with 70% off is not available and cannot be activated!", Toast.LENGTH_LONG).show();
    }
}
