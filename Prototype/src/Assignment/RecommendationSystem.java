package Assignment;

import java.util.ArrayList;
import java.util.List;

// for letting users review and modify existing recommendations
public class RecommendationSystem {

    private List<Recommendation> recommendation;

    public RecommendationSystem() {
        this.recommendation = new ArrayList<>();
    }

    public void addRecommendation(Recommendation recommendation) {
        this.recommendation.add(recommendation);
    }

    public void removeRecommendation(Recommendation recommendation) {
        this.recommendation.remove(recommendation);
    }

    public List<Recommendation> getRecommendations() {
        return recommendation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recommendation System:\n");
        for (Recommendation rec : recommendation) {
            sb.append(rec).append("\n");
        }
        return sb.toString();
    }


}
