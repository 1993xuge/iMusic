package com.music.player.lib.service;

import android.app.Notification;
import android.os.RemoteException;
import com.music.player.lib.bean.BaseAudioInfo;
import com.music.player.lib.iinterface.MusicPlayerPresenter;
import com.music.player.lib.listener.IMusicPlayerEventListener;
import com.music.player.lib.listener.IMusicPlayerInfoListener;
import com.music.player.lib.util.Logger;
import java.util.List;

/**
 * TinyHung@Outlook.com
 * 2019/3/8
 * Music Service Binder
 * MusicPlayerService 的中间代理人
 * 自1.0.9版本被AIDL替代
 */

@Deprecated
public class MusicPlayerBinder extends IMusicPlayerService.Stub{

    private static final String TAG = "MusicPlayerBinder";

    private final MusicPlayerPresenter mPresenter;

    public MusicPlayerBinder(MusicPlayerPresenter presenter){
        this.mPresenter=presenter;
    }

    @Override
    public void startPlayMusic(List<BaseAudioInfo> audios, int index) throws RemoteException {
        Logger.d(TAG,"startPlayMusic-->");
        if(null!=mPresenter){
            mPresenter.startPlayMusic(audios,index);
        }
    }

    @Override
    public void startPlayMusic1(int index) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.startPlayMusic(index);
        }
    }

    @Override
    public void addPlayMusicToTop(BaseAudioInfo audioInfo) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.addPlayMusicToTop(audioInfo);
        }
    }

    @Override
    public void playOrPause() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.playOrPause();
        }
    }

    @Override
    public void pause() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.pause();
        }
    }

    @Override
    public void play() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.play();
        }
    }

    @Override
    public void setLoop(boolean loop) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.setLoop(loop);
        }
    }

    @Override
    public void continuePlay(String sourcePath) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.continuePlay(sourcePath);
        }
    }

    @Override
    public void continuePlay1(String sourcePath, int index) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.continuePlay(sourcePath,index);
        }
    }

    @Override
    public void onReset() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.onReset();
        }
    }

    @Override
    public void onStop() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.onStop();
        }
    }

    @Override
    public void updateMusicPlayerData(List<BaseAudioInfo> audios, int index) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.updateMusicPlayerData(audios,index);
        }
    }

    @Override
    public int setPlayerModel(int model) throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.setPlayerModel(model);
        }
        return 0;
    }

    @Override
    public int getPlayerModel() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getPlayerModel();
        }
        return 0;
    }

    @Override
    public int setPlayerAlarmModel(int model) throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.setPlayerAlarmModel(model);
        }
        return 0;
    }

    @Override
    public int getPlayerAlarmModel() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getPlayerAlarmModel();
        }
        return 0;
    }

    @Override
    public void seekTo(long currentTime) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.seekTo(currentTime);
        }
    }

    @Override
    public void playLastMusic() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.playLastMusic();
        }
    }

    @Override
    public void playNextMusic() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.playNextMusic();
        }
    }

    @Override
    public int playLastIndex() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.playLastIndex();
        }
        return 0;
    }

    @Override
    public int playNextIndex() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.playNextIndex();
        }
        return 0;
    }

    @Override
    public boolean isPlaying() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.isPlaying();
        }
        return false;
    }

    @Override
    public long getDurtion() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getDurtion();
        }
        return 0;
    }

    @Override
    public long getCurrentPlayerID() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getCurrentPlayerID();
        }
        return 0;
    }

    @Override
    public BaseAudioInfo getCurrentPlayerMusic() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getCurrentPlayerMusic();
        }
        return null;
    }

    @Override
    public String getCurrentPlayerHashKey() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getCurrentPlayerHashKey();
        }
        return null;
    }

    @Override
    public List<BaseAudioInfo> getCurrentPlayList() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getCurrentPlayList();
        }
        return null;
    }

    @Override
    public void setPlayingChannel(int channel) throws RemoteException {

    }

    @Override
    public int getPlayingChannel() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getPlayingChannel();
        }
        return 0;
    }

    @Override
    public int getPlayerState() throws RemoteException {
        if(null!=mPresenter){
            return mPresenter.getPlayerState();
        }
        return 0;
    }

    @Override
    public void onCheckedPlayerConfig() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.onCheckedPlayerConfig();
        }
    }

    @Override
    public void onCheckedCurrentPlayTask() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.onCheckedCurrentPlayTask();
        }
    }

    @Override
    public void addOnPlayerEventListener(IMusicPlayerEventListener listener) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.addOnPlayerEventListener(listener);
        }
    }

    @Override
    public void removePlayerListener(IMusicPlayerEventListener listener) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.removePlayerListener(listener);
        }
    }

    @Override
    public void removeAllPlayerListener() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.removeAllPlayerListener();
        }
    }

    @Override
    public void setPlayInfoListener(IMusicPlayerInfoListener listener) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.setPlayInfoListener(listener);
        }
    }

    @Override
    public void removePlayInfoListener() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.removePlayInfoListener();
        }
    }

    @Override
    public void changedPlayerPlayModel() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.changedPlayerPlayModel();
        }
    }

    @Override
    public void createMiniJukeboxWindow() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.createMiniJukeboxWindow();
        }
    }

    @Override
    public void startServiceForeground() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.startServiceForeground();
        }
    }

    @Override
    public void startServiceForeground1(Notification notification) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.startServiceForeground(notification);
        }
    }

    @Override
    public void startServiceForeground2(Notification notification, int notificeid) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.startServiceForeground(notification,notificeid);
        }
    }

    @Override
    public void stopServiceForeground() throws RemoteException {
        if(null!=mPresenter){
            mPresenter.stopServiceForeground();
        }
    }

    @Override
    public void stopServiceForeground1(int notificeid) throws RemoteException {
        if(null!=mPresenter){
            mPresenter.stopServiceForeground(notificeid);
        }
    }
}