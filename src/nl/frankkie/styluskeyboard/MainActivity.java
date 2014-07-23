package nl.frankkie.styluskeyboard;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    Button langsettings = (Button) findViewById(R.id.main_btn_langsettings);
    langsettings.setOnClickListener(new OnClickListener() {

      public void onClick(View arg0) {
        try {
          startActivityForResult(new Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS), 0);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
    Button help = (Button) findViewById(R.id.main_btn_help);
    help.setOnClickListener(new OnClickListener() {

      public void onClick(View arg0) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://frankkie.nl/android/styluskeyboard/help.php"));
        startActivity(i);
      }
    });
  }
}
