package com.lovemyhome.hellowali;

import android.os.Handler;
import android.util.Log;

import com.baidu.aip.asrwakeup3.core.recog.RecogResult;
import com.baidu.aip.asrwakeup3.core.recog.listener.MessageStatusRecogListener;
import com.lovemyhome.hellowali.control.MySyntherizer;

public class MyTtsRecogListener extends MessageStatusRecogListener {
    private MySyntherizer mySyntherizer;

    public MyTtsRecogListener(Handler handler, MySyntherizer mySyntherizer) {

        super(handler);
        this.mySyntherizer = mySyntherizer;
}

    @Override
    public void onAsrFinalResult(String[] results, RecogResult recogResult) {
        String [] strs =  {"你好, hard code"};
        results = strs;
        super.onAsrFinalResult(results, recogResult);
        Log.d("here", mySyntherizer.toString());
        mySyntherizer.speak("我在这儿， 收到");


    }
}
