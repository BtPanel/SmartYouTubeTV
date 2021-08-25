package com.liskovsoft.smartyoutubetv.voicesearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.liskovsoft.browser.Browser;
import com.liskovsoft.smartyoutubetv.events.MicClickedEvent;
import com.squareup.otto.Subscribe;

public final class VoiceSearchBusBridge extends VoiceSearchBridge {
    public VoiceSearchBusBridge(FragmentActivity activity) {
        super(activity);

        Browser.getBus().register(this);
    }

    @Subscribe
    public void onMicClicked(MicClickedEvent event) {
        displaySpeechRecognizers();
    }
}
