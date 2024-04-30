/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

/**
 *
 * @author Resal
 */
public class DtoTrack {
    private int trackId;
    private String trackName;

    public DtoTrack(int trackId, String trackName) {
        this.trackId = trackId;
        this.trackName = trackName;
    }
    public DtoTrack(String trackName){
            this.trackName=trackName;
    }
    public DtoTrack(int trackId){
        this.trackId=trackId;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackNameTrack(){
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }
    
}
