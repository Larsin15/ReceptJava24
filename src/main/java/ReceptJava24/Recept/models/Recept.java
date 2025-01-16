package ReceptJava24.Recept.models;

import jakarta.validation.constraints.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Recept")
public class Recept {
    @Id
    private String id;

    @NotNull(message = "Recept namn kan inte vara null")
    @NotEmpty(message = "Recept namn kan inte vara tom")
    @Size(max = 200, message = "Recept namn kan inte innehålla mer än 200 tecken")
    private String receptName;

    @Size(max = 300, message = "Recept beskrivning kan inte innehålla mer än 200 tecken")
    private String receptDescription;

    @NotNull(message = "Ingredienserna kan inte vara null")
    @NotEmpty(message = "Ingredienserna kan inte vara tom ")
    private List<String> ingredients;


    @NotNull(message = "Tid kan inte vara null")
    @Min(value = 5, message = "Det kan inte gå fortare än 5 minuter")
    @Max(value = 10080, message = "Det ska inte ta mer än 1 vecka för fan")
    private int cookingTime;

    @NotNull(message = "Instruktioner kan inte vara null")
    @NotEmpty(message = "Instruktioner kan inte vara tom")
    @Size(max = 5000, message = "Instruktioner kan inte ha mer än 5000 tecken")
    private String instructions;

    @NotNull(message = "Svårighetsgraden kan inte vara null")
    @NotEmpty(message = "Det måste finnas en svårighetsgrad")
    @Pattern(regexp = "Lätt|Medel|Svår", message = "Endast Lätt Medel eller Svår är alternativen")
    private String difficulty;


    public Recept() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotNull(message = "Recept namn kan inte vara null") @NotEmpty(message = "Recept namn kan inte vara tom") @Size(max = 200, message = "Recept namn kan inte innehålla mer än 200 tecken") String getReceptName() {
        return receptName;
    }

    public void setReceptName(@NotNull(message = "Recept namn kan inte vara null") @NotEmpty(message = "Recept namn kan inte vara tom") @Size(max = 200, message = "Recept namn kan inte innehålla mer än 200 tecken") String receptName) {
        this.receptName = receptName;
    }

    public @Size(max = 300, message = "Recept beskrivning kan inte innehålla mer än 200 tecken") String getReceptDescription() {
        return receptDescription;
    }

    public void setReceptDescription(@Size(max = 300, message = "Recept beskrivning kan inte innehålla mer än 200 tecken") String receptDescription) {
        this.receptDescription = receptDescription;
    }

    public @NotNull(message = "Ingredienserna kan inte vara null") @NotEmpty(message = "Ingredienserna kan inte vara tom ") List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(@NotNull(message = "Ingredienserna kan inte vara null") @NotEmpty(message = "Ingredienserna kan inte vara tom ") List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @NotNull(message = "Tid kan inte vara null")
    @Min(value = 5, message = "Det kan inte gå fortare än 5 minuter")
    @Max(value = 10080, message = "Det ska inte ta mer än 1 vecka för fan")
    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(@NotNull(message = "Tid kan inte vara null") @NotEmpty(message = "Tid får inte vara tom") @Min(value = 5, message = "Det kan inte gå fortare än 5 minuter") @Max(value = 10080, message = "Det ska inte ta mer än 1 vecka för fan") int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public @NotNull(message = "Instruktioner kan inte vara null") @NotEmpty(message = "Instruktioner kan inte vara tom") @Size(max = 5000, message = "Instruktioner kan inte ha mer än 5000 tecken") String getInstructions() {
        return instructions;
    }

    public void setInstructions(@NotNull(message = "Instruktioner kan inte vara null") @NotEmpty(message = "Instruktioner kan inte vara tom") @Size(max = 5000, message = "Instruktioner kan inte ha mer än 5000 tecken") String instructions) {
        this.instructions = instructions;
    }

    public @NotNull(message = "Svårighetsgraden kan inte vara null") @NotEmpty(message = "Det måste finnas en svårighetsgrad") @Pattern(regexp = "Lätt|Medel|Svår", message = "Endast Lätt Medel eller Svår är alternativen") String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(@NotNull(message = "Svårighetsgraden kan inte vara null") @NotEmpty(message = "Det måste finnas en svårighetsgrad") @Pattern(regexp = "Lätt|Medel|Svår", message = "Endast Lätt Medel eller Svår är alternativen") String difficulty) {
        this.difficulty = difficulty;
    }
}
