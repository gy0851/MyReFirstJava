package com.ggyy0851.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author GeYao
 * @create 2020-05-25 - 19:12
 */
public class History {
    private Set<Integer> score;
    private List<String> reward;
    private String[] life;
    private Map<String,Integer> paper;

    public Map<String, Integer> getPaper() {
        return paper;
    }

    @Override
    public String toString() {
        return "History{" +
                "score=" + score +
                ", reward=" + reward +
                ", life=" + Arrays.toString(life) +
                ", paper=" + paper +
                '}';
    }

    public void setPaper(Map<String, Integer> paper) {
        this.paper = paper;
    }

    public String[] getLife() {
        return life;
    }

    public void setLife(String[] life) {
        this.life = life;
    }

    public Set<Integer> getScore() {
        return score;
    }

    public void setScore(Set<Integer> score) {
        this.score = score;
    }

    public List<String> getReward() {
        return reward;
    }

    public void setReward(List<String> reward) {
        this.reward = reward;
    }
}
