package com.example.tallyinmobile.menuoptions;

import com.example.tallyinmobile.sales.Estimation;
import com.example.tallyinmobile.sales.Journelentry;
import com.example.tallyinmobile.sales.Paymentvoucher;
import com.example.tallyinmobile.sales.Salesentry;
import com.example.tallyinmobile.sales.Salesreseipt;
import com.mazenet.maze.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Accountingvoucher extends Activity {
	Button btn_back, btn_payment, btn_journal, btn_salesreceipt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.accountingvoucher);

		btn_back = (Button) findViewById(R.id.btn_back);
		btn_payment = (Button) findViewById(R.id.btn_payment);
		btn_journal = (Button) findViewById(R.id.btn_journal);
		btn_salesreceipt = (Button) findViewById(R.id.btn_salesreceipt);

		btn_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				onBackPressed();
			}
		});

		btn_payment.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent it1 = new Intent(Accountingvoucher.this,
						Paymentvoucher.class);
				startActivity(it1);

			}
		});

		btn_journal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent itest = new Intent(Accountingvoucher.this,
						Journelentry.class);
				startActivity(itest);
			}
		});

		btn_salesreceipt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent itest = new Intent(Accountingvoucher.this,
						Salesreseipt.class);
				startActivity(itest);
			}
		});

	}

}
