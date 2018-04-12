package com.skilldistillery.unittesting.examples.controllers.album;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.skilldistillery.unittesting.data.Album;
import com.skilldistillery.unittesting.data.AlbumDAO;

public class MockAlbumDAO implements AlbumDAO {
  // public for eacy access
  public Map<Integer, Album> albums = new HashMap<>();
  
  @Override
  public void addAlbum(Album album) {
    albums.put(album.getId(), album);
    
  }

  @Override
  public Album getAlbumById(int id) {
    return albums.get(id);
  }

  @Override
  public List<Album> getAllAlbums() {
    return new ArrayList<>(albums.values());
  }
}
