package com.skilldistillery.unittesting.data;

import java.util.List;

public interface AlbumDAO {
  void addAlbum(Album album);
  Album getAlbumById(int id);
  List<Album> getAllAlbums();
}
