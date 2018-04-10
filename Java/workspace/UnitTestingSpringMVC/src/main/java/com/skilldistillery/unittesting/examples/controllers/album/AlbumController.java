package com.skilldistillery.unittesting.examples.controllers.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.unittesting.data.Album;
import com.skilldistillery.unittesting.data.AlbumDAO;

@Controller
public class AlbumController {
  @Autowired
  private AlbumDAO albumDao;
  
  @RequestMapping(path = "addAlbum.do", method = RequestMethod.POST)
  public String addAlbum(Album album) {
    String view = "WEB-INF/albumAdded.jsp";
    // add to DAO
    albumDao.addAlbum(album);
    
    return view;
  }
}
