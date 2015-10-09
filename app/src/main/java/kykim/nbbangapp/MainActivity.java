package kykim.nbbangapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    // 메인 액티비티 생성
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 액션바의 액션 버튼 생성
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

        // 동일한 코드
        // MenuInflater inflater = getMenuInflater();
        // inflater.inflate(R.menu.main_main, menu);
        // return super.onCreateOptionMenu(menu);
    }

    // 액션 버튼에 대한 응답 처리
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // 현재 응답에 대한 메소드 정의 없음
        switch (id) {
            case R.id.action_search:
                return true;
            case R.id.action_settings:
                return true;
            case R.id.action_user:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}