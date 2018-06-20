/**
 * 
 * This module's job is to provide an interface for the Dystrack system to
 * Foobar2000, the music player. This interface is through the command line.
 * Certain actions, such as playback control, and adding songs to the playback
 * queue. However, there isn't any sort of a feedback mechanism, so to overcome
 * this limitation, the module keeps a daemon thread running to keep track of
 * foobar's state.
 * <p/>
 * As was discovered in the original Core, losing sync between the simulator and
 * foobar itself can have disastrous consequences of obscure issues that I am
 * sure we are all already all too familiar with. As such, great care was taken
 * to keep the simulation thread running as accurately as possible.
 * 
 * @author Duemmer
 *
 */
package com.dystify.kkdystrack3_common.module.foobarIO;