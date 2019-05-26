// MusicPlayerEventListener.aidl
package com.music.player.lib.listener;

// Declare any non-default types here with import statements
import com.music.player.lib.bean.BaseAudioInfo;

interface IMusicPlayerInfoListener{
    /**
     * 播放器对象发生了变化
     * @param musicInfo 播放器内部正在处理的音频对象
     * @param position 位置
     */
    void onPlayMusiconInfo(in BaseAudioInfo musicInfo, int position);
}
