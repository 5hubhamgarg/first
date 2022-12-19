@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("log-name","ON CREATE ACT");
        Toast.makeText(this,"On Create ACT",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("log-name","ON START ACT");
        Toast.makeText(this,"On Start ACT",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("log-name","ON RESUME ACT");
        Toast.makeText(this,"On Resume ACT",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("log-name","ON PAUSE ACT");
        Toast.makeText(this,"On Pause ACT",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("log-name","ON STOP ACT");
        Toast.makeText(this,"On Stop ACT",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("log-name","ON DESTROY ACT");
        Toast.makeText(this,"On Destroy ACT",Toast.LENGTH_SHORT).show();

    }