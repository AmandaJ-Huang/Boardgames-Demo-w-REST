package com.bgg.xmlapi.demo.services;

import com.bgg.xmlapi.demo.entities.Boardgames;
import com.bgg.xmlapi.demo.repositories.BoardgamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardgamesService {
    private BoardgamesRepository repo;

    @Autowired
    public BoardgamesService(BoardgamesRepository repo) {
        this.repo = repo;
    }

    public Boardgames create(Boardgames bg) {
        return repo.save(bg);
    }

    public Boardgames findById(Long id) {
        return repo.findById(id).get();
    }

    public List<Boardgames> findAll() {
        Iterable<Boardgames> allGames = repo.findAll();
        List<Boardgames> bgList = new ArrayList<>();
        allGames.forEach(bgList::add);
        return bgList;
    }

    public Boardgames update(Long id, Boardgames newBGData) {
        Boardgames bgInDatabase = this.findById(id);

        bgInDatabase.setThumbnail_url(newBGData.getThumbnail_url());
        bgInDatabase.setPrimary_name(newBGData.getPrimary_name());
        bgInDatabase.setMinplayers(newBGData.getMinplayers());
        bgInDatabase.setMaxplayers(newBGData.getMaxplayers());
        bgInDatabase.setSuggest_numplayers(newBGData.getSuggest_numplayers());
        bgInDatabase.setPlayingtime(newBGData.getPlayingtime());
        bgInDatabase.setSuggested_playerage(newBGData.getSuggested_playerage());
        bgInDatabase.setRating(newBGData.getRating());
        bgInDatabase.setRank(newBGData.getRank());
        bgInDatabase.setAverageweight(newBGData.getAverageweight());
        bgInDatabase.setCategory(newBGData.getCategory());

        bgInDatabase = repo.save(bgInDatabase);

        return bgInDatabase;
    }

    public Boardgames deleteById(Long id) {
        Boardgames bgToBeDeleted = this.findById(id);
        repo.delete(bgToBeDeleted);
        return bgToBeDeleted;
    }
}
