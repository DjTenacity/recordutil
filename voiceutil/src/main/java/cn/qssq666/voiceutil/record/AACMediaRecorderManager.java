package cn.qssq666.voiceutil.record;

import android.media.MediaRecorder;

import java.io.File;

import cn.qssq666.voiceutil.utils.MediaDirectoryUtils;

/**
 * Created by 情随事迁(qssq666@foxmail.com) on 2017/3/31.
 */

public class AACMediaRecorderManager extends AmrRecorderManager {
    @Override
    protected File getNewFile() {
        File temp = MediaDirectoryUtils.getTempAACFileName();
        return temp;
    }

    @Override
    protected void setMediaOutFormatAndEncoder(MediaRecorder encoder) {
        encoder.setAudioSource(MediaRecorder.AudioSource.DEFAULT);
        encoder.setOutputFormat(MediaRecorder.OutputFormat.AAC_ADTS);
        encoder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
    }
}
