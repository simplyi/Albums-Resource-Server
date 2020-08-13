/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsdeveloperblog.ws.api.albums.response;

public class AlbumRest {
    private String userId;
    private String albumId;
    private String albumTitle;
    private String albumDescription;
    private String albumUrl;

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the albumId
     */
    public String getAlbumId() {
        return albumId;
    }

    /**
     * @param albumId the albumId to set
     */
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    /**
     * @return the albumTitle
     */
    public String getAlbumTitle() {
        return albumTitle;
    }

    /**
     * @param albumTitle the albumTitle to set
     */
    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    /**
     * @return the albumDescription
     */
    public String getAlbumDescription() {
        return albumDescription;
    }

    /**
     * @param albumDescription the albumDescription to set
     */
    public void setAlbumDescription(String albumDescription) {
        this.albumDescription = albumDescription;
    }

    /**
     * @return the albumUrl
     */
    public String getAlbumUrl() {
        return albumUrl;
    }

    /**
     * @param albumUrl the albumUrl to set
     */
    public void setAlbumUrl(String albumUrl) {
        this.albumUrl = albumUrl;
    }
 
}
