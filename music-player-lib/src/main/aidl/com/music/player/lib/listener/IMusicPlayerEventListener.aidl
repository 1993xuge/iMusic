// MusicPlayerEventListener.aidl
package com.music.player.lib.listener;

// Declare any non-default types here with import statements
import com.music.player.lib.bean.BaseAudioInfo;

interface IMusicPlayerEventListener{
    /**
     * 播放器所有状态回调
     * @param playerState 播放器内部状态
     */
    void onMusicPlayerState(in int playerState,in String message);

    /**
     * 播放器准备好了
     * @param totalDurtion 总时长
     */
    void onPrepared(in long totalDurtion);

    /**
     * 缓冲百分比
     * @param percent 百分比
     * 此方法已被废弃，缓冲进度播放器内部使用变量储存，每隔500mm连同播放进度回调至组件
     * 合并至onTaskRuntime方法
     */
    void onBufferingUpdate(in int percent);

    /**
     * 播放器反馈信息
     * @param event 事件
     * @param extra
     */
    void onInfo(in int event, in int extra);

    /**
     * 当前正在播放的任务
     * @param musicInfo 正在播放的对象
     * @param position 当前正在播放的位置
     */

    void onPlayMusiconInfo(in BaseAudioInfo musicInfo, in int position);

    /**
     * 回显内部播放位置至唱片机
     * @param musicInfo 音频对象
     * @param position 内部播放器正在处理的对象位置,相对于当前播放队列
     */
    void onEchoPlayCurrentIndex(in BaseAudioInfo musicInfo,in int position);

    /**
     * 音频地址无效,组件可处理付费购买等逻辑
     * @param musicInfo 播放对象
     * @param position 索引
     */
    void onMusicPathInvalid(in BaseAudioInfo musicInfo,in int position);

    /**
     * @param totalDurtion 音频总时间
     * @param currentDurtion 当前播放的位置
     * @param alarmResidueDurtion 闹钟剩余时长
     * @param bufferProgress 当前缓冲进度
     */
    void onTaskRuntime(in long totalDurtion, in long currentDurtion, in long alarmResidueDurtion, in int bufferProgress);

    /**
     * @param playModel 播放模式
     * @param alarmModel 闹钟模式
     * @param isToast 是否吐司提示
     */
    void onPlayerConfig(in int playModel, in int alarmModel,in boolean isToast);
}
