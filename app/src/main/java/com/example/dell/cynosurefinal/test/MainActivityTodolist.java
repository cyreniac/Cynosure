
final ArrayList<String> do_list = new ArrayList<String>();
final ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1, do_list);

        lv.setAdapter(adapter);

        text.setOnKeyListener(new View.OnKeyListener() {

@Override
public boolean onKey(View v, int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
        if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
        || (keyCode == KeyEvent.KEYCODE_ENTER)) {
        do_list.add(0, text.getText().toString());
        adapter.notifyDataSetChanged();
        text.setText("");
        return true;
        }
        }
        return false;
        }
        });
        }

@Override
public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        }

        }
