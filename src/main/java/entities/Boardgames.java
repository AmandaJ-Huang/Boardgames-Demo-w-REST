package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "boardgames", schema = "bgg_data_mine")
public class Boardgames {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String thumbnail_url;
    private String primary_name;
    private Integer minplayers;
    private Integer maxplayers;
    private Integer suggest_numplayers;
    private Integer playingtime;
    private Integer suggested_playerage;
    private Float rating;
    private Long rank;
    private Float averageweight;
    private String category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public String getPrimary_name() {
        return primary_name;
    }

    public void setPrimary_name(String primary_name) {
        this.primary_name = primary_name;
    }

    public Integer getMinplayers() {
        return minplayers;
    }

    public void setMinplayers(Integer minplayers) {
        this.minplayers = minplayers;
    }

    public Integer getMaxplayers() {
        return maxplayers;
    }

    public void setMaxplayers(Integer maxplayers) {
        this.maxplayers = maxplayers;
    }

    public Integer getSuggest_numplayers() {
        return suggest_numplayers;
    }

    public void setSuggest_numplayers(Integer suggest_numplayers) {
        this.suggest_numplayers = suggest_numplayers;
    }

    public Integer getPlayingtime() {
        return playingtime;
    }

    public void setPlayingtime(Integer playingtime) {
        this.playingtime = playingtime;
    }

    public Integer getSuggested_playerage() {
        return suggested_playerage;
    }

    public void setSuggested_playerage(Integer suggested_playerage) {
        this.suggested_playerage = suggested_playerage;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Float getAverageweight() {
        return averageweight;
    }

    public void setAverageweight(Float averageweight) {
        this.averageweight = averageweight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boardgames that = (Boardgames) o;
        return Objects.equals(id, that.id) && Objects.equals(thumbnail_url, that.thumbnail_url) && Objects.equals(primary_name, that.primary_name) && Objects.equals(minplayers, that.minplayers) && Objects.equals(maxplayers, that.maxplayers) && Objects.equals(suggest_numplayers, that.suggest_numplayers) && Objects.equals(playingtime, that.playingtime) && Objects.equals(suggested_playerage, that.suggested_playerage) && Objects.equals(rating, that.rating) && Objects.equals(rank, that.rank) && Objects.equals(averageweight, that.averageweight) && Objects.equals(category, that.category);
    }

    @Override
    public String toString() {
        return "BoardGames{" +
                "id=" + id +
                ", thumbnail_url='" + thumbnail_url + '\'' +
                ", primary_name='" + primary_name + '\'' +
                ", minplayers=" + minplayers +
                ", maxplayers=" + maxplayers +
                ", suggest_numplayers=" + suggest_numplayers +
                ", playingtime=" + playingtime +
                ", suggested_playerage=" + suggested_playerage +
                ", rating=" + rating +
                ", rank=" + rank +
                ", averageweight=" + averageweight +
                ", category='" + category + '\'' +
                '}';
    }
}
