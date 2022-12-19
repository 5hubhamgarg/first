android manifest file
    <uses-permission android:name="android.permission.INTERNET"/>

MainActivity.java

Within MainActivity

	 private WebView webView;

Within onCreate

		webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");

activity_main.xml

    android:id="@+id/webview"








Within MainActivity

    private ListView listView;


Within OnCreate
        listView = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line,cities);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Clicked " + cities[i], Toast.LENGTH_SHORT).show();
            }
        });

Set the id in design tab of activity xml.        









Image switch

public class MainActivity extends AppCompatActivity {

    ImageSwitcher imgsw;
    Button prev, nex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgsw = findViewById(R.id.imgsw);
        prev = findViewById(R.id.prev);
        nex = findViewById(R.id.next);

        imgsw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

                return imageView;
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            imgsw.setImageResource(R.drawable.zoro);
            }
        });

        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imgsw.setImageResource(R.drawable.zoro);

            }
        });
    }
}



<ImageSwitcher
        android:id="@+id/imgsw"
        android:layout_margin="20dp"
        android:layout_width="match_parent"
        android:layout_height="500dp" />

    <Button
        android:id="@+id/prev"
        android:layout_width="160dp"
        android:layout_height="55dp"
        android:text="Previous"
        tools:layout_editor_absoluteX="20dp"
        tools:layout_editor_absoluteY="539dp"></Button>

    <Button
        android:id="@+id/next"
        android:layout_width="162dp"
        android:layout_height="59dp"
        android:text="Next"
        tools:layout_editor_absoluteX="233dp"
        tools:layout_editor_absoluteY="539dp"></Button>