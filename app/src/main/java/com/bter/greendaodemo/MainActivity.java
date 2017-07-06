package com.bter.greendaodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bter.greendaodemo.greendao.GreenDaoManager;
import com.bter.greendaodemo.greendao.User;
import com.bter.greendaodemo.greendao.dao.UserDao;

public class MainActivity extends AppCompatActivity {

    private TextView mainTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTxt = ((TextView) findViewById(R.id.main_txt));


        User user = new User();
        user.setId(1L);
        user.setMemberSex(1);
        user.setMemberNickname("tom");
        setUser(user);

        User user1 = getUser(1L);
        mainTxt.setText(user1.getMemberNickname());
    }

    public void setUser(User user) {
        getUserDao().insert(user);
    }

    public User getUser(Long id) {
        return getUserDao().load(id);
    }

    public UserDao getUserDao() {
        return GreenDaoManager.getInstance().getmDaoSession().getUserDao();
    }
}
