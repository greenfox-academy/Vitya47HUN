package com.greenfox.groot.model;

import java.util.ArrayList;
import java.util.List;

public class AwsomeMix {
  List<Song> songList;

  public AwsomeMix(){
    songList = new ArrayList<>();
  }

  public List<Song> getSongList() {
    return songList;
  }

  public void setSongList(List<Song> songList) {
    this.songList = songList;
  }

  public void addSong(Song song){
    songList.add(song);
  }
}
