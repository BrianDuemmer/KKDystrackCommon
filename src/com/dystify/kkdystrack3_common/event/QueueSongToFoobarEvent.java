package com.dystify.kkdystrack3_common.event;

import org.springframework.context.ApplicationEvent;


/**
 * Signals for a song to be added to the Foobar Queue
 * @author Duemmer
 *
 */
public class QueueSongToFoobarEvent extends ApplicationEvent
{
  private String song_id;
  
  public QueueSongToFoobarEvent(Object source, String song_id) {
    super(source);
    this.song_id = song_id;
  }
  
}
